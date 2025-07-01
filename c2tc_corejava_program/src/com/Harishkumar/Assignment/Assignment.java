package com.Harishkumar.Assignment;
import com.Harishkumar.Assignment.Employees.*;
import com.Harishkumar.Assignment.utilities.*;

public class Assignment {
	public static void main(String[] args) {
		
	    
        Manager manager = new Manager("Alice", "M101", 90000, "HR");
        Developer developer = new Developer("Bob", "D202", 80000, "Java");

        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.increaseSalary(manager, 10);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(developer);
        EmployeeUtilities.increaseSalary(developer, 15);
    }
}
