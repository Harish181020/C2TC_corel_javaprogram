package day3;
import java.util.Scanner;
public class packagedemo {
 
	public static void main(String[] args) {
Scanner ob = new Scanner(System.in);
		
		String name;
		System.out.println("Enter Person Name : ");
		name = ob.next();
		System.out.println("Enter age: ");
		int age = ob.nextInt();
		
		
		
		System.out.println("Enter gender: ");
		String gender = ob.next();
		System.out.println("Enter taxable income: ");
		int income = ob.nextInt();
		
		//Person object and initialize values using setter
		Personal person = new Personal();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		//display person details using toString() method
		System.out.println(person);
		
		Taxcalculation calc = new Taxcalculation();
		calc.calculateTax(person); //tax calculation
		System.out.println("After calculating tax : ");
		System.out.println(person);

		ob.close();
	}
}
	



	


