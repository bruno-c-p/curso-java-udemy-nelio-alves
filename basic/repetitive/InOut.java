package basic.repetitive;

import utils.Messages;

public class InOut {

    /*
     * Read an integer value N. This value will be the amount of integer values ​​X
     * that will be read next. Show how many of these X values ​​are
     * within the range [10,20] and how many are outside the range.
     * (use the word "in" for inside the range, and "out" for outside the range).
     */

    public static void main(String[] args) {

        int in = 0;
        int out = 0;

        int value = Messages.readInt("Value: ");

        for (int i = 0; i < value; i++) {

            int valueX = Messages.readInt("ValueX: ");

            if (valueX >= 10 && valueX <= 20) {

                in++;

            } else {

                out++;
            }
        }

        Messages.showMSG("IN: " + in + "\nOUT: " + out);
    }
}
