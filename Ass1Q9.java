package javaAssingment1And2;

import java.util.Scanner;

/**
 * Write a program to obtain the sum of the n terms (n to be taken from the user) of the
   following series 1 - 3^2/2 + 5^3/3 - 7^4/4.................................................
*/
public class Ass1Q9 {
	public static void main(String[] args) {
		int n=0;
		double sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of terms upto you want the sum :");
		n=sc.nextInt();
		
		int sign=1,count=0;
		for(int i=1; i<=((2*n)-1); i+=2) {
			count++;
			double temp = Math.pow(i*sign, count)/count;
			sum+=(temp*sign);
			sign = -sign;
		}
		System.out.println("The sum is :"+ sum);
		sc.close();
	}
}

/*
 * OutPut1->
Enter the number of terms upto you want the sum :
2
The sum is :-3.5


 * OutPut2->
Enter the number of terms upto you want the sum :
9
The sum is :1.2864749455171032E10


 *OutPut3->
Enter the number of terms upto you want the sum :
3
The sum is :38.166666666666664


 */