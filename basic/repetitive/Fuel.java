package basic.repetitive;

import utils.Messages;

public class Fuel {

    /*
     * A gas station wants to determine which of its products is preferred by its
     * customers.
     * Write an algorithm to read the type of fuel filled (coded as follows:
     * 1.Alcohol 2.Gasoline 3.Diesel 4.End).
     * If the user enters an invalid code (outside the range 1 to 4),
     * a new code must be requested (until it is valid).
     * The program will be terminated when the code entered is number 4.
     * The message: "THANK YOU SO MUCH" must be written and
     * the number of customers who filled up each type of fuel.
     */

    public static void main(String[] args) {

        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        int type = 0;

        do {

            type = Messages.readInt("Inform your favorite fuel:\n1.Alcohol\n2.Gasoline\n3.Diesel\n4.End");

            switch (type) {

                case 1:
                    alcohol += 1;
                    break;

                case 2:
                    gasoline += 1;
                    break;

                case 3:
                    diesel += 1;
                    break;

                default:
                    Messages.showMSG("Insert a valid code");
                    break;
            }

        } while (type != 4);

        Messages.showMSG(
                "THANK YOU SO MUCH!" + "\nAlcohol: " + alcohol + "\nGasoline: " + gasoline + "\nDiesel: " + diesel);
    }
}
