package basico.conditional;

import utils.Messages;

public class Interval {

    /*
     * You must write a program that reads any value 
     * and displays a message saying in which of the
     * following intervals ([0.25], (25.50], (50.75], (75.100]) this value is found.
     * Obviously if the value is not in none of these ranges,
     * the message “Out of range” should be printed.
     */

    public static void main(String[] args) {

        int value = Messages.readInt("Value: ");

        if (value >= 0 && value <= 25) {

            Messages.showMSG("value between 0 & 25");

        } else if (value > 25 && value <= 50) {

            Messages.showMSG("value between 25 & 50");

        } else if (value > 50 && value <= 75) {

            Messages.showMSG("value between 50 & 75");

        } else if (value > 75 && value <= 100) {

            Messages.showMSG("value between 50 & 75");

        } else {

            Messages.showMSG("Out of range!");
        }
    }
}
