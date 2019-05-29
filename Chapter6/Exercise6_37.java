/*
* Shane Neyome
* 05/28/2019
*/

import java.util.Scanner;

class Exercise6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		System.out.println("Enter how long you want the number to be: ");
		int w = input.nextInt();
		System.out.println(format(n , w));
		
	}//end main
	public static String format(int n, int w){
		int count = 0;
		int length = String.valueOf(n).length();
		String out = "";
		for(int i = 0; i < (w - length); i++){
			out += 0;
			count++;
			if(count == (w - length)){
				out += n;
			}//end of if

		}//end of loop
		return out;
	}//end of format
}//end class