package routingTool;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class RoutingTool {

    public static void main(String[] args) {
        try {
            String filePath = "/Users/lk8545/eclipse-workspace/M2T2/tasks/DeliveryRoutesProblemSpecification.json";

            String jsonContent = new String(Files.readAllBytes(Paths.get(filePath)));
            JSONObject spec = new JSONObject(jsonContent);

            JSONArray locations = spec.getJSONArray("locations");
            JSONArray distanceMatrix = spec.getJSONArray("distanceMatrix");
            JSONArray deliveryConstraints = spec.getJSONObject("constraints").getJSONArray("deliveryConstraints");
            JSONArray orderConstraints = spec.getJSONObject("constraints").getJSONArray("orderConstraints");
            JSONArray orders = spec.getJSONArray("orders");
            // Compute shortest paths for all locations
            JSONArray allShortestPaths = computeShortestPaths(distanceMatrix);

            JSONArray optimalRoutes = computeOptimalRoutes(distanceMatrix);

            // list data into a new JSON object
            JSONObject outputData = new JSONObject();
            outputData.put("locations", locations);
            outputData.put("distanceMatrix", distanceMatrix);
            outputData.put("shortestPaths", allShortestPaths);
            outputData.put("constraints", new JSONObject()
                    .put("deliveryConstraints", deliveryConstraints)
                    .put("orderConstraints", orderConstraints));
            outputData.put("orders", orders);
            outputData.put("optimalRoutes", optimalRoutes);

            String fullOutputFilePath = "/Users/lk8545/eclipse-workspace/RoutingTool/Output/OptimalDeliveryRoutes.json";
            Files.write(Paths.get(fullOutputFilePath), outputData.toString(4).getBytes());
            System.out.println("Final output JSON written to: " + fullOutputFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Compute the shortest paths for all locations using Dijkstra's Algorithm.
     */    
    private static JSONArray computeShortestPaths(JSONArray distanceMatrix) {
        Map<String, Map<String, Double>> graph = buildGraph(distanceMatrix);
        JSONArray allShortestPaths = new JSONArray();

        for (String start : graph.keySet()) {
            Map<String, Double> shortestPaths = dijkstra(graph, start);
            JSONArray shortestPathsArray = new JSONArray();

            for (String to : shortestPaths.keySet()) {
                if (!to.equals(start)) { // Skip the starting location itself
                    JSONObject routeObject = new JSONObject();
                    routeObject.put("from", start);
                    routeObject.put("to", to);
                    routeObject.put("distance", shortestPaths.get(to));

                    // Match travel time with the distance
                    for (int i = 0; i < distanceMatrix.length(); i++) {
                        JSONObject route = distanceMatrix.getJSONObject(i);
                        if (route.getString("from").equals(start) && route.getString("to").equals(to)) {
                            routeObject.put("travelTime", route.getDouble("travelTime"));
                            break;
                        }
                    }

                    shortestPathsArray.put(routeObject);
                }
            }

            allShortestPaths.put(new JSONObject().put("from", start).put("shortestPaths", shortestPathsArray));
        }

        return allShortestPaths;
    }

     
    private static JSONArray computeOptimalRoutes(JSONArray distanceMatrix) {
        JSONArray optimalRoutes = new JSONArray();

        for (int i = 0; i < distanceMatrix.length(); i++) {
            JSONObject route = distanceMatrix.getJSONObject(i);
            optimalRoutes.put(route);
        }

        return optimalRoutes;
    }

    // Build a graph representation from the distance matrix.
     
    private static Map<String, Map<String, Double>> buildGraph(JSONArray distanceMatrix) {
        Map<String, Map<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < distanceMatrix.length(); i++) {
            JSONObject route = distanceMatrix.getJSONObject(i);
            String from = route.getString("from");
            String to = route.getString("to");
            double distance = route.getDouble("distance");

            graph.putIfAbsent(from, new HashMap<>());
            graph.get(from).put(to, distance);
        }

        return graph;
    }

    // calculate the shortest paths using Dijkstra's Algorithm
     
    private static Map<String, Double> dijkstra(Map<String, Map<String, Double>> graph, String start) {
        Map<String, Double> distances = new HashMap<>();
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparingDouble(distances::get));
        Set<String> visited = new HashSet<>();

        for (String node : graph.keySet()) {
            distances.put(node, Double.MAX_VALUE);
        }
        distances.put(start, 0.0);
        pq.add(start);

        while (!pq.isEmpty()) {
            String current = pq.poll();
            visited.add(current);

            for (Map.Entry<String, Double> neighbor : graph.getOrDefault(current, new HashMap<>()).entrySet()) {
                if (!visited.contains(neighbor.getKey())) {
                    double newDist = distances.get(current) + neighbor.getValue();
                    if (newDist < distances.get(neighbor.getKey())) {
                        distances.put(neighbor.getKey(), newDist);
                        pq.add(neighbor.getKey());
                    }
                }
            }
        }

        return distances;
    }
}
