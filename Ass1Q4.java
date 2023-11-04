/**
 * 
 */
package javaAssingment1And2;

import java.util.Scanner;

/**
 * Write a program for determining whether a number is a Perfect number or not. (e.g. 28 is a
   Perfect Number because Sum of the Divisor of 28 = 1+2+4+7+14 =28.)
 */


public class Ass1Q4 {

	static boolean isPerfect(int num) {
		int sum=0,cpy=num;
		for(int i=1; i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==cpy){
			return true;			
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		n=sc.nextInt();
		
		if(isPerfect(n)) {
			System.out.println(n+" is a Perfect Number");
		}else {
			System.out.println(n+" is not a Perfect Number");
		}
		sc.close();
	}

}

/*
 * Output 1->
Enter a Number: 
496
496 is a Perfect Number

 * Output 2->
Enter a Number: 
33
33 is not a Perfect Number

 * Output 3->
Enter a Number: 
6
6 is a Perfect Number

 */
