package poo.interfaces_.problem.application;

import poo.interfaces_.problem.model.entities.CarRental;
import poo.interfaces_.problem.model.entities.Vehicle;
import poo.interfaces_.problem.model.services.BrazilTaxService;
import poo.interfaces_.problem.model.services.RentalService;
import utils.Messages;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

    public static void main(String[] args) throws ParseException {

        DecimalFormat df = new DecimalFormat("0,000.00");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        Messages.showMSG("Enter rental data: ");

        String carModel = Messages.readString("Car model: ");
        Date start = sdf.parse(Messages.readString("Pickup (dd/MM/yyyy hh:ss): "));
        Date finish = sdf.parse(Messages.readString("Return (dd/MM/yyyy hh:ss): "));

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        double pricePerHour = Messages.readDouble("Enter price per hour:");
        double pricePerDay = Messages.readDouble("Enter price per day:");

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
        rentalService.processInvoice(carRental);

        String invoice = "INVOICE:\n" +
                "Basic payment: " + df.format(carRental.getInvoice().getBasicPayment()) +
                "Tax: " + df.format(carRental.getInvoice().getTax()) +
                "Total payment: " + df.format(carRental.getInvoice().getTotalPayment());

        Messages.showMSG(invoice);
    }
}
