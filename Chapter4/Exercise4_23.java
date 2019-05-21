/*
* Shane Neyome
* 05/20/2019
*/

import java.util.Scanner;

class Exercise4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee's name:");
		String set1 = input.next();
		
		System.out.println("Enter number of hours worked:");
		double hours = input.nextDouble();
		
		System.out.println("Enter hourly pay rate:");
		double pay = input.nextDouble();
		
		System.out.println("Enter federal tax withholding rate:");
		double ftax = input.nextDouble();
		
		System.out.println("Enter state tax withholding rate:");
		double stax = input.nextDouble();
		
		double gross = (hours * pay);
		double net = (gross - ((gross * ftax) + (gross * stax)));
		
		System.out.println("Employee Name: " + set1);
		
		System.out.println("Hours worked: " + hours);
		
		System.out.println("Pay Rate: " + pay);
		
		System.out.println("Gross Pay: " + gross);
		
		System.out.println("Deduction: ");
		System.out.println("Federal Withholding" + "( " + (ftax * 100.0)  + " ):" + "$" + (gross * ftax));
		System.out.println("State withholding" + "( " + (stax * 100.0) + " ):" + "$" + (gross * stax));
	
		System.out.println("Net Pay: " + net);
		
	}
}