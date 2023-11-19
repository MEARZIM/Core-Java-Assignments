/**
 * 
 */
package javaAssignment4And3;

import java.util.Scanner;

/**
 * 	Write a program to print the area of a rectangle by creating a class named 'Area' having two
	methods. First method named as 'setDim' takes length and breadth of rectangle as parameters
	and the second method named as 'getArea' returns the area of the rectangle. Length and breadth
	of rectangle are entered through keyboard.
 */

class Area{
	private double l,b;
	
	// Function that takes length and breadth of rectangle as parameters
	public void setDim(int l, int b){
		this.l=l;
		this.b=b;
	}
	
	// Function that returns the area of the rectangle
	public double getArea(){
		return this.l*this.b;
	}
}

public class Ass3q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rectangle Length :");
		int l=sc.nextInt();
		System.out.println("Enter the rectangle Breadth :");
		int b=sc.nextInt();
		
		Area a = new Area();
		
		a.setDim(l, b);// set length and breath
		
		System.out.println("The Area of the rectangle is : "+ a.getArea());
		sc.close();
	}

}

/*
 * OutPut 1-> 

Enter the rectangle Length :
30
Enter the rectangle Breadth :
44
The Area of the rectangle is : 1320.0


 * OutPut 2-> 

Enter the rectangle Length :
22
Enter the rectangle Breadth :
22
The Area of the rectangle is : 484.0

 */
