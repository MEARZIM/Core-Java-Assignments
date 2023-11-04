package javaAssingment1And2;

import java.util.Scanner;

/**
 *  For a certain electrical circuit with an inductance L and resistance R, the damped natural
	frequency is given by:

	Frequency = √ [( 1 / LC ) – ( R^2/4C^2 )]
	
	It is desired to study the variations of the frequency with C (capacitance). Write a
	program to calculate the frequency of difference values of C starting 0.01 to 0.1 in steps
	of 0.01.
 */

public class Ass2Q6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of inductance (L) : ");
		double l = sc.nextDouble();
		
		System.out.print("Enter the value of resistance (R) : ");
		double r = sc.nextDouble();
		
		for(double c = 0.01;c<=0.1;c=c+0.01) {
			System.out.print("\nIf C is= "+String.format("%.2f", c)+" then frequency is : ");
			
			//Formula
			double a = 1/(l*c);
			
			double b = (Math.pow(r, 2) / (4*(Math.pow(c, 2))));
			
			double div = a-b;
			
			double freq = Math.sqrt(Math.abs(div));
			System.out.print(String.format("%.4f", freq));
		}
		
		sc.close();
	}
}

/*
 * Output 1->
Enter the value of inductance (L) : 5
Enter the value of resistance (R) : 3

If C is= 0.01 then frequency is : 149.9333
If C is= 0.02 then frequency is : 74.9333
If C is= 0.03 then frequency is : 49.9333
If C is= 0.04 then frequency is : 37.4333
If C is= 0.05 then frequency is : 29.9333
If C is= 0.06 then frequency is : 24.9332
If C is= 0.07 then frequency is : 21.3618
If C is= 0.08 then frequency is : 18.6832
If C is= 0.09 then frequency is : 16.5999
If C is= 0.10 then frequency is : 14.9332


  * Output 2->
Enter the value of inductance (L) : 3
Enter the value of resistance (R) : 8

If C is= 0.01 then frequency is : 399.9583
If C is= 0.02 then frequency is : 199.9583
If C is= 0.03 then frequency is : 133.2917
If C is= 0.04 then frequency is : 99.9583
If C is= 0.05 then frequency is : 79.9583
If C is= 0.06 then frequency is : 66.6250
If C is= 0.07 then frequency is : 57.1012
If C is= 0.08 then frequency is : 49.9583
If C is= 0.09 then frequency is : 44.4028
If C is= 0.10 then frequency is : 39.9583
*/