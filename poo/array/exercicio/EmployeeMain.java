package poo.array.exercicio;

import java.util.ArrayList;
import java.util.List;

import utils.Mensagens;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        int employeesQuantity = Mensagens.leInteiro("How many employees will be registered? ");

        for (int i = 0; i < employeesQuantity; i++) {

            Mensagens.mostraMSG("Employee #" + (i + 1));

            int id = Mensagens.leInteiro("Employee #" + (i + 1) + " id:");

            while (hasId(employees, id)) {

                id = Mensagens.leInteiro("Id already taken. Try again: ");
            }

            String name = Mensagens.leString("Employee #" + (i + 1) + " name:");

            double salary = Mensagens.leDouble("Employee #" + (i + 1) + " salary:");

            Employee employee = new Employee(id, name, salary);

            employees.add(employee);
        }

        int idSalaryIncrease = Mensagens.leInteiro("Enter the employee id that will have salary increase: ");

        Employee emp = employees.stream().filter(x -> x.getId() == idSalaryIncrease).findFirst().orElse(null);

		if (emp == null) {

			System.out.println("This id does not exist!");
		}

		else {
            
			double percentage = Mensagens.leDouble("Enter the percentage: ");
			emp.increaseSalary(percentage);
		}

        StringBuilder sb = new StringBuilder();

        sb.append("List of employees:");

        for (Employee employee : employees) {

			sb.append(employee.toString() + "\n");
		}

        Mensagens.mostraMSG(sb.toString());
    }

    public static boolean hasId(List<Employee> list, int id) {

		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
