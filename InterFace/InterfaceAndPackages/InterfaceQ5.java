/**
 * 
 */
package InterfaceAndPackages;
import java.util.Scanner;

import Org.Shapes.*;
/**
 * 
 */
public class InterfaceQ5 {

	/**
	 * Complete the following:
		i) Create a package named org.shapes.
		ii) Create some classes in the package representing some common geometric shapes like
			Square, Triangle, Circle and so on. The classes should contain area and perimeter
			methods in them.
		iii) Compile the package.
		iv) Use this package to find area and perimeter of different shapes as chosen by the user.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        
        
        
        while (true) {
        	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Menu:");
        	System.out.println("Select a shape:");
            System.out.println("1. Square");
            System.out.println("2. Triangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        	System.out.println("Enter Your Choice: ");
            int choice = scanner.nextInt();
        	
        	switch (choice) {
        	case 1:
        		System.out.print("Enter the side length of the square: ");
        		double squareSide = scanner.nextDouble();
        		Square square = new Square(squareSide);
        		System.out.println("Area: " + square.getArea());
        		System.out.println("Perimeter: " + square.getPerimeter());
        		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        		break;
        		
        	case 2:
        		System.out.print("Enter the base length of the triangle: ");
        		double triangleBase = scanner.nextDouble();
        		System.out.print("Enter the height of the triangle: ");
        		double triangleHeight = scanner.nextDouble();
        		System.out.print("Enter the length of side 1 of the triangle: ");
        		double triangleSide1 = scanner.nextDouble();
        		System.out.print("Enter the length of side 2 of the triangle: ");
        		double triangleSide2 = scanner.nextDouble();
        		System.out.print("Enter the length of side 3 of the triangle: ");
        		double triangleSide3 = scanner.nextDouble();
        		
        		Triangle triangle = new Triangle(triangleBase, triangleHeight, triangleSide1, triangleSide2, triangleSide3);
        		System.out.println("Area: " + triangle.getArea());
        		System.out.println("Perimeter: " + triangle.getPerimeter());
        		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        		break;
        		
        	case 3:
        		System.out.print("Enter the radius of the circle: ");
        		double circleRadius = scanner.nextDouble();
        		Circle circle = new Circle(circleRadius);
        		System.out.println("Area: " + circle.getArea());
        		System.out.println("Perimeter: " + circle.getPerimeter());
        		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        		break;
        		
        	case 4:
        		System.out.println("Thanks for using :)");
                System.out.println("Exiting the program. Goodbye!");
        		scanner.close();
        		System.exit(0);
        		
        	default:
        		System.out.println("Invalid choice");
        		break;
        	}
        }

	}

}
/*
 * Output->
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Menu:
Select a shape:
1. Square
2. Triangle
3. Circle
4. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Enter Your Choice: 
1
Enter the side length of the square: 5
Area: 25.0
Perimeter: 20.0
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Menu:
Select a shape:
1. Square
2. Triangle
3. Circle
4. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Enter Your Choice: 
2
Enter the base length of the triangle: 6
Enter the height of the triangle: 7
Enter the length of side 1 of the triangle: 8
Enter the length of side 2 of the triangle: 9
Enter the length of side 3 of the triangle: 2
Area: 21.0
Perimeter: 19.0
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Menu:
Select a shape:
1. Square
2. Triangle
3. Circle
4. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Enter Your Choice: 
3
Enter the radius of the circle: 5
Area: 78.53981633974483
Perimeter: 31.41592653589793
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Menu:
Select a shape:
1. Square
2. Triangle
3. Circle
4. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Enter Your Choice: 
4
Thanks for using :)
Exiting the program. Goodbye!

 */