package basico.conditional;

import java.text.DecimalFormat;

import utils.Messages;

public class ItemTable {

    /*
     * Based on the table below, 
     * write a program that reads the code of an item and
     * the quantity of that item. Next, 
     * calculate and display the amount of the bill.
     * 
     * |----------------------------------|
     * | CODE | NAME             | PRICE  |
     * |----------------------------------|
     * | 1    - Hot Dog          - $ 4.00 |
     * | 2    - Salad hamburguer - $ 4.50 |
     * | 3    - Bacon hamburguer - $ 5.00 |
     * | 4    - Toast bread      - $ 2.00 |
     * | 5    - Soda             - $ 1.50 |
     * ------------------------------------
     * 
     */

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        int code = Messages.readInt("Inform the code: ");
        int quantity = Messages.readInt("Inform the quantity: ");
        double bill = 0;

        switch (code) {
            case 1:
                bill = 4.0 * quantity;
                break;
            case 2:
                bill = 4.5 * quantity;
                break;
            case 3:
                bill = 5.0 * quantity;
                break;
            case 4:
                bill = 2.0 * quantity;
                break;
            case 5:
                bill = 1.5 * quantity;
                break;
            default:
                Messages.showMSG("Inform a valid code!");
                break;
        }

        Messages.showMSG("Bill: $ " + df.format(bill));
    }
}
