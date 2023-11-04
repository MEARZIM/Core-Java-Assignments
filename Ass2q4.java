/**
 * 
 */
package javaAssingment1And2;

import java.util.Scanner;

/**
 *  The formula for resistors connected in parallel is a little more complex. Given two
	resistors with resistances R1 and R2 connected in parallel the equivalent resistance is
	given by the inverse of the sum of the inverses, i.e. * If there are more than two resistors
	you continue to invert the sum of their inverses; e.g. for four resistors you have: * Write a
	program that calculates the resistance of a group of resistors arranged in parallel.
 */
public class Ass2q4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter the no of the resistors : ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		
		double resistance[] = new double[n];
		double ref[] = new double[n];
		double s = 0;
		
		
		System.out.println("Enter the resistances of the resistors - ");
		for(int i=0;i<n;i++) {
			System.out.print("Enter the resistance of resistor "+(i+1)+" : ");
			resistance[i] = sc.nextDouble();
			ref[i] = 1/resistance[i];
			s=s+ref[i];
		}
		
		
		double resistors = 1/s;
		System.out.println("The resistance of the equivalent resistor : "+resistors);
		
		sc.close();
	}

}


/*

 * Output 1->
Enter the no of the resistors : 
4
Enter the resistances of the resistors - 
Enter the resistance of resistor 1 : 2
Enter the resistance of resistor 2 : 8
Enter the resistance of resistor 3 : 4
Enter the resistance of resistor 4 : 5
The resistance of the equivalent resistor : 0.9302325581395349


 * Output 2->
Enter the no of the resistors : 
6
Enter the resistances of the resistors - 
Enter the resistance of resistor 1 : 12
Enter the resistance of resistor 2 : 2
Enter the resistance of resistor 3 : 21
Enter the resistance of resistor 4 : 22
Enter the resistance of resistor 5 : 16
Enter the resistance of resistor 6 : 15
The resistance of the equivalent resistor : 1.241351514744408

*/