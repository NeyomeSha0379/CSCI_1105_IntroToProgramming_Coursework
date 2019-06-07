/*
* Shane Neyome
* 06/06/2019
*/

import java.util.Scanner;

class Exercise7_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] myList = new int[10];	 
		System.out.println("Enter 10 numbers separated by a space: ");
		//Allows you to type in multiple ints.
		for(int i = 0; i < 10; i++){
			myList[i] = input.nextInt();
		}//end of for loop
		int[] myArray = eliminateDuplicates(myList);
		int count = myArray.length;
		System.out.println("The number of distinct numbers is " + count);
			for(int i = 0; i < count; i++){
				System.out.print(myArray[i] + " ");
			}//end of for loop	
	}//end of main
	public static int[] eliminateDuplicates(int[] list){
		int count = 0;
		int[] myList2 = new int[list.length];
		for(int i = 0; i < list.length; i++){
			boolean inArray = false;
			for(int j = 0; j < myList2.length; j++ ){
				if(list[i] == myList2[j]){
					inArray = true;
					break;
				}//end of if
					
				
			}//end of for loop nested
				if(!inArray){
					myList2[count] = list[i];
					count++;
				}//end of if
		}// end of for loop
			int[] listwithoutextras = new int[count];
			for (int i = 0; i < listwithoutextras.length;i++){
			listwithoutextras[i] = myList2[i];
			}
		return listwithoutextras;
 	}

}//end of class