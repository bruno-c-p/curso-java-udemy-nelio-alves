package basico.repetitive;

import utils.Messages;

public class Divisors {

    /*
     * Read an integer N and calculate all its divisors.
     */

    public static void main(String[] args) {

        int number = Messages.readInt("Number: ");

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                System.out.println(i);
            }
        }
    }
}
