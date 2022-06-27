package poo.array.employee;

import java.util.ArrayList;
import java.util.List;

import utils.Messages;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        int employeesQuantity = Messages.readInt("How many employees will be registered? ");

        for (int i = 0; i < employeesQuantity; i++) {

            Messages.showMSG("Employee #" + (i + 1));

            int id = Messages.readInt("Employee #" + (i + 1) + " id:");

            while (hasId(employees, id)) {

                id = Messages.readInt("Id already taken. Try again: ");
            }

            String name = Messages.readString("Employee #" + (i + 1) + " name:");

            double salary = Messages.readDouble("Employee #" + (i + 1) + " salary:");

            Employee employee = new Employee(id, name, salary);

            employees.add(employee);
        }

        int idSalaryIncrease = Messages.readInt("Enter the employee id that will have salary increase: ");

        Employee emp = employees.stream().filter(x -> x.getId() == idSalaryIncrease).findFirst().orElse(null);

        if (emp == null) {

            System.out.println("This id does not exist!");
        } else {

            double percentage = Messages.readDouble("Enter the percentage: ");
            emp.increaseSalary(percentage);
        }

        StringBuilder sb = new StringBuilder();

        sb.append("List of employees:");

        for (Employee employee : employees) {
            sb.append(employee.toString()).append("\n");
        }

        Messages.showMSG(sb.toString());
    }

    public static boolean hasId(List<Employee> list, int id) {

        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
