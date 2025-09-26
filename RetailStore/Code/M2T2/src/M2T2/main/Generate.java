/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 ******************************************************************************/
package M2T2.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import mm4.Mm4Package;
import mm5.Mm5Package;

import org.eclipse.acceleo.engine.event.IAcceleoTextGenerationListener;
import org.eclipse.acceleo.engine.generation.strategy.IAcceleoGenerationStrategy;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Entry point of the 'Generate' generation module.
 *
 * @generated
 */
public class Generate extends AbstractAcceleoGenerator {
    public static final String MODULE_FILE_NAME = "/M2T2/main/generate";
    public static final String[] TEMPLATE_NAMES = { "generateElement", "generateElementMM4" };
    private List<String> propertiesFiles = new ArrayList<>();

    public Generate() {
        // Empty implementation
    }

    public Generate(URI modelURI, File targetFolder, List<? extends Object> arguments) throws IOException {
        initialize(modelURI, targetFolder, arguments);
    }

    public Generate(EObject model, File targetFolder, List<? extends Object> arguments) throws IOException {
        initialize(model, targetFolder, arguments);
    }

    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.out.println("Arguments not valid : {model, folder}.");
            } else {
                URI modelURI = URI.createFileURI(args[0]);
                File folder = new File(args[1]);

                List<String> arguments = new ArrayList<>();
                Generate generator = new Generate(modelURI, folder, arguments);

                for (int i = 2; i < args.length; i++) {
                    generator.addPropertiesFile(args[i]);
                }

                generator.doGenerate(new BasicMonitor());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doGenerate(Monitor monitor) throws IOException {
        org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(model);
        super.doGenerate(monitor);
        try {
            combineGeneratedJsonFiles();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void combineGeneratedJsonFiles() throws IOException {
        String file1Path = "/Users/lk8545/eclipse-workspace/M2T2/tasks/routing4.json";
        String file2Path = "/Users/lk8545/eclipse-workspace/M2T2/tasks/routing5.json";
        String file3Path = "/Users/lk8545/Desktop/g5/Backup/M2T/tasks/OrderSummaryAndContent.json";
        String outputFilePath = "/Users/lk8545/eclipse-workspace/M2T2/tasks/DeliveryRoutesProblemSpecification.json";
        
        fixInvalidJson(file1Path);
        fixInvalidJson(file2Path);
        fixInvalidJson(file3Path);

        String file1Content = new String(Files.readAllBytes(Paths.get(file1Path))).trim();
        String file2Content = new String(Files.readAllBytes(Paths.get(file2Path))).trim();
        String file3Content = new String(Files.readAllBytes(Paths.get(file3Path))).trim();

        JSONObject file1Json = new JSONObject(file1Content);
        JSONObject file2Json = new JSONObject(file2Content);
        JSONObject file3Json = new JSONObject(file3Content);

        JSONObject combinedJson = new JSONObject();
        combinedJson.put("locations", file2Json.getJSONArray("locations"));
        combinedJson.put("distanceMatrix", file2Json.getJSONArray("distanceMatrix"));

        JSONObject constraints = new JSONObject();
        constraints.put("deliveryConstraints", file1Json.getJSONObject("constraints").getJSONArray("deliveryConstraints"));
        constraints.put("orderConstraints", file1Json.getJSONObject("constraints").getJSONArray("orderConstraints"));
        combinedJson.put("constraints", constraints);

        // Add orders and items from OrderSummaryAndContent.json
        JSONArray orders = file3Json.getJSONArray("orders");
        for (int i = 0; i < orders.length(); i++) {
            JSONObject order = orders.getJSONObject(i);
            JSONArray items = order.getJSONArray("items");

            // Add items to each order 
            for (int j = 0; j < items.length(); j++) {
                JSONObject item = items.getJSONObject(j);
                item.put("orderID", order.getString("orderID"));
            }
        }
        combinedJson.put("orders", orders);

        Files.write(Paths.get(outputFilePath), combinedJson.toString(4).getBytes());
        System.out.println("Combined JSON written to: " + outputFilePath);
    }


    private String fixInvalidJson(String filePath) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filePath))).trim();

        System.out.println("Original Content:\n" + content);

        String[] arrayKeys = {"deliveryConstraints", "orderConstraints", "locations", "distanceMatrix"};

        for (String key : arrayKeys) {
            int keyIndex = content.indexOf("\"" + key + "\": ");
            if (keyIndex != -1) {
                int valueStartIndex = keyIndex + key.length() + 4;

                // Ensure the value starts with '['
                if (content.charAt(valueStartIndex) != '[') {
                    content = content.substring(0, valueStartIndex) + "[" + content.substring(valueStartIndex);
                   
                }
            }
        }

        content = content.replaceAll(",\\s*\\}", "}");
        content = content.replaceAll(",\\s*\\]", "]");

        System.out.println("Fixed Content:\n" + content);

        Files.write(Paths.get(filePath), content.getBytes());

        return content;
    }

    private JSONObject parseJson(String content) {
        try {
            return new JSONObject(content);
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to parse JSON: " + e.getMessage(), e);
        }
    }

    @Override
    public List<IAcceleoTextGenerationListener> getGenerationListeners() {
        return super.getGenerationListeners();
    }

    @Override
    public IAcceleoGenerationStrategy getGenerationStrategy() {
        return super.getGenerationStrategy();
    }

    @Override
    public void registerPackages(ResourceSet resourceSet) {
        super.registerPackages(resourceSet);
        resourceSet.getPackageRegistry().put(Mm4Package.eNS_URI, Mm4Package.eINSTANCE);
        resourceSet.getPackageRegistry().put(Mm5Package.eNS_URI, Mm5Package.eINSTANCE);
    }

    @Override
    public void registerResourceFactories(ResourceSet resourceSet) {
        super.registerResourceFactories(resourceSet);
    }

    @Override
    public String getModuleName() {
        return MODULE_FILE_NAME;
    }

    @Override
    public String[] getTemplateNames() {
        return TEMPLATE_NAMES;
    }

    @Override
    public List<String> getProperties() {
        return propertiesFiles;
    }

    @Override
    public void addPropertiesFile(String propertiesFile) {
        propertiesFiles.add(propertiesFile);
    }
}
