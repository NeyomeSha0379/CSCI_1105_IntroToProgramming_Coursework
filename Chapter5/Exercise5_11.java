import java.nio.file.*;

/*
* Shane Neyome
* 05/22/2019
*/

class Exercise5_11 {
	public static void main(String[] args) {
		//set up
		int lineC = -1;
		
		System.out.println("Counting from 100 - 200" + "\nDivisible by 5 or 6, but not both.");
		System.out.println("----------------------------------");
		
			for(int count = 100; count <= 200; count++){
				if (count % 5 == 0 && count % 6 != 0 || count % 6 == 0 && count % 5 != 0){
					System.out.print(count + " ");
					lineC = (lineC + 1) % 10;
					if(lineC == 9)
						System.out.println();
				}//if statment.
			}//for loop
	}
			
		
		
}
