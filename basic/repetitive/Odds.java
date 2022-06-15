package basic.repetitive;

import utils.Messages;

public class Odds {

    /*
     * Read an integer value X (1 <= X <= 1000).
     * Then display the odd numbers from 1 to X,
     * one value per line, including the X,
     * if applicable.
     */

    public static void main(String[] args) {

        int value = Messages.readInt("Value: ");

        if (value < 1 || value > 1000) {

            Messages.showMSG("Invalid value!");

        } else {

            for (int i = 0; i < value; i++) {

                if (i % 2 == 1) {

                    System.out.println(i);
                }
            }
        }
    }
}
