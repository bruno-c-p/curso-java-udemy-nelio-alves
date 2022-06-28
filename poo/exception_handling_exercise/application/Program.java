package poo.exception_handling_exercise.application;

import poo.exception_handling.good_example.model.entities.Reservation;
import poo.exception_handling.good_example.model.exceptions.DomainException;
import poo.exception_handling_exercise.model.entities.Account;
import utils.Messages;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Program {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(".00");

        try {

            Account account;
            Messages.showMSG("Enter account data: ");
            int number = Messages.readInt("Account number: ");
            String holder = Messages.readString("Account holder: ");
            double initialBalance = Messages.readDouble("Initial balance: ");
            double withdrawLimit = Messages.readDouble("Withdraw limit: ");

            account = new Account(number, holder, initialBalance, withdrawLimit);

            double withdrawValue = Messages.readDouble("Enter the amount to withdraw: ");
            account.withdraw(withdrawValue);

            Messages.showMSG("New balance: " + df.format(account.getBalance()));

        } catch (DomainException e) {

            System.out.println("Withdraw error: " + e.getMessage());

        } catch (RuntimeException e) {

            System.out.println("Unexpected error");
        }
    }
}