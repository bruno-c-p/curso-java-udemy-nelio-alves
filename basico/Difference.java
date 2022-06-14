package basico;

import utils.Messages;

public class Difference {

    /*
     * Write a program to read four integer values ​​A, B, C and D. 
     * Then calculate and show the difference of the product
     * of A and B by the product of C and D according to the formula: 
     * 
     * DIFFERENCE = (A * B - C * D).
     */

    public static void main(String[] args) {

        int a = Messages.readInt("Value A: ");
        int b = Messages.readInt("Value B: ");
        int c = Messages.readInt("Value C: ");
        int d = Messages.readInt("Value D: ");

        int difference = (a * b) - (c * d);

        Messages.showMSG("DIFFERENCE = " + difference);
    }
}
