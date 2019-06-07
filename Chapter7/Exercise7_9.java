/*
* Shane Neyome
* 06/06/2019
*/

import java.util.Scanner;

class Exercise7_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] myList = new double[10];
		System.out.println("Enter 10 numbers separated by a space: ");
		
		for(int i = 0; i < 10; i++){
			myList[i] = input.nextDouble();
			
		}
		System.out.println("The minimum number is: " + min(myList));
	}//end main
	public static double min(double[] minarray){
		double min = 99999999999999999.9;
		for(int i = 0; i < minarray.length; i++ ){
			if(min > minarray[i]){
				min = minarray[i];
			}//end of if
		}//end of for loop
		return min;
	}//end of min
}//end class