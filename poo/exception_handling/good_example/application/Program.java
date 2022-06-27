package poo.exception_handling.good_example.application;

import poo.exception_handling.good_example.model.entities.Reservation;
import poo.exception_handling.good_example.model.exceptions.DomainException;
import utils.Messages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {

            int roomNumber = Messages.readInt("Room number: ");
            Date checkIn = sdf.parse(Messages.readString("Check-in date (dd/MM/yyyy): "));
            Date checkOut = sdf.parse(Messages.readString("Check-out date (dd/MM/yyyy): "));

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation.toString());

            System.out.println("Enter data to update the reservation");
            checkIn = sdf.parse(Messages.readString("Check-in date (dd/MM/yyyy): "));
            checkOut = sdf.parse(Messages.readString("Check-out date (dd/MM/yyyy): "));

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation.toString());

        } catch (ParseException e) {

            System.out.println("Invalid date format");

        } catch (DomainException e) {

            System.out.println("Error in reservation: " + e.getMessage());

        } catch (RuntimeException e) {

            System.out.println("Unexpected error");
        }
    }
}
