/*
* Shane Neyome
* 05/28/2019
*/

import java.util.Scanner;

class Exercise6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		printMatrix(n);
		
		
	}//end main
	public static void printMatrix(int n){
		int count = 0;
		for(int i = 0; i < (n * n); i++){
			System.out.print((int)(Math.random() * 2));
			count++;
			if(count == n){
				System.out.println();
				count = 0;
			}
		}
		
	}//end matrix
}//end class