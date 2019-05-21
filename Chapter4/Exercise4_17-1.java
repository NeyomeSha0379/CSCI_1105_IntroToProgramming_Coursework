/*
* Shane Neyome
* 05/20/2019
*/

import java.util.Scanner;

class Exercise4_17 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year:");
		int year = input.nextInt();
		
		System.out.println("Enter a month:");
		String set1 = input.next();
		
		if (set1 .equals("Jan"))
			System.out.println(set1 + " " + year + " " + "has 31 days.");
		
		if (set1 .equals("Feb")){
			if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0))
				System.out.println(set1 + " " + year + " " + "has 29 days.");{
	}//Check if leap year				
		else
			System.out.println(set1 + " " + year + " " + "has 28 days.");
}//Set1 = feb
		
		if (set1 .equals("Mar"))
			System.out.println(set1 + " " + year + " " + "has 31 days.");
		
		if (set1 .equals("Apr"))
			System.out.println(set1 + " " + year + " " + "has 30 days.");
		
		if (set1 .equals("May"))
			System.out.println(set1 + " " + year + " " + "has 31 days.");
		
		if (set1 .equals("Jun"))
			System.out.println(set1 + " " + year + " " + "has 30 days.");
		
		if (set1 .equals("Jul"))
			System.out.println(set1 + " " + year + " " + "has 31 days.");
		
		if (set1 .equals("Aug"))
			System.out.println(set1 + " " + year + " " + "has 31 days.");
		
		if (set1 .equals("Sep"))
			System.out.println(set1 + " " + year + " " + "has 30 days.");
		
		if (set1 .equals("Oct"))
			System.out.println(set1 + " " + year + " " + "has 31 days.");
		
		if (set1 .equals("Nov"))
			System.out.println(set1 + " " + year + " " + "has 30 days.");
		
		if (set1 .equals("Dec"))
			System.out.println(set1 + " " + year + " " + "has 31 days.");	
			
					
	}
}