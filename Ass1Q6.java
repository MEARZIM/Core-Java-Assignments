/**
 * 
 */
package javaAssingment1And2;

import java.util.Scanner;

/**
 * Write a program for determining whether a number is a Pearson number or not.
	(e.g. 145 is a Pearson number because 1! + 4! + 5! =145.)
 */
public class Ass1Q6 {

	/**
	 * @param args
	 */
	
	// Factorial Function
	static int fact(int n) {
		int fact=1;
		for(int i=n; i>0;i--) {
			fact*=i;
		}
		return fact;
	}
	
	
	public static void main(String[] args) {
		
		int n=1,ans=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		n=sc.nextInt();
		
		
		int cpy=n; //copy of the input for evaluation
		
		//calculating digit by digit
		while(cpy!=0) {
			int rem = cpy %10;
			ans +=fact(rem); // Function Calling and Value assign
			cpy = cpy/10;
		}
		// Checking
		if(ans==n) {
			System.out.println("Number "+n+" is a Pearson number.");
		}else {
			System.out.println("Number "+n+" is not a Pearson number.");
		}
		sc.close();
	}

}
/*
 *Output1 - >
Enter a Number: 
145
Number 145 is a Pearson number.


 *Output2 - >
Enter a Number: 
777
Number 777 is not a Pearson number.


 *Output3 - > 
 Enter a Number: 
22
Number 22 is not a Pearson number.


*/
