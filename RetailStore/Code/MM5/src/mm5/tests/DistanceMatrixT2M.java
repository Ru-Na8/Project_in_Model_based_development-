package mm5.tests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

import mm5.Distance;
import mm5.DistanceMatrix;
import mm5.Location;
import mm5.Mm5Factory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class DistanceMatrixT2M {
    public static void main(String[] args) {
        Mm5Factory factory = Mm5Factory.eINSTANCE;

        DistanceMatrix distanceMatrix = factory.createDistanceMatrix();
        String jsonFilePath = "/Users/lk8545/Desktop/g5/Backup/M2T/tasks/OrderLocations_MapsAPIRequest.json";
        System.out.println("Looking for file at: " + Paths.get(jsonFilePath).toAbsolutePath());

        List<Location> locations = getLocationsFromJSON(factory, jsonFilePath);

        // Add locations
        distanceMatrix.getLocation().addAll(locations);

        // multiple routes between each pair of locations
        for (int i = 0; i < distanceMatrix.getLocation().size(); i++) {
            for (int j = 0; j < distanceMatrix.getLocation().size(); j++) {
                if (i != j) {
                    Location from = distanceMatrix.getLocation().get(i);
                    Location to = distanceMatrix.getLocation().get(j);

                    // Route 1
                    Distance route1 = factory.createDistance();
                    route1.setFrom(from);
                    route1.setTo(to);
                    route1.setRouteID("R1");
                    double minDistance1 = 5.0;
                    double maxDistance1 = 10.0;
                    route1.setDistance(minDistance1 + Math.random() * (maxDistance1 - minDistance1));
                
                    // Calculate matched travel time to the distance (e.g., 1.8 minutes per km)
                    double travelTimeFactor1 = 2; // Average per km in minutes
                    route1.setTravelTime(route1.getDistance() * travelTimeFactor1);
                    distanceMatrix.getDistance().add(route1);

                    // Route 2
                    Distance route2 = factory.createDistance();
                    route2.setFrom(from);
                    route2.setTo(to);
                    route2.setRouteID("R2");
                 // Random distance (10-25 km)
                    double minDistance2 = 10.0;
                    double maxDistance2 = 25.0;
                    route2.setDistance(minDistance2 + Math.random() * (maxDistance2 - minDistance2));
                
                    double travelTimeFactor2 = 2; 
                    route2.setTravelTime(route2.getDistance() * travelTimeFactor2);
                    distanceMatrix.getDistance().add(route2);
                }
            }
        }

        // list all routes
        for (Location from : distanceMatrix.getLocation()) {
            for (Location to : distanceMatrix.getLocation()) {
                if (!from.equals(to)) {
                    List<Distance> routes = distanceMatrix.getDistance().stream()
                            .filter(route -> route.getFrom().equals(from) && route.getTo().equals(to))
                            .collect(Collectors.toList());

                    for (Distance route : routes) {
                        System.out.printf("Optimal Route from %s to %s: %.2f km, %.2f minutes\n",
                                route.getFrom().getOrderID(),
                                route.getTo().getOrderID(),
                                route.getDistance(),
                                route.getTravelTime());
                    }
                }
            }
        }

        String outputXMIFilePath = "/Users/lk8545/eclipse-workspace/M2T2/tasks/DistanceMatrix.xmi";
        saveDistanceMatrixToXMI(distanceMatrix, outputXMIFilePath);
    }


    private static List<Location> getLocationsFromJSON(Mm5Factory factory, String jsonFilePath) {
        List<Location> locations = new ArrayList<>();
        try {
            // Read content
            String content = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
            JSONObject jsonData = new JSONObject(content);

            if (!jsonData.has("locations")) {
                System.err.println("JSON does not contain 'locations' key. Please check the file.");
                return locations; 
            }

            JSONArray locationsArray = jsonData.getJSONArray("locations");
            for (int i = 0; i < locationsArray.length(); i++) {
                JSONObject locationJSON = locationsArray.getJSONObject(i);

                Location location = factory.createLocation();
                location.setOrderID(locationJSON.optString("orderID", "UNKNOWN"));
                location.setAddress(locationJSON.optString("address", "UNKNOWN"));

                locations.add(location);
            }

        } catch (IOException e) {
            System.err.println("Error reading JSON file: " + e.getMessage());
            e.printStackTrace();
        }
        return locations;
    }

 
    private static void saveDistanceMatrixToXMI(DistanceMatrix distanceMatrix, String filePath) {
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

        ResourceSet resourceSet = new ResourceSetImpl();
        URI fileURI = URI.createFileURI(new File(filePath).getAbsolutePath());
        Resource resource = resourceSet.createResource(fileURI);

        resource.getContents().add(distanceMatrix);

        try {
            // save to the XMI file
            resource.save(null);
            System.out.println("DistanceMatrix saved successfully to " + filePath);
        } catch (IOException e) {
            System.err.println("Failed to save DistanceMatrix to XMI: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
