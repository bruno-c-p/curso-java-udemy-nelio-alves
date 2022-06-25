package poo.polimorfism_exercise.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import poo.polimorfism_exercise.entities.ImportedProduct;
import poo.polimorfism_exercise.entities.Product;
import poo.polimorfism_exercise.entities.UsedProduct;
import utils.Messages;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        List<Product> products = new ArrayList<>();

        int n = Messages.readInt("Enter the number of products: ");

        for (int i = 1; i <= n; i++) {

            Messages.showMSG("Product #" + i + " data: ");
            char productType = Messages.readChar("Common, used or imported (C/U/I): ");

            String name = Messages.readString("Name: ");
            double price = Messages.readDouble("Price: ");

            switch (productType) {
                case 'I':
                    double customsFee = Messages.readDouble("Customs fee: ");
                    products.add(new ImportedProduct(name, price, customsFee));
                    break;
                case 'C':
                    products.add(new Product(name, price));
                    break;
                case 'U':
                    Date manufactureDate = sdf.parse(Messages.readString("Manufacture date: "));
                    products.add(new UsedProduct(name, price, manufactureDate));
                    break;
                default:
                    Messages.showMSG("Choose a valid option: ");
            }

        }

        StringBuilder priceTags = new StringBuilder();
        priceTags.append("PRICE TAGS:\n");

        for (Product product : products) {

             priceTags.append(product.priceTag());
        }

        Messages.showMSG(priceTags.toString());
    }
}
