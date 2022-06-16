package poo.constructors;

import utils.Messages;

public class AccountMain {

    public static void main(String[] args) {
        Account account;

        int number = Messages.readInt("Account number: ");
        String accountHolder = Messages.readString("Account holder: ");

        char response = Messages.readString("Is there an initial deposit (y/n)?").charAt(0);

        if (response == 'y') {

            double initialDeposit = Messages.readDouble("Enter the initial deposit value: ");
            account = new Account(number, accountHolder, initialDeposit);

        } else {

            account = new Account(number, accountHolder);
        }

        Messages.showMSG("Account Data:\n\n" + account.toString());

        double depositValue = Messages.readDouble("Enter a deposit value: ");
        account.deposit(depositValue);

        Messages.showMSG("Updated account Data:\n\n" + account.toString());

        double withdrawValue = Messages.readDouble("Enter a withdraw value: ");
        account.withdraw(withdrawValue);

        Messages.showMSG("Updated account Data:\n\n" + account.toString());
    }
}
