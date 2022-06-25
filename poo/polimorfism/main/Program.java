package poo.polimorfism.main;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import poo.polimorfism.entities.Employee;
import poo.polimorfism.entities.OutsourcedEmployee;
import utils.Messages;

public class Program {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(".00");
        List<Employee> list = new ArrayList<>();

        int n = Messages.readInt("Enter the number of employees: ");

        for (int i = 1; i <= n; i++) {

            Messages.showMSG("Employee #" + i + " data:");
            char ch = Messages.readString("Outsourced (y/n)? ").charAt(0);
            String name = Messages.readString("Name: ");
            int hours = Messages.readInt("Hours: ");
            double valuePerHour = Messages.readDouble(("Value per hour: "));

            if (ch == 'y') {

                double additionalCharge = Messages.readDouble("Additional charge: ");

                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));

            } else {

                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        Messages.showMSG("PAYMENTS:");
        
        for (Employee emp : list) {

            Messages.showMSG(emp.getName() + " - $ " + df.format(emp.payment()));
        }
    }
}
