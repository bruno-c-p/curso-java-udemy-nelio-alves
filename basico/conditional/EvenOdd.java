package basico.conditional;

import utils.Messages;

public class EvenOdd {

    /*
     * Write a program to read an integer 
     * and tell if this number is even or odd.
     */

    public static void main(String[] args) {

        int number = Messages.readInt("Number: ");

        if (number % 2 == 0) {

            Messages.showMSG(number + " is even");

        } else {
            
            Messages.showMSG(number + " is odd");
        }
    }
}
