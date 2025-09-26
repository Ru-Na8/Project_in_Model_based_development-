package t2m2;

import mm6.Route;
import mm6.RoutesModel;
import java.util.List;

public class RouteService {
    public List<Route> getRoutes(RoutesModel model) {
        return model.getRoutes(); 
    }
}
