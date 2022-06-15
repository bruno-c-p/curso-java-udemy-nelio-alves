package basico.repetitive;

import utils.Messages;

public class Password {

    /*
     * Write a program that repeats reading a password until it is valid.
     * For each incorrect password read, write the message "Password Invalid".
     * When the password is correctly informed, the message "Access Allowed"
     * must be printed and the algorithm terminated.
     * Assume that the correct password is the value 2022.
     */

    public static void main(String[] args) {

        int password = 0;

        password = Messages.readInt("Password: ");

        while (password != 2022) {

            password = Messages.readInt("Invalid Password: ");
        }

        Messages.showMSG("Access Allowed!");
    }
}
