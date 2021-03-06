package poo.inheritance.main;

import poo.inheritance.entities.Account;
import poo.inheritance.entities.BusinessAccount;
import poo.inheritance.entities.SavingsAccount;

public class Program {
    
    public static void main(String[] args) {
        Account acc = new Account(1001, "Bruno", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
        
        System.out.println(acc);

        //UPCASTING
        Account acc1 = bacc;
        System.out.println(acc1);

        Account acc2 = new BusinessAccount(1003, "Jorge", 0.0, 200.0);

        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        if (acc3 instanceof BusinessAccount) {

            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {

            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
