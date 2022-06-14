package basico;

import java.text.DecimalFormat;

import utils.Messages;

public class Salary {

    /*
     * Make a program that reads the number of an employee, 
     * his number of hours worked, the amount he receives for
     * hour and calculates the salary of that employee. 
     * Next, show the employee's number and salary, 
     * with two places decimals.
     */

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(".00");

        int employeeNumber = Messages.readInt("Employee number: ");
        double hoursWorked = Messages.readDouble("Hours worked: ");
        double amountPerHour = Messages.readDouble("Amount per hour: ");

        double salary = hoursWorked * amountPerHour;

        Messages.showMSG("Employee number: " + employeeNumber + "\nSalary: $ " + df.format(salary));
    }
}
