package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class SegundoExercicioProgam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		
		System.out.println("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("\nEmployee: " + employee);
		
		System.out.println("\nWhich percentage to increase salary?  ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println("\nUpdated data: " + employee);
		
      sc.close();
	}

}
