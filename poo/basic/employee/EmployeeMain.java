package poo.basic.employee;

import utils.Messages;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.name = Messages.readString("Name: ");
        emp.grossSalary = Messages.readDouble("Gross salary: ");
        emp.tax = Messages.readDouble("Tax: ");

        Messages.showMSG("Employee: " + emp);

        double percentage = Messages.readDouble("Which percentage to increase salary? ");
        emp.increaseSalary(percentage);

        Messages.showMSG("Updated data: " + emp);
    }
}
