package poo.exception_handling.horrible_example.application;

import poo.exception_handling.horrible_example.model.entities.Reservation;
import utils.Messages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        int roomNumber = Messages.readInt("Room number: ");
        Date checkIn = sdf.parse(Messages.readString("Check-in date (dd/MM/yyyy): "));
        Date checkOut = sdf.parse(Messages.readString("Check-out date (dd/MM/yyyy): "));

        if (!checkOut.after(checkIn)) {

            System.out.println("Error in reservation: Check-out date must be after check-in date");

        } else {

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation.toString());

            System.out.println("Enter data to update the reservation");
            checkIn = sdf.parse(Messages.readString("Check-in date (dd/MM/yyyy): "));
            checkOut = sdf.parse(Messages.readString("Check-out date (dd/MM/yyyy): "));

            Date now = new Date();

            if (checkIn.before(now) || checkOut.before(now)) {

                System.out.println("Error in reservation: Reservation dates for update must be future");

            } else if (!checkOut.after(checkIn)) {

                System.out.println("Error in reservation: Check-out date must be after check-in date");

            } else {

                reservation.updateChecks(checkIn, checkOut);
                System.out.println("Reservation: " + reservation.toString());
            }
        }
    }
}
