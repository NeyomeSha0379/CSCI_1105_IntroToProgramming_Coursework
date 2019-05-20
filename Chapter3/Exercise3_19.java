/*
* Shane Neyome
* 05/20/2019
*/
import java.util.Scanner;

class Exercise3_19 {
	public static void main(String[] args) {
		// Set variables
		Scanner input = new Scanner(System.in);
	
	System.out.println("Enter value for side 1:");	
	double side1 = input.nextDouble();
	
	System.out.println("Enter value for side 2:");
	double side2 = input.nextDouble();
	
	System.out.println("Enter value for side 3:");
	double side3 = input.nextDouble();
	
	if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
	System.out.println("The perimeter is " + (side1 + side2 + side3));
	else {
		System.out.println("Input Invalid!");1
		}
	
	}
}