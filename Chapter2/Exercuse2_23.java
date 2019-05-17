/*
 * Shane Neyome
 * 05/16/19
 */
import java.util.Scanner;

public class Exercuse2_23 {

	public static void main(String[] args) {
		//setting variables
		Scanner input = new Scanner(System.in);
		double distance = 0.0;
		double mpg = 0.0;
		double ppg = 0.0;
		double cost = 0.0;
		
		System.out.println("Enter the driving distance:");
		distance = input.nextDouble();
		System.out.println("Enter miles per gallon:");
		mpg = input.nextDouble();
		System.out.println("Enter price per gallon:");
		ppg = input.nextDouble();
		
		cost = (distance / mpg) * ppg;
		
		System.out.println("Total cost of drive is" + " " + cost);

	}

}
