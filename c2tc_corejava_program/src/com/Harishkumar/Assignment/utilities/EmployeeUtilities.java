package com.Harishkumar.Assignment.utilities;
import com.Harishkumar.Assignment.Employees.*;
public class EmployeeUtilities {
	
	public static void printEmployeeDetails(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());

        if (emp instanceof Manager) {
            System.out.println("Department: " + ((Manager) emp).getDepartment());
        } else if (emp instanceof Developer) {
            System.out.println("Language: " + ((Developer) emp).getProgrammingLanguage());
        }
    }

    public static void increaseSalary(Employee emp, double percentage) {
        double newSalary = emp.getSalary() * (1 + percentage / 100);
        emp.setSalary(newSalary);
        System.out.println("Salary updated to: " + emp.getSalary());
    }
}
