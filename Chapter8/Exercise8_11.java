/*
* Shane Neyome
* 06/11/2019
*/

import java.util.Scanner;


class Exercise8_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 511: ");
		int n = input.nextInt(); 
		String m = Integer.toBinaryString(n);
		int count = 0;
		int count2 = 0;
		int length = String.valueOf(m).length();
		String out = "";
		if(length != 9){
			for (int i = 0; i < (9 - length); i++) {
				out += 0;
				count++;
				if(count == (9 - length)){
					out += m;
				}//end of if

			}//end of for
		}//end of if
		else{
			out = m;
		}
		for (int i =0; i < out.length(); i++) {
			if(out.charAt(i) == ('1')){
				System.out.print("T ");
				count2++;
			}
			else {
				System.out.print("H ");
				count2++;
			}
			if(count2 == 3){
				System.out.println();
				count2 = 0;
			}
		}
	}
		
}
		
		
			
		
	
