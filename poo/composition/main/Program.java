package poo.composition.main;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import poo.composition.entities.Department;
import poo.composition.entities.HourContract;
import poo.composition.entities.Worker;
import poo.composition.entities.enums.WorkerLevel;
import utils.Messages;

public class Program {
    
    public static void main(String[] args) throws ParseException {

        DecimalFormat df = new DecimalFormat(".00");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String departmentName = Messages.readString("Enter department's name: ");
        Messages.showMSG("Enter worker data: ");
        String workerName = Messages.readString("Enter name: ");
        String workerLevel = Messages.readString("Enter worker level: ");
        double baseSalary = Messages.readDouble("Base salary: ");

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        int numberOfContracts = Messages.readInt("How many contracts to this worker? ");

        for (int i = 1; i <= numberOfContracts; i++) {

            Messages.showMSG("Enter contract #" + i + " data: ");

            Date contractDate = sdf.parse(Messages.readString("Date (DD/MM/YYYY): "));

            double valuePerHour = Messages.readDouble("Value per hour: ");

            int hours = Messages.readInt("Duration (Hours): ");

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        String monthAndYear = Messages.readString("Enter month and year to calculate income (MM/YYYY): ");
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        StringBuilder result = new StringBuilder();
        result.append("Name: " + worker.getName());
        result.append("Department: " + worker.getDepartment().getName());
        result.append("Income for: " + monthAndYear + ": " + df.format(worker.income(year, month)));
        
        Messages.showMSG(result.toString());
    }
}
