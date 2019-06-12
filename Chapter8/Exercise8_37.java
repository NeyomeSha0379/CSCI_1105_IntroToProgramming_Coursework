/*
* Shane Neyome
* 06/11/2019
*/

import java.util.Scanner;

class Exercise8_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int count = 0;
			String[][] usa = {
				{"ARIZONA" , "PHOENIX"},
				{"ARKANSAS" , "LITTLE ROCK"},
				{"CALIFORNIA" , "SACRAMENTO"},
				{"COLORADO" , "DENVER"},
				{"CONNECTICUT" , "HARTFORD"},
				{"GEORGIA" , "ATLANTA"},
				{"DELAWARE" , "DOVER"},
				{"FLORIDA" , "TALLAHSSEE"},
				{"TEXAS" , "AUSTIN"},
				{"UTAH" , "SALT LAKE CITY"}};
			for(int i = 0; i < 10;i++){
				System.out.println("Please enter the capital of " + usa[i][0] + ":");
				String cap = input.nextLine().toUpperCase();
				if(cap.equals(usa[i][1])){
					System.out.println("Correct");
					count++;
				}
				else{
					System.out.println("Incorrect");
				}
			}
		System.out.println("You got " + count + "/10d");
	}
}