package javaAssingment1And2;

import java.util.Scanner;

/*
	Admission to a professional course is subject to the following conditions:
		(a) marks in Mathematics >= 60 
		(b) marks in Physics >=50
		(c) marks in Chemistry >=40 
		(d) Total in all 3 subjects >=200
		(Or)
		Total in Maths & Physics>=150
	
	Given the marks in the 3 subjects of n (user input) students, write a program to process
	the applications to list the eligible candidates.
*/


// Creating a Class to store the different subjects marks of the student
class StudentMarks {
	double math=0;
	double phy=0;
	double chem=0;
	public StudentMarks(double math, double phy, double chem) {
		// A parameterized constructor to set the marks
		this.math = math;
		this.phy = phy;
		this.chem = chem;
	}
	
	// Generating Getter Setter
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getPhy() {
		return phy;
	}
	public void setPhy(double phy) {
		this.phy = phy;
	}
	public double getChem() {
		return chem;
	}
	public void setChem(double chem) {
		this.chem = chem;
	}
	@Override
	public String toString() {
		return "[Math=" + math + ", Physics=" + phy + ", Chemistry=" + chem+"]";
	}
	
}
public class Ass2Q2 {
	public static void main(String[] args) {
		
		
		System.out.print("Enter the number of the students : ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		
		StudentMarks std[] = new StudentMarks[n];
		
		
		System.out.println("Enter the marks of the students ");
		System.out.println("--------------------------------");

		for(int i=0;i<n;i++) {
			System.out.println("Enter the marks of student"+(i+1)+" : ");
			
			System.out.print("Enter the marks of the mathematics : ");
			double m=sc.nextDouble();
			System.out.print("Enter the marks of the physics : ");
			double p=sc.nextDouble();
			System.out.print("Enter the marks of the chemistry : ");
			double c=sc.nextDouble();
			System.out.println("--------------------------------");
			std[i] = new StudentMarks(m,p,c);
		}
		System.out.println("The marks of the students : ");
		for(int i=0;i<n;i++) {
			System.out.println("Student"+(i+1)+" : "+std[i].toString());
		}
		
		for(int i=0;i<n;i++) {
			double sum1 = std[i].getMath()+std[i].getPhy()+std[i].getChem();
			double sum2= std[i].getMath()+std[i].getPhy();
			
			//Logic
			if(sum2>=150 || (std[i].getMath()>=60 && std[i].getPhy()>=50 && std[i].getChem()>=40 && sum1>=200) ) {
				System.out.println("Student"+(i+1)+" is eligible for taking admission");
			}else {
				System.out.println("Student"+(i+1)+" is not eligible for taking admission");
			}

		}
		sc.close();
	}
}

/*
 * Output->
Enter the number of the students : 4
Enter the marks of the students 
--------------------------------
Enter the marks of student1 : 
Enter the marks of the mathematics : 99
Enter the marks of the physics : 98
Enter the marks of the chemistry : 70
--------------------------------
Enter the marks of student2 : 
Enter the marks of the mathematics : 88
Enter the marks of the physics : 77
Enter the marks of the chemistry : 90
--------------------------------
Enter the marks of student3 : 
Enter the marks of the mathematics : 60
Enter the marks of the physics : 65
Enter the marks of the chemistry : 72
--------------------------------
Enter the marks of student4 : 
Enter the marks of the mathematics : 95
Enter the marks of the physics : 55
Enter the marks of the chemistry : 67
--------------------------------
The marks of the students : 
Student1 : [Math=99.0, Physics=98.0, Chemistry=70.0]
Student2 : [Math=88.0, Physics=77.0, Chemistry=90.0]
Student3 : [Math=60.0, Physics=65.0, Chemistry=72.0]
Student4 : [Math=95.0, Physics=55.0, Chemistry=67.0]
Student1 is eligible for taking admission
Student2 is eligible for taking admission
Student3 is not eligible for taking admission
Student4 is eligible for taking admission
*/
