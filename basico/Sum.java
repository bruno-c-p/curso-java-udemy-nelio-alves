package basico;

import utils.Messages;

public class Sum {

    /*
     * Write a program to read two integer values, 
     * and then show on the screen the sum of
     * these numbers with a explanatory message.
     */

    public static void main(String[] args) {

        int value1 = Messages.readInt("Value 1: ");
        int value2 = Messages.readInt("Value 2: ");

        int sum = value1 + value2;

        Messages.showMSG("SUM = " + sum);
    }
}
