package javaAssingment1And2;

import java.util.Scanner;

/*
	The nos. in the sequence 0 1 1 2 3 5 8 13 21............. are called Fibonacci nos. 
	Write a program to print the first n (to be taken as input) Fibonacci nos.
*/

public class Ass1Q3 {
	public static void main(String[] args) {
		
		System.out.print("Enter the term number of terms : ");
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();
		
		int firstPositionValue = 0, secondPositionValue = 1;
		
		System.out.print("The series are : "+ firstPositionValue + " " + secondPositionValue + " ");
		
		for (int i=3; i<=nos; i++) {
			int values = firstPositionValue + secondPositionValue;
			System.out.print(values + " ");
			//Swapping
			firstPositionValue = secondPositionValue;
			secondPositionValue = values;		
		}
		
		sc.close();
	}
}

/*


 * Output 1->
Enter the term number of terms : 10
The series are : 0 1 1 2 3 5 8 13 21 34 


 * Output 2->
Enter the term number of terms : 6
The series are : 0 1 1 2 3 5 
 */