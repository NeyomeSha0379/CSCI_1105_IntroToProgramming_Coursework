/*
* Shane Neyome
* 06/10/2019
*/


class Exercise8_5 {
	public static void main(String[] args) {
		double[][] one = {
			{1.0 , 2.0 , 3.0},
			{4.0, 5.0, 6.0},
			{7.0, 8.0, 9.0}};
		double[][] two = {
			{0.0, 2.0, 4.0},
			{1.0, 4.5, 2.2},
			{1.1, 4.3, 5.2}}; 
		double[][] three = addMatrix(one , two);
		for(int i = 0; i < three.length; i++){
			for(int j = 0; j < three.length; j++){
				System.out.print(three[i][j] + " ");
			}//nested
		System.out.println();
		}//forloop
	}//end main
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] c = new double[3][3];
		for(int i = 0; i < a[0].length; i++){
			for(int j = 0; j < b[0].length; j++){
				c[i][j] = a[i][j] + b[i][j];
			}//end nested for loop
		
		}//end for loop
		return c;
	}//end method
	
}//end class