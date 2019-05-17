/*
 * Shane Neyome
 * 05/16/19
 */
import java.util.Scanner;
public class Exercise2_13 {

	public static void main(String[] args) {
		// Set variables
		Scanner input = new Scanner(System.in);
		double Interest = 0.05 / 12;
		double Savings = 0.0;
		
		System.out.println("Enter the amount you would like to save :$");
		Savings = input.nextDouble();
		double basesaving = Savings;
		Savings = (Savings + basesaving)* (1 + Interest);
		Savings = (Savings + basesaving)* (1 + Interest);
		Savings = (Savings + basesaving)* (1 + Interest);
		Savings = (Savings + basesaving)* (1 + Interest);
		Savings = (Savings + basesaving)* (1 + Interest);
		Savings = (Savings + basesaving)* (1 + Interest);
		System.out.println("New balance is" + " " + "$" + Savings);
	}

}
