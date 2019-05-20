/*
* Shane Neyome
* 05/20/2019
*/
import java.util.Scanner;

public class Exercise3_3 {
	
	
	public static void main(String[] args) {
		// Set Variables
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Value for a:");
		double a = input.nextDouble();
		
		System.out.println("Enter Value for b:");
		double b = input.nextDouble();
		
		System.out.println("Enter Value for c:");
		double c = input.nextDouble();	
		
		System.out.println("Enter Value for d:");
		double d = input.nextDouble();	
		
		System.out.println("Enter Value for e:");
		double e = input.nextDouble();
		
		System.out.println("Enter Value for f:");
		double f = input.nextDouble();
		
		if (a * d - b * c == 0)
			System.out.println("The equation has no solution.");
		else if (a * d - b * c != 0){
			System.out.println("X = " + ((e * d) - (b * f)) / ((a * d) - (b * c)));
			System.out.println("Y = " + ((a * f) - (e * c)) / ((a * d) - (b * c)));
		}
	}
}