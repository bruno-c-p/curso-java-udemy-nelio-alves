package basico.sequential_structure;

import java.text.DecimalFormat;

import utils.Messages;

public class Product {

    /*
     * Make a program to read the the quantity of product 1, the unit value of product 1, 
     * the quantity of product 2 and the unit value of product 2.
     * Calculate and display the amount to be paid.
     */

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(".00");

        int quantity1 = Messages.readInt("Product #1 quantity: ");
        double unitValue1 = Messages.readDouble("Product #1 unit value: ");

        int quantity2 = Messages.readInt("Product #2 quantity: ");
        double unitValue2 = Messages.readDouble("Product #2 unit value: ");

        double bill = (quantity1 * unitValue1) + (quantity2 * unitValue2);

        Messages.showMSG("BILL: $ " + df.format(bill));
    }
}
