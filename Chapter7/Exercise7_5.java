/*
* Shane Neyome
* 06/05/2019
*/

import java.util.Scanner;

class Exercise7_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] myList = new int[10];
		int[] myList2 = new int[myList.length];
		int count = 0;
		
	 
		System.out.println("Enter 10 numbers separated by a space: ");
		//Allows you to type in multiple ints.
		for(int i = 0; i < 10; i++){
			myList[i] = input.nextInt();
		}
		for(int i = 0; i < myList.length; i++){
			boolean inArray = false;
			for(int j = 0; j < myList2.length; j++ ){
				if(myList[i] == myList2[j]){
					inArray = true;
					break;
				}
					
				
			}
			if(!inArray){
				myList2[count] = myList[i];
				count++;
			}
		}
		System.out.println("The number of distinct numbers is " + count);
		for(int i = 0; i < count; i++){
			System.out.print(myList2[i] + " ");
		}
	}
}