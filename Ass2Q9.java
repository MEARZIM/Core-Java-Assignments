package javaAssingment1And2;

/*
	Write a program to find the elements, a [i, j] in a two-dimensional array which are
	maximum element to the ith row and jth column.
*/

public class Ass2Q9 {
	static void displayMatrix(int row, int col,int arr[][]) {
		// 2-D array display logic
		System.out.println("The given matrix");
		for (int i=0; i<row; i++) {
			for (int j=0; j<col;j++) {
				System.out.print( arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int arr[][] = {{10,20,25},{30,40,10},{50,60,40}}; // 2-d array
		
		displayMatrix(3,3,arr); // function calling
		
		
		//Logic for Calculate maximum of each row
		for (int i=0; i<3; i++) {
			int max=arr[i][0];
			for (int j=0; j<3; j++) {
				 if (max<arr[i][j]) {
					 max = arr[i][j];
				 }
			}
			System.out.println("Maximum element in row is:  " + (i + 1) + ": " + max);
		}
		System.out.println();
		
		//Logic for Calculate maximum of each column
		for (int i=0; i<3; i++) {
			int max=arr[0][i];
			for (int j=1; j<3; j++) {
				 if (max<arr[j][i]) {
					 max = arr[j][i];
				 }
			}
			System.out.println("Maximum element in column " + (i + 1) + ": " + max);
		}
		
	}
}

/*
 * Output->
The given matrix
10 20 25 
30 40 10 
50 60 40 

Maximum element in row is:  1: 25
Maximum element in row is:  2: 40
Maximum element in row is:  3: 60

Maximum element in column 1: 50
Maximum element in column 2: 60
Maximum element in column 3: 40

 */
