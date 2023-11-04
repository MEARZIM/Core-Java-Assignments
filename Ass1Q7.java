package javaAssingment1And2;

import java.util.Scanner;

/**
 * Write a program to find all Armstrong numbers in the range 1 to M, where M is taken as input.
 */


public class Ass1Q7 {
	
	public static boolean isArmstrong (int n){
		int count=0, cpy=n, ans=0;
		
		// counting the digits
		while(cpy!=0) {
			count++;
			cpy/=10;
		}
		cpy=n;
		
		// Armstrong logic
		while(cpy!=0) {
			int rem = cpy%10;
			ans += (Math.pow(rem, count));
			cpy/=10;
		}
		if(ans==n) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static void main (String[] args) {
		int minRange=0, maxRange=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting range :");
		minRange = sc.nextInt();
		
		System.out.println("Enter the ending range :");
		maxRange = sc.nextInt();
		
		// Validations
		if(minRange <= 0 || maxRange <= 0 ) {
			System.out.println("Starting and ending Range can not be 0 or less than 0");
		}else {
			if (minRange<maxRange) {
				System.out.println("ArmStrong number between"+minRange+" - "+maxRange+" :");
				for (int i= minRange; i<=maxRange; i++) {
					if(isArmstrong(i)) {
						System.out.print(i+ " ");
					}
				}
			}else {
				System.out.println("Starting range must be greater then ending range");
			}
		}
		sc.close();
	}
}
/*
 * Output1->
Enter the Starting range :
100
Enter the ending range :
1000
ArmStrong number between100 - 1000 :
153 370 371 407 


 * Output2->
Enter the Starting range :
100
Enter the ending range :
9
Starting range must be greater then ending range


 * Output3->
Enter the Starting range :
0
Enter the ending range :
0
Starting and ending Range can not be 0 or less than 0


 * Output4->
Enter the Starting range :
1
Enter the ending range :
100
ArmStrong number between1 - 100 :
1 2 3 4 5 6 7 8 9 


 */