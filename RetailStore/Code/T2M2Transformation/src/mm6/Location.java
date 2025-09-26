package mm6;

import java.util.List;

public class Location {
    private String orderID;
    private String address;
    private List<Order> orders; // List to store related orders

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Location{" +
                "orderID='" + orderID + '\'' +
                ", address='" + address + '\'' +
                ", orders=" + orders +
                '}';
    }
}
