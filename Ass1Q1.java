package javaAssingment1And2;

import java.util.Arrays;
import java.util.Scanner;

/*
	Write a program that reads three coordinate and calculate the side of triangle.
	Check whether these numbers can be considered as the three sides of a triangle.
	If so, find the type (isosceles, equilateral or right-angled) and area of the triangle.
*/

public class Ass1Q1 {
	
	static double distanceOfTriangle(double x1, double y1, double x2, double y2) {
		// Formula -> srqt(((x2-x1)^2)+((y2-y1)^2))
		return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
	}
	
	static boolean isTriangle(double a, double b, double c) {
		if(a + b > c && b + c > a && c + a > b) {
			return true;
		}else {
			return false;
		}
	}
	
	static String typeOfTriangle(double a, double b, double c) {
		 if (a == b && b == c) {
	         return "Equilateral";
	     } else if (a == b || b == c || c == a) {
	         return "Isosceles";
	     }else {
	    	 double sides []= {a,b,c};
	    	 Arrays.sort(sides);
	         if((Math.pow(sides[0], 2)+Math.pow(sides[1], 2))==Math.pow(sides[2], 2)) {
	        	 return "Right-Angled";
	         }
	         return "Scalene";
	     }
	}
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		double x1,y1;
		System.out.println("Enter the Value of the 1st coordinates :");
		System.out.print("Enter the value of X1 :");
		x1 = sc.nextDouble();
		System.out.print("Enter the value of Y1 :");
		y1 = sc.nextDouble();
		
		double x2,y2;
		System.out.println("Enter the Value of the 2nd coordinates :");
		System.out.print("Enter the value of X2 :");
		x2 = sc.nextDouble();
		System.out.print("Enter the value of Y2 :");
		y2 = sc.nextDouble();
		
		double x3,y3;
		System.out.println("Enter the Value of the 3rd coordinates :");
		System.out.print("Enter the value of X1 :");
		x3 = sc.nextDouble();
		System.out.print("Enter the value of Y1 :");
		y3 = sc.nextDouble();
		
		
		//Calculating the Side of the triangle
		double side1 = distanceOfTriangle(x1,y1,x2,y2);
		double side2 = distanceOfTriangle(x2,y2,x3,y3);
		double side3 = distanceOfTriangle(x3,y3,x1,y1);
		
		
		if (isTriangle(side1, side2, side3)) {
            System.out.println("These sides can form a " + typeOfTriangle(side1, side2, side3) + " triangle.");
            
            // Calculate the area of the triangle
            double s = (side1 + side2 + side3) / 2;
            double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            System.out.println("Area of the triangle: "+area);
        } else {
            System.out.println("These sides cannot form a triangle.");
        }
		sc.close();
	}
}

/*
 *OutPut 1->
Enter the Value of the 1st coordinates :
Enter the value of X1 :4
Enter the value of Y1 :4
Enter the Value of the 2nd coordinates :
Enter the value of X2 :2
Enter the value of Y2 :3
Enter the Value of the 3rd coordinates :
Enter the value of X1 :8
Enter the value of Y1 :9
These sides can form a Scalene triangle.
Area of the triangle: 3.000000000000025


 *Output2->
Enter the Value of the 1st coordinates :
Enter the value of X1 :2
Enter the value of Y1 :3
Enter the Value of the 2nd coordinates :
Enter the value of X2 :6
Enter the value of Y2 :3
Enter the Value of the 3rd coordinates :
Enter the value of X1 :2
Enter the value of Y1 :7
These sides can form a Isosceles triangle.
Area of the triangle: 7.999999999999997


 *OutPut3->
Enter the Value of the 1st coordinates :
Enter the value of X1 :0
Enter the value of Y1 :2
Enter the Value of the 2nd coordinates :
Enter the value of X2 :7
Enter the value of Y2 :1
Enter the Value of the 3rd coordinates :
Enter the value of X1 :1
Enter the value of Y1 :-1
These sides can form a Right-Angled triangle.
Area of the triangle: 10.0

 */
