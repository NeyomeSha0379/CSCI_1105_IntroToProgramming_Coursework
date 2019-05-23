/*
* Shane Neyome
* 05/23/2019
*/

import java.util.Scanner;

class Exercise5_49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		
		System.out.println("Enter a word: ");
		String word = input.next().toUpperCase();
		int i = word.length();
	
		for (int j = 0; j < i; j++){
			if(word.charAt(j) == 'A' || word.charAt(j) == 'E' || word.charAt(j) == 'I' || word.charAt(j) == 'O' || word.charAt(j) == 'U'){
				count++;
		
			}
		
		}	
		if(count == 1){
		System.out.println(word + " has " + count + " vowel");
		
		}
		else {
			System.out.println(word + " has " + count + " vowels");
		}
	}
}