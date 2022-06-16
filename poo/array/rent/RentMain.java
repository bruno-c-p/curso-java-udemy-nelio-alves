package poo.array.rent;

import utils.Messages;

public class RentMain {

    public static void main(String[] args) {

        Rent[] vect = new Rent[10];
        int n = Messages.readInt("How many rooms will be rented? ");

        for (int i = 1; i <= n; i++) {

            Messages.showMSG("Rent #" + i + ":");
            String name = Messages.readString("Name: ");
            String email = Messages.readString("Email: ");
            int room = Messages.readInt("Room: ");

            vect[room] = new Rent(name, email);
        }

        Messages.showMSG("Busy rooms:");

        for (int i = 0; i < 10; i++) {

            if (vect[i] != null) {

                Messages.showMSG(i + ": " + vect[i]);
            }
        }
    }
}
