package poo.composition_exercise.entities;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import poo.composition_exercise.entities.enums.OrderStatus;

public class Order {
    private static DecimalFormat df = new DecimalFormat();

    private Date moment = new Date();
    private OrderStatus orderStatus;
    private Client client;
    private List<OrderItem> orderedItems = new ArrayList<>();
    
    public Order() {
    }

    public Order(OrderStatus orderStatus, Client client) {
        this.orderStatus = orderStatus;
        this.client = client;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order status: " + this.getOrderStatus() + "\n");
        sb.append(client.toString() + "\n");
        sb.append("Order items:\n");

        for (OrderItem orderItem : orderedItems) {

            sb.append(orderItem.toString() + "\n");
        }

        sb.append("Total price: $" + df.format(total()));

        return sb.toString();
    }

    public double total() {
        double sum = 0;

        for (OrderItem orderItem : orderedItems) {

            sum += orderItem.subTotal();
        }

        return sum;
    }

    public void addItem(OrderItem orderItem) {
        orderedItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        orderedItems.remove(orderItem);
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderedItems() {
        return orderedItems;
    }
}
