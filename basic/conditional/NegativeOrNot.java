package basic.conditional;

import utils.Messages;

public class NegativeOrNot {

    /*
     * Make a program to read an integer,
     * and then tell if this number is negative or not.
     */

    public static void main(String[] args) {

        int number = Messages.readInt("Number: ");

        if (number < 0) {

            Messages.showMSG(number + " is negative");

        } else {

            Messages.showMSG(number + " is positive");
        }
    }
}
