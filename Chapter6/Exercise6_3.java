/*
* Shane Neyome
* 05/28/2019
*/

import java.util.Scanner;

class Exercise6_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		
		System.out.println("Please enter a number : ");
		num = input.nextInt();
		boolean pal = isPalindrome(num);
		if(pal){
			System.out.println(num + " is a palindrome.");
		}
		else {
			System.out.println(num + " is not a palindrome.");
		}
	}//end of main
	public static int reverse(int num){
		int rnum = 0;
		while( num != 0){
			rnum = rnum * 10;
			rnum = rnum + num % 10;
			num = num / 10;
		}//end of while
		return rnum;
	}//end of reverse
	public static boolean isPalindrome(int num){
		int pnum = reverse(num);
		if(pnum == num){
			return true;
		}
		return false;
		
	}//end of boolean
}//end of class