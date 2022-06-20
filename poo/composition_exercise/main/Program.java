package poo.composition_exercise.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import poo.composition_exercise.entities.Client;
import poo.composition_exercise.entities.Order;
import poo.composition_exercise.entities.OrderItem;
import poo.composition_exercise.entities.Product;
import poo.composition_exercise.entities.enums.OrderStatus;
import utils.Messages;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Messages.showMSG("Enter client data: ");

        String clientName = Messages.readString("Name: ");
        String clientEmail = Messages.readString("Email: ");
        Date birthDate = sdf.parse(Messages.readString("Birth date (DD/MM/YYYY): "));

        Client client = new Client(clientName, clientEmail, birthDate);

        Messages.showMSG("Enter order data: ");

        String orderStatus = Messages.readString("Status: ");

        Order order = new Order(OrderStatus.valueOf(orderStatus), client);

        int items = Messages.readInt("How many items to this order?");

        for (int i = 1; i <= items; i++) {

            Messages.showMSG("Enter #" + i + " data:");

            String productName = Messages.readString("Product name: ");
            double productPrice = Messages.readDouble("Product price: ");
            int productQuantity = Messages.readInt("Quantity: ");

            Product product = new Product(productName, productPrice);

            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);

            order.addItem(orderItem);
        }

        Messages.showMSG(order.toString());
    }
}
