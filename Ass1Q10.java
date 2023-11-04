/**
 * 
 */
package javaAssingment1And2;

import java.util.Scanner;

/**
 * Write a program to obtain the sum of the n terms (n and x to be taken from the user) of the
   following series x – x^3/3! + x^5/5! - x^7/7! ...........................................
 */
public class Ass1Q10 {
	
	static int fact(int n) {
		int fact=1;
		for(int i=n; i>0;i--) {
			fact*=i;
		}
		return fact;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x,sign=1;
		double sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number of terms upto you want the sum :");
		n=sc.nextInt();
		
		System.out.print("Enter the value of X: ");
		x=sc.nextInt();
		
		for (int i=1; i<=(2*n)-1; i++) {
			double temp=0;
			temp = (Math.pow(x, i))/fact(i);
			sum+=(temp*sign);
			sign = -sign;
		}
		System.out.println("The sum is :"+ sum);
		sc.close();
	}

}
