/**
 * 
 */
package javaAssignment4And3;

import java.util.Scanner;

/**
 *   The annual examination results of N students are tabulated as follows:
		Roll No.  Subject 1  Subject 2  Subject 3
		  ..		...			...			...
		  ..		...			...			...
		  ..		...			...			...
	 Write a program to read the data and determine the following:
		(a) Total marks obtain by each student
		(b) The highest marks in each subject and the roll no of the student who secured it
		(c) The student who obtained the highest total marks
*/

class Student{
	private int roll;
	private int sub1, sub2, sub3;
	private int totalMarks;
	Student(){
		this.roll=0;
		this.sub1=0;
		this.sub2=0;
		this.sub3=0;
		this.totalMarks=0;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public int getSub1() {
		return sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public int getSub3() {
		return sub3;
	}

	
	public void setMarks(int roll,int sub1, int sub2,int sub3){
		this.roll=roll;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	
	public int totalMarksEachStudent(Student s){
		this.totalMarks=s.sub1+s.sub2+s.sub3;
		return this.totalMarks;
	}

	public String toString() {
		return "  "+ this.roll + "\t\t  " + this.sub1 + "\t\t  " + this.sub2
				+ "\t\t  " + this.sub3 ;
	}
	
}


public class Ass3q4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Total number of student: ");
		int n=sc.nextInt();
		
		
		Student s[] = new Student[n];
		for (int i=0; i<n;i++){
			s[i] = new Student();
			int sub1, sub2, sub3;
			
			System.out.println("Enter the sub"+(1)+" of student: "+(i+1) );
			sub1=sc.nextInt();
			
			System.out.println("Enter the sub"+(2)+" of student: "+(i+1) );
			sub2=sc.nextInt();
			
			System.out.println("Enter the sub"+(3)+" of student: "+(i+1) );
			sub3=sc.nextInt();
		
			
			s[i].setMarks(i+1,sub1, sub2, sub3);
			s[i].totalMarksEachStudent(s[i]);
			
		}
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Roll No.\tSubject 1\tSubject 2\tSubject 3");
		for(int i=0; i<n; i++) {
			System.out.println(s[i]);
		}
		
		
		
		//sub1
		int maxSub1 = s[0].getSub1();
		for(int i=0; i<n;i++){
			if(maxSub1<s[i].getSub1()){
				maxSub1=s[i].getSub1();
			}
		}
		for(int i=0; i<n;i++){
			if(maxSub1==s[i].getSub1()){		
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Highest Marks sub1 : "+maxSub1 +" Obtain by Roll: "+(i+1));
			}
		}
		
		//sub2
		int maxSub2 = s[0].getSub2();
		for(int i=0; i<n;i++){
			if(maxSub2<s[i].getSub2()){
				maxSub2=s[i].getSub2();
			}
		}
		for(int i=0; i<n;i++){
			if(maxSub2==s[i].getSub2()){		
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Highest Marks sub2 : "+maxSub2 +" Obtain by Roll: "+(i+1));
			}
		}
		
		//sub3
		int maxSub3 = s[0].getSub3();
		for(int i=0; i<n;i++){
			if(maxSub3<s[i].getSub3()){
				maxSub3=s[i].getSub3();
			}
		}
		for(int i=0; i<n;i++){
			if(maxSub3==s[i].getSub3()){
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Highest Marks sub3 : "+maxSub3 +" Obtain by Roll: "+(i+1));
			}
		}
		
		//maxtotal
		int maxTotal=s[0].totalMarksEachStudent(s[0]);
		for (int i=0;i<n; i++){
			if(maxTotal<s[i].totalMarksEachStudent(s[i])){
				maxTotal=s[i].totalMarksEachStudent(s[i]);
			}
		}
		for(int i=0; i<n;i++){
			if(maxTotal==s[i].totalMarksEachStudent(s[i])){
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Highest Total Marks : "+maxTotal +" Obtain by Roll: "+(i+1));
			}
		}
		sc.close();
		
	}

}

/*
 * Output->
Enter the Total number of student: 
4
Enter the sub1 of student: 1
91
Enter the sub2 of student: 1
78
Enter the sub3 of student: 1
83
Enter the sub1 of student: 2
78
Enter the sub2 of student: 2
66
Enter the sub3 of student: 2
45
Enter the sub1 of student: 3
96
Enter the sub2 of student: 3
81
Enter the sub3 of student: 3
79
Enter the sub1 of student: 4
66
Enter the sub2 of student: 4
90
Enter the sub3 of student: 4
80
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Roll No.	Subject 1	Subject 2	Subject 3
  1		      91		  78		  83
  2		      78		  66		  45
  3		      96		  81		  79
  4		      66		  90		  80
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Highest Marks sub1 : 96 Obtain by Roll: 3
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Highest Marks sub2 : 90 Obtain by Roll: 4
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Highest Marks sub3 : 83 Obtain by Roll: 1
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Highest Total Marks : 256 Obtain by Roll: 3
*/
