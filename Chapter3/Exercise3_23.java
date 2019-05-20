/*
* Shane Neyome
* 05/20/2019
*/
import java.util.Scanner;

class Exercise3_23 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter value for x:");
		double x = input.nextDouble();
	
		System.out.println("Enter value for y:");
		double y = input.nextDouble();
		
		if (x <= (10 / 2) && y <= (5.0 / 2) )
			System.out.println("Point " + "(" + x + "," + y + ")" + " is in the rectangle.");
		else {
			System.out.println("Point " + "(" + x + "," + y + ")" + " is not in the rectangle.");
		}
		
	}
}