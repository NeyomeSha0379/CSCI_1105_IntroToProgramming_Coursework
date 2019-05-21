/*
* Shane Neyome
* 05/20/2019
*/
import java.util.Scanner;

class Exercise4_1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length from the center to the vertex:");
		double radius = input.nextDouble();
		
		double s = ((2 * radius) * Math.sin(Math.PI / 5));
		
		double area = ((5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5)));
		System.out.printf("The area of the pentagon is %5.2f" , area);	
	}
}