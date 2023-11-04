/**
 * 
 */
package javaAssingment1And2;

import java.util.Scanner;

/**
 * Write a program to find the prime factors of the given number . 
 * (e.g. Input : 315 Output: 3 3 5 7)
 */
public class Ass1Q5 {

	/**
	 * @param args
	 */
	static boolean isPrime(int n) {
		int count=0;
		if(n==1){
			return false;
		}else {
			for (int i=2; i<(n/2);i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count == 0) {
				return true;
			}else {
				return false;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		n=sc.nextInt();
		
		System.out.print("Prime Factors of "+n+" are : ");
		for(int i=2; i<n;i++) {
			if(n%i==0) {
				if(isPrime(i)) {
					System.out.print(" "+i+" ");
				}
			}
		}
		sc.close();
	}

}
/*
 * OutPut1->
Enter a Number: 
315
Prime Factors of 315 are :  3  5  7 

 * OutPut2 ->
Enter a Number: 
15
Prime Factors of 15 are :  3  5 
 */