package basic.conditional;

import utils.Messages;

public class Multiples {

    /*
     * Read 2 integer values ​​(A and B). Afterwards, the program should show a
     * message "Are Multiples" or "Not Multiples", indicating whether
     * the values ​​read are multiples of each other.
     * 
     * Attention: the numbers must be able to be typed in
     * ascending or descending order.
     */

    public static void main(String[] args) {

        int a = Messages.readInt("A: ");
        int b = Messages.readInt("B: ");

        if (a % b == 0 || b % a == 0) {

            Messages.showMSG("Multiples");

        } else {

            Messages.showMSG("Not Multiples");
        }
    }
}
