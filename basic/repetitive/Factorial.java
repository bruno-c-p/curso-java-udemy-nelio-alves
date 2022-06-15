package basic.repetitive;

import utils.Messages;

public class Factorial {

    /*
     * Read a value N. Calculate and write its respective factorial.
     * Factorial of N = N * (N-1) * (N-2) * (N-3) * ... * 1.
     * Remember that, by definition, a factorial of 0 is 1.
     */

    public static void main(String[] args) {

        int n = Messages.readInt("N: ");

        int fat = 1;

        for (int i = 1; i <= n; i++) {

            fat = fat * i;
        }

        Messages.showMSG("Result: " + fat);
    }
}
