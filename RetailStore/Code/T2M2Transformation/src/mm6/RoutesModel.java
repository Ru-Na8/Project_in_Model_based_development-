package mm6;

import java.util.ArrayList;
import java.util.List;

public class RoutesModel {
    private List<Route> routes;
    private List<Location> locations;
    private List<Route> shortestPaths; 
    private List<Order> orders; 
    private List<Constraint> constraints; 

    public RoutesModel() {
        this.routes = new ArrayList<>();
        this.locations = new ArrayList<>();
        this.shortestPaths = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.constraints = new ArrayList<>();
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void addRoute(Route route) {
        this.routes.add(route);
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void addLocation(Location location) {
        this.locations.add(location);
    }

    public List<Route> getShortestPaths() {
        return shortestPaths;
    }

    public void addShortestPath(Route route) {
        this.shortestPaths.add(route);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Constraint> getConstraints() {
        return constraints;
    }

    public void addConstraint(Constraint constraint) {
        this.constraints.add(constraint);
    }

    @Override
    public String toString() {
        return "RoutesModel{" +
                "routes=" + routes +
                ", locations=" + locations +
                ", shortestPaths=" + shortestPaths +
                ", orders=" + orders +
                ", constraints=" + constraints +
                '}';
    }
}
