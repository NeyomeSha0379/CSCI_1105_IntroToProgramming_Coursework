/*
 * Shane Neyome
 * 05/16/19
 */
import java.util.Scanner;

public class Exercise2_1 {

	public static void main(String[] args) {
	//declare variables
		Scanner input = new Scanner(System.in);
		double Celsius = 0.0;
		double Fahrenheit = 0.0;
		System.out.println("Enter degree in Celsius :");
		Celsius = input.nextDouble();
		
		//convert to fahrenheit
		Fahrenheit = (9.0 / 5) * Celsius + 32;
		
		//display results
		System.out.println(Celsius + " " + "is" + " "+ Fahrenheit + " " + "in fahrenheit.");

	}

}
