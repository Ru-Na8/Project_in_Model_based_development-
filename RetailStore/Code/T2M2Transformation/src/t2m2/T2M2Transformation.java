package t2m2;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import org.json.JSONArray;
import org.json.JSONObject;

import mm6.Location;
import mm6.Route;
import mm6.RoutesModel;
import mm6.Order;
import mm6.Constraint;
import mm6.Item;

public class T2M2Transformation {

    public static void main(String[] args) {
        // Create a new RoutesModel 
        RoutesModel routesModel = new RoutesModel();

        // Define paths for input JSON and output XMI
        String jsonFilePath = "/Users/lk8545/eclipse-workspace/RoutingTool/Output/OptimalDeliveryRoutes.json";
        String outputFilePath = "/Users/lk8545/eclipse-workspace/T2M2Transformation/src/t2m2/RoutesModel.xmi";

        System.out.println("Reading JSON file from: " + Paths.get(jsonFilePath).toAbsolutePath());
        populateRoutesModelFromJSON(routesModel, jsonFilePath);

        saveRoutesModelToXML(routesModel, outputFilePath);

        printRoutes(routesModel);
    }
    private static void printRoutes(RoutesModel routesModel) {
        System.out.println("\n Routes in the model:");
        for (Route route : routesModel.getRoutes()) {
            System.out.printf("Route from %s to %s: %.2f km, %.2f minutes\n",
                    route.getFrom(), route.getTo(), route.getDistance(), route.getTravelTime());
        }

        System.out.println("\n Locations in the model:");
        for (Location location : routesModel.getLocations()) {
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

    private static void populateRoutesModelFromJSON(RoutesModel routesModel, String jsonFilePath) {
        try {
            String jsonContent = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
            JSONObject json = new JSONObject(jsonContent);
            JSONArray optimalRoutes = json.getJSONArray("optimalRoutes");
            for (int i = 0; i < optimalRoutes.length(); i++) {
                JSONObject routeJson = optimalRoutes.getJSONObject(i);

                // check "from" and "to" exist before putting values
                if (!routeJson.has("from") || !routeJson.has("to")) {
                    System.err.println("Skipping invalid route: Missing 'from' or 'to' field.");
                    continue; 
                }

                Route route = new Route();
                route.setFrom(routeJson.getString("from"));
                route.setTo(routeJson.getString("to"));
                route.setDistance(routeJson.optDouble("distance", 0.0)); 
                route.setTravelTime(routeJson.optDouble("travelTime", 0.0)); 

                routesModel.addRoute(route);
            }


            if (json.has("locations")) {
                JSONArray locationsArray = json.getJSONArray("locations");
                for (int i = 0; i < locationsArray.length(); i++) {
                    JSONObject locationJson = locationsArray.getJSONObject(i);

                    Location location = new Location();
                    location.setOrderID(locationJson.getString("orderID"));
                    location.setAddress(locationJson.getString("address"));

                    routesModel.addLocation(location);
                }
            }

            // orders and add items to them
            if (json.has("orders")) {
                JSONArray ordersArray = json.getJSONArray("orders");
                for (int i = 0; i < ordersArray.length(); i++) {
                    JSONObject orderJson = ordersArray.getJSONObject(i);

                    Order order = new Order();
                    order.setOrderID(orderJson.getString("orderID"));
                    order.setName(orderJson.getString("name"));
                    order.setDeliveryAddress(orderJson.getJSONObject("deliveryDetails").getString("address"));

                    Date parsedDate = null;
                    if (orderJson.has("deliveryDate") && !orderJson.isNull("deliveryDate")) {
                        parsedDate = parseDate(orderJson.getString("deliveryDate"));
                    } else {
                        parsedDate = new Date(); 
                    }
                    order.setDeliveryDate(parsedDate);

                    // items to each order
                    JSONArray itemsArray = orderJson.getJSONArray("items");
                    for (int j = 0; j < itemsArray.length(); j++) {
                        JSONObject itemJson = itemsArray.getJSONObject(j);

                        Item item = new Item();
                        item.setItemName(itemJson.getString("itemName"));
                        item.setQuantity(itemJson.getInt("quantity"));

                        order.addItem(item);
                    }

                    routesModel.addOrder(order);
                }
            }

            if (json.has("shortestPaths")) {
                JSONArray shortestPathsArray = json.getJSONArray("shortestPaths");
                for (int i = 0; i < shortestPathsArray.length(); i++) {
                    JSONObject shortestPathJson = shortestPathsArray.getJSONObject(i);
                    JSONArray paths = shortestPathJson.getJSONArray("shortestPaths");

                    for (int j = 0; j < paths.length(); j++) {
                        JSONObject pathJson = paths.getJSONObject(j);

                        Route shortestPath = new Route();
                        shortestPath.setFrom(pathJson.getString("from"));
                        shortestPath.setTo(pathJson.getString("to"));
                        shortestPath.setDistance(pathJson.getDouble("distance"));
                        shortestPath.setTravelTime(pathJson.getDouble("travelTime"));

                        routesModel.getShortestPaths().add(shortestPath);
                    }
                }
            }
            if (json.has("constraints")) {
                JSONObject constraintsJson = json.getJSONObject("constraints"); // Get object

                if (constraintsJson.has("deliveryConstraints")) {
                    JSONArray deliveryConstraintsArray = constraintsJson.getJSONArray("deliveryConstraints");

                    for (int i = 0; i < deliveryConstraintsArray.length(); i++) {
                        JSONObject constraintJson = deliveryConstraintsArray.getJSONObject(i);

                        Constraint constraint = new Constraint();
                        constraint.setConstraintID(constraintJson.optString("constraintID", "UNKNOWN")); // Handle missing ID
                        constraint.setMaximumWeight(constraintJson.optDouble("maximumWeight", 0.0));
                        constraint.setMaximumVolume(constraintJson.optDouble("maximumVolume", 0.0));
                        constraint.setDeliveryTimeFrameStart(constraintJson.optString("deliveryTimeFrameStart", "00:00"));
                        constraint.setDeliveryTimeFrameEnd(constraintJson.optString("deliveryTimeFrameEnd", "23:59"));

                        routesModel.addConstraint(constraint);
                    }
                } else {
                    Constraint constraint = new Constraint();
                    constraint.setConstraintID(constraintsJson.optString("constraintID", "UNKNOWN"));
                    constraint.setMaximumWeight(constraintsJson.optDouble("maximumWeight", 0.0));
                    constraint.setMaximumVolume(constraintsJson.optDouble("maximumVolume", 0.0));
                    constraint.setDeliveryTimeFrameStart(constraintsJson.optString("deliveryTimeFrameStart", "00:00"));
                    constraint.setDeliveryTimeFrameEnd(constraintsJson.optString("deliveryTimeFrameEnd", "23:59"));

                    routesModel.addConstraint(constraint);
                }
            }

                } catch (IOException e) {
                    System.err.println("Error reading JSON file: " + e.getMessage());
                    e.printStackTrace();
                }
            }

        

    //date string into a Date
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

    /**
     * Saves the RoutesModel to an XML-like file.
     */
    private static void saveRoutesModelToXML(RoutesModel routesModel, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            writer.write("<mm6:RoutesModel\n");
            writer.write("    xmi:version=\"2.0\"\n");
            writer.write("    xmlns:xmi=\"http://www.omg.org/XMI\"\n");
            writer.write("    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n");
            writer.write("    xmlns:mm6=\"http://www.example.org/mm6_1\">\n");

            for (Route route : routesModel.getRoutes()) {
                writer.write(String.format("  <routes from=\"%s\" to=\"%s\" distance=\"%.2f\" travelTime=\"%.2f\"/>\n",
                        route.getFrom(), route.getTo(), route.getDistance(), route.getTravelTime()));
            }

            for (Route path : routesModel.getShortestPaths()) {
                writer.write(String.format("  <shortestPaths from=\"%s\" to=\"%s\" distance=\"%.2f\" travelTime=\"%.2f\"/>\n",
                        path.getFrom(), path.getTo(), path.getDistance(), path.getTravelTime()));
            }

            for (Location location : routesModel.getLocations()) {
                writer.write(String.format("  <location orderID=\"%s\" address=\"%s\"/>\n",
                        location.getOrderID(), location.getAddress()));
            }

            for (Order order : routesModel.getOrders()) {
                writer.write(String.format("  <orders orderID=\"%s\" name=\"%s\" deliveryAddress=\"%s\" deliveryDate=\"%s\">\n",
                        order.getOrderID(), order.getName(), order.getDeliveryAddress(), order.getDeliveryDate()));

                for (Item item : order.getItems()) {
                    writer.write(String.format("    <items itemName=\"%s\" quantity=\"%d\"/>\n",
                            item.getItemName(), item.getQuantity()));
                }
                writer.write("  </orders>\n");
            }

            for (Constraint constraint : routesModel.getConstraints()) {
                writer.write(String.format("  <constraints constraintID=\"%s\" maxWeight=\"%.2f\" maxVolume=\"%.2f\" deliveryTimeStart=\"%s\" deliveryTimeEnd=\"%s\"/>\n",
                        constraint.getConstraintID(), constraint.getMaximumWeight(), constraint.getMaximumVolume(),
                        constraint.getDeliveryTimeFrameStart(), constraint.getDeliveryTimeFrameEnd()));
            }

            writer.write("</mm6:RoutesModel>\n");

            System.out.println(" RoutesModel saved successfully to " + filePath);
        } catch (IOException e) {
            System.err.println(" Failed to save RoutesModel to XMI: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
