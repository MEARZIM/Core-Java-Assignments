package javaAssingment1And2;

import java.util.Scanner;

/*
	Given a list of marks (ranging from 0 to 100) of n (user input) students, 
	write a program to print the number of students who have obtain marks:
		(a) in the range 81 to 100 
		(b) in the range 61 to 80
		(c) in the range 41 to 60 
		(d) in the range 0 to 40
*/

//create a class name student which store the Student data
class Student {
	String name;
	int marks;
	Student(String name, int marks){
		// A parameterized constructor to set the name and marks
		this.name = name;
		this.marks = marks;
	}
	void get() {
		//Simple display method
		System.out.println("Student Name :" + this.name + "\nMarks :" + this.marks);
		System.out.print("------------------------------\n");
	}
}

public class Ass2Q1 {

	public static void main(String[] args) {
		
		
		int n=0; // variable to store the total number of students
		System.out.println("Enter the total number of students : ");
		Scanner sc = new Scanner(System.in); 
		n=sc.nextInt(); // Input a integer
		
		if(n>0 && n<100) {
			
			
			Student std[] = new Student[n]; // Create a Array-of-Object of the Class Student
			
			// Variable to Store the input name and marks
			String name;
			int marks=0;
			
			
			for (int i=0; i<n; i++) {
				// Storing the values (name and marks)
				sc.nextLine(); // For consume the newline character left by the previous nextInt()
				System.out.print("Enter the no. " + (i+1) +" Student Name : ");
				name = sc.nextLine(); 
				System.out.print("Enter the no. " + (i+1) +" Student Marks : ");
				marks = sc.nextInt();
				System.out.println();
				

				std[i] = new Student(name, marks); // Passing the Values
			}
			
			int count[] = {0,0,0,0}; // Counter of array   
			System.out.println("Details students who have obtain marks in the range 81 to 100 :");
			System.out.print("---------------------------------------------------------------\n");
			// Logic to obtain marks in the range 81 to 100 
			for (int i=0; i<n; i++) {
				if (std[i].marks>=81 && std[i].marks<=100) {
					count[0]++;
					std[i].get();
				}
			}
			if(count[0]==0) {
				System.out.println("NULL");
			}
			System.out.println("Details students who have obtain marks in the range 61 to 80 :");
			System.out.print("---------------------------------------------------------------\n");
			// Logic to obtain marks in the range 61 to 80 
			for (int i=0; i<n; i++) {
				if (std[i].marks>=61 && std[i].marks<=80) {
					count[1]++;
					std[i].get();
				}
			}
			if(count[1]==0) {
				System.out.println("NULL");
			}
			System.out.println("Details students who have obtain marks in the range 41 to 60 :");
			System.out.print("---------------------------------------------------------------\n");
			// Logic to obtain marks in the range 41 to 60 
			for (int i=0; i<n; i++) {
				if (std[i].marks>=41 && std[i].marks<=60) {
					count[2]++;
					std[i].get();
				}
			}
			if(count[2]==0) {
				System.out.println("NULL");
			}
			System.out.println("Details students who have obtain marks in the range 0 to 40 :");
			System.out.print("---------------------------------------------------------------\n");
			// Logic to obtain marks in the range 0 to 40 
			for (int i=0; i<n; i++) {
				if (std[i].marks>=0 && std[i].marks<=40) {
					count[3]++;
					std[i].get();
				}
			}
			if(count[3]==0) {
				System.out.println("NULL");
			}
			
			
			System.out.println("The total number of students who have obtain marks in the range 81 to 100 :"+count[0]);
			System.out.println("The total number of students who have obtain marks in the range 61 to  89 :"+count[1]);
			System.out.println("The total number of students who have obtain marks in the range 41 to  60 :"+count[2]);
			System.out.println("The total number of students who have obtain marks in the range  0 to  40 :"+count[3]);
			
			
		}else {
			System.out.println("Range is 0 to 100");
		}
		
		sc.close();
	}

}


/*
 * Output 1->
 
Enter the total number of students : 
111
Range is 0 to 100


 * Output 2->

Enter the total number of students : 
5
Enter the no. 1 Student Name : Ayan Saha
Enter the no. 1 Student Marks : 88

Enter the no. 2 Student Name : Ram Das
Enter the no. 2 Student Marks : 66

Enter the no. 3 Student Name : Aman Ghosh
Enter the no. 3 Student Marks : 32

Enter the no. 4 Student Name : Shann Das
Enter the no. 4 Student Marks : 8

Enter the no. 5 Student Name : Akash Das
Enter the no. 5 Student Marks : 72

Details students who have obtain marks in the range 81 to 100 :
---------------------------------------------------------------
Student Name :Ayan Saha
Marks :88
------------------------------
Details students who have obtain marks in the range 61 to 80 :
---------------------------------------------------------------
Student Name :Ram Das
Marks :66
------------------------------
Student Name :Akash Das
Marks :72
------------------------------
Details students who have obtain marks in the range 41 to 60 :
---------------------------------------------------------------
NULL
Details students who have obtain marks in the range 0 to 40 :
---------------------------------------------------------------
Student Name :Aman Ghosh
Marks :32
------------------------------
Student Name :Shann Das
Marks :8
------------------------------
The total number of students who have obtain marks in the range 81 to 100 :1
The total number of students who have obtain marks in the range 61 to  89 :2
The total number of students who have obtain marks in the range 41 to  60 :0
The total number of students who have obtain marks in the range  0 to  40 :2

	

 */
