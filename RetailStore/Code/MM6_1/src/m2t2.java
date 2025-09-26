import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import org.json.JSONArray;
import org.json.JSONObject;

import mm6_1.Location;
import mm6_1.Route;
import mm6_1.RoutesModel;
import mm6_1.Order;
import mm6_1.Item;
import mm6_1.Mm6_1Factory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class m2t2 {

    public static void main(String[] args) {
        Mm6_1Factory factory = Mm6_1Factory.eINSTANCE;

        RoutesModel routesModel = factory.createRoutesModel();

        String jsonFilePath = "/Users/lk8545/eclipse-workspace/RoutingTool/Output/OptimalDeliveryRoutes.json";
        String outputXMIFilePath = "/Users/lk8545/Desktop/MM6_1/src/RoutesModel.xmi";

        System.out.println("Reading JSON file from: " + Paths.get(jsonFilePath).toAbsolutePath());
        populateRoutesModelFromJSON(factory, routesModel, jsonFilePath);

        // save RoutesModel to xmi file
        saveRoutesModelToXMI(routesModel, outputXMIFilePath);

        printRoutes(routesModel);
    }

    // convert a date string into a `Date` 
     
    private static Date parseDate(String dateString) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            System.err.println("Error parsing date: " + dateString);
            e.printStackTrace();
            return null; 
        }
    }

   
    private static void populateRoutesModelFromJSON(Mm6_1Factory factory, RoutesModel routesModel, String jsonFilePath) {
        try {
            String jsonContent = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
            JSONObject json = new JSONObject(jsonContent);

            JSONArray optimalRoutes = json.getJSONArray("optimalRoutes");
            for (int i = 0; i < optimalRoutes.length(); i++) {
                JSONObject routeJson = optimalRoutes.getJSONObject(i);

                Route route = factory.createRoute();
                route.setFrom(routeJson.getString("from"));
                route.setTo(routeJson.getString("to"));
                route.setDistance(routeJson.getDouble("distance"));
                route.setTravelTime(routeJson.getDouble("travelTime"));

                routesModel.getRoutes().add(route);
            }

            if (json.has("shortestPaths")) {
                JSONArray shortestPathsArray = json.getJSONArray("shortestPaths");
                for (int i = 0; i < shortestPathsArray.length(); i++) {
                    JSONObject shortestPathJson = shortestPathsArray.getJSONObject(i);
                    JSONArray paths = shortestPathJson.getJSONArray("shortestPaths");

                    for (int j = 0; j < paths.length(); j++) {
                        JSONObject pathJson = paths.getJSONObject(j);

                        Route shortestPath = factory.createRoute();
                        shortestPath.setFrom(pathJson.getString("from"));
                        shortestPath.setTo(pathJson.getString("to"));
                        shortestPath.setDistance(pathJson.getDouble("distance"));
                        shortestPath.setTravelTime(pathJson.getDouble("travelTime"));

                        routesModel.getShortestPaths().add(shortestPath);
                    }
                }
            }

            if (json.has("locations")) {
                JSONArray locationsArray = json.getJSONArray("locations");
                for (int i = 0; i < locationsArray.length(); i++) {
                    JSONObject locationJson = locationsArray.getJSONObject(i);

                    Location location = factory.createLocation();
                    location.setOrderID(locationJson.getString("orderID"));
                    location.setAddress(locationJson.getString("address"));

                    routesModel.getLocation().add(location);
                }
            }

            if (json.has("orders")) {
                JSONArray ordersArray = json.getJSONArray("orders");
                for (int i = 0; i < ordersArray.length(); i++) {
                    JSONObject orderJson = ordersArray.getJSONObject(i);

                    Order order = factory.createOrder();
                    order.setOrderID(orderJson.getString("orderID"));
                    order.setName(orderJson.getString("name"));
                    order.setDeliveryAddress(orderJson.getJSONObject("deliveryDetails").getString("address"));

                    Date parsedDate = null;
                    if (orderJson.has("deliveryDate") && !orderJson.isNull("deliveryDate")) {
                        String dateString = orderJson.getString("deliveryDate");
                        parsedDate = parseDate(dateString);
                    } else {
                        System.out.println("Warning: Missing deliveryDate for order " + order.getOrderID());
                        parsedDate = new Date(); 
                    }
                    order.setDeliveryDate(parsedDate);

                    if (orderJson.has("items")) {
                        JSONArray itemsArray = orderJson.getJSONArray("items");
                        for (int j = 0; j < itemsArray.length(); j++) {
                            JSONObject itemJson = itemsArray.getJSONObject(j);

                            Item item = factory.createItem();
                            item.setItemName(itemJson.getString("itemName"));
                            item.setQuantity(itemJson.getInt("quantity"));

                            order.getItems().add(item);
                        }
                    }

                    routesModel.getOrders().add(order);
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading JSON file: " + e.getMessage());
            e.printStackTrace();
        }
    }


    private static void saveRoutesModelToXMI(RoutesModel routesModel, String filePath) {
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

        ResourceSet resourceSet = new ResourceSetImpl();
        URI fileURI = URI.createFileURI(new File(filePath).getAbsolutePath());
        Resource resource = resourceSet.createResource(fileURI);

        resource.getContents().add(routesModel);

        try {
            resource.save(null);
            System.out.println("RoutesModel saved successfully to " + filePath);
        } catch (IOException e) {
            System.err.println("Failed to save RoutesModel to XMI: " + e.getMessage());
            e.printStackTrace();
        }
    }

 
    private static void printRoutes(RoutesModel routesModel) {
        System.out.println("\n Routes in the model:");
        for (Route route : routesModel.getRoutes()) {
            System.out.printf("Route from %s to %s: %.2f km, %.2f minutes\n",
                    route.getFrom(), route.getTo(), route.getDistance(), route.getTravelTime());
        }

        System.out.println("\n Locations in the model:");
        for (Location location : routesModel.getLocation()) {
            System.out.printf("Location %s at %s\n", location.getOrderID(), location.getAddress());
        }
        System.out.println("\n Shortest Paths in Model:");
        for (Route path : routesModel.getShortestPaths()) {
            System.out.printf("Path from %s to %s: %.2f km, %.2f minutes\n",
                    path.getFrom(), path.getTo(), path.getDistance(), path.getTravelTime());
        }


        System.out.println("\n Orders in the model:");
        for (Order order : routesModel.getOrders()) {
            System.out.printf("Order %s - %s, Delivery to: %s, Date: %s\n",
                    order.getOrderID(), order.getName(), order.getDeliveryAddress(), order.getDeliveryDate());

            System.out.println("  Items:");
            for (Item item : order.getItems()) {
                System.out.printf("    - %s: %d units\n", item.getItemName(), item.getQuantity());
            }
        }
    }
}