/*
* Shane Neyome
* 05/28/2019
*/

import java.util.Scanner;

class Exercise6_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a time in milliseconds : ");
		long millis = input.nextLong();
		System.out.println(convertMillis(millis));
	
	}//end main
	public static String convertMillis(long millis){
		long secondst = millis / 1000;
		long secondsc = secondst % 60;
		long minutest = secondst / 60;
		long minutesc = minutest % 60;
		long hourst = minutest / 60;
		return("Time is: " + hourst + ":" + minutesc + ":" + secondsc);
	}//end convertmillis
	
}//end class