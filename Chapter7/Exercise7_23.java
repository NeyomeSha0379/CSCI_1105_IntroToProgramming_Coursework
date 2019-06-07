/*
* Shane Neyome
* 06/06/2019
*/

class Exercise7_23 {
	public static void main(String[] args) {
		boolean[] lockers = new boolean[100];
		for(int i = 1; i <= lockers.length; i++){
			for(int j = (i - 1); j < lockers.length; j += i){
				lockers[j] = !lockers[j];
				
			}//end of nested for loop
		}//end of for loop
		for(int n = 0; n < lockers.length; n++){
			if(lockers[n] == true){
				System.out.print((n + 1) + " ");
			}
		}
		
		
	}//end of main
}//end of class