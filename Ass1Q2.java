package javaAssingment1And2;

import java.util.Scanner;
/*
Write a program to find the roots (real and imaginary) of the quadratic equation of the 
form ax^2+ bx + c = 0.
*/
public class Ass1Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation(ax^2+ bx + c = 0):");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        double temp = b * b - 4 * a * c; //b^2-4ac

        if (temp > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(temp)) / (2 * a);
            double root2 = (-b - Math.sqrt(temp)) / (2 * a);
            System.out.println("Two Roots are real.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (temp == 0) {
            // One real root (double root)
            double root = -b / (2 * a);
            System.out.println("Two Roots are real and same.");
            System.out.println("Root: " + root);
        } else {
            // Complex roots (imaginary part)
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-temp) / (2 * a);
            System.out.println("Two Roots are complex.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
        sc.close();
	}

}
/*
	 * Output 1->
Enter the coefficients of the quadratic equation(ax^2+ bx + c = 0):
a: 2
b: 2
c: 1
Two Roots are complex.
Root 1: -0.5 + 0.5i
Root 2: -0.5 - 0.5i
	 
	 
	 * Output 2->
Enter the coefficients of the quadratic equation(ax^2+ bx + c = 0):
a: 1
b: 10
c: -24
Two Roots are real.
Root 1: 2.0
Root 2: -12.0	

 
	 * Output 3->
Enter the coefficients of the quadratic equation(ax^2+ bx + c = 0):
a: 1
b: 2
c: 1
Two Roots are real and same.
Root: -1.0
 */
