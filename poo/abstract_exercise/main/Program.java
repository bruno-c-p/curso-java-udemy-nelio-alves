package poo.abstract_exercise.main;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import poo.abstract_exercise.entities.LegalPerson;
import poo.abstract_exercise.entities.NaturalPerson;
import poo.abstract_exercise.entities.Person;
import utils.Messages;

public class Program {
    
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("0,000.00");
        List<Person> people = new ArrayList<>();

        int n = Messages.readInt("Enter the number of tax payers: ");

        for (int i = 1; i <= n; i++) {

            Messages.showMSG("Tax payer #" + i + " data: ");
            char personType = Messages.readChar("Individual or company (I/C)?");

            String name = Messages.readString("Name: ");
            double annualIncome = Messages.readDouble("Anual income: ");

            if (personType == 'I') {

                double healthExpenditures = Messages.readDouble("Health expenditures: ");
                people.add(new NaturalPerson(name, annualIncome, healthExpenditures));

            } else {

                int numberOfEmployees = Messages.readInt("Number of employees: ");
                people.add(new LegalPerson(name, annualIncome, numberOfEmployees));
            }
        }

        StringBuilder peopleList = new StringBuilder();
        peopleList.append("TAXES PAID: ");

        for (Person person : people) {

            peopleList.append(person.toString()).append("\n");
        }
        
        double totalTaxes = 0;

        for (Person person : people) {
            totalTaxes += person.taxCalculation();
        }

        Messages.showMSG(peopleList.toString() + "\nTOTAL TAXES: $ " + df.format(totalTaxes));
    }
}
