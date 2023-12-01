/**
 * 
 */
package InterfaceAndPackages;

import java.util.Scanner;

/**
    Create an interface Department containing attributes deptName and deptHead. It also
	has abstract methods for getting data and printing the attributes. Create a class hostel
	containing hostelName, hostelLocation and numberofRooms. The class contains methods
	for getting and printing the attributes. Then write Student class extending the Hostel
	class and implementing the Department interface. This class contains attributes
	studentName, regdNo, electiveSubject and avgMarks. Write suitable getData and
	printData methods for this class. Also implement the abstract methods of the Department
	interface. Write a driver class to test the Student class. The program should be menu
	driven containing the options:
		i) Admit new student
		ii) Migrate a student
		iii) Display details of a student
	For the third option a search is to be made on the basis of the entered registration number.

 */
interface DeparmentDetails{
	final String deptName ="MCA";
	final String deptHead="Suman Ghosh";
	public void printDetails();
}

class Hostel{
	private String hostelName, hostelLocation;
	private int numberofRooms;
	
	Hostel(String hostelName,String hostelLocation,int numberofRooms){
		this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberofRooms = numberofRooms;
	}
	
	
	public Hostel(Hostel hst) {
		// TODO Auto-generated constructor stub
		this.hostelName= hst.hostelName;
		this.hostelLocation = hst.hostelLocation;
		this.numberofRooms = hst.numberofRooms;
	}


	

	protected String getHostelName() {
		return hostelName;
	}


	protected void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}


	protected String getHostelLocation() {
		return hostelLocation;
	}


	protected void setHostelLocation(String hostelLocation) {
		this.hostelLocation = hostelLocation;
	}


	protected int getNumberofRooms() {
		return numberofRooms;
	}


	protected void setNumberofRooms(int numberofRooms) {
		this.numberofRooms = numberofRooms;
	}


	@Override
	public String toString() {
		return "Hostel [hostelName=" + hostelName + ", hostelLocation=" + hostelLocation + ", numberofRooms="
				+ numberofRooms + "]";
	}
	
}

class Student extends Hostel implements DeparmentDetails{
	private int regdNo, avgMarks;
	private String studentName,electiveSubject;
	
	Student(String studentName, int regdNo,int avgMarks, String electiveSubject, Hostel hst) {
		super(hst);
		this.studentName = studentName;
		this.regdNo = regdNo;
		this.avgMarks = avgMarks;
		this.electiveSubject = electiveSubject;
	}
	
	protected String getStudentName() {
		return studentName;
	}

	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Student Details->");
			System.out.println("----------------");
		    System.out.println("Registration No \tStudent Name \t Avg Marks \t Elective Subject");
		    System.out.println("\t"+regdNo + "\t\t  " + studentName + "\t    " + avgMarks + "\t\t\t" + electiveSubject);
		    
		    System.out.println("Department Details->");
		    System.out.println("-------------------");
		    System.out.println("Department Name \t Department Head ");
		    System.out.println(deptName + " \t \t \t " + deptHead);
		    
		    System.out.println("Hostel Details->");
		    System.out.println("--------------");
		    System.out.println("Hostel Name \t Hostel Location \t NumberOfRooms");
		    System.out.println(super.getHostelName()+"\t\t"+super.getHostelLocation()+"\t\t\t"+super.getNumberofRooms());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	
	
}
public class InterfaceQ4 {

	/**
	 * @param args
	 */
	final static int size=10;
	static int regNo=1;
	static Student std[] = new Student[size];
	
	public static boolean isStudentExist(int regdNo) {
		if(regNo>=regdNo && regNo>0 && regNo<size) {
        	 return true;                   	
        }else {
        	return false;
        }
	}
	
	public static void admitStudent() {
        // Method to admit a new student
		Scanner sc = new Scanner(System.in);
	
		// Input Student Details
		System.out.println("Enter The name Of the Student ->");
		String name= sc.nextLine();
		System.out.println("Enter The Average Marks Of the Student ->");
		int avgMarks= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Elective Subject the Student ->");
		String electiveSubject= sc.nextLine();
		
		// Input the Hostel Details 
		System.out.println("Now Enter your hostel Details");
		System.out.println("Enter The Hostel name for the Student ->");
		String hostelName= sc.nextLine();
		System.out.println("Enter The Hostel Location ->");
		String hostelLocation= sc.nextLine();
		System.out.println("Enter The number of room ->");
		int noOfRooms= sc.nextInt();
		
		Hostel hst = new Hostel(hostelName,hostelLocation,noOfRooms);
		std[regNo] = new Student(name, regNo, avgMarks, electiveSubject, hst);
		System.out.println("Thanks for Registering your registration Number is "+ regNo);
		regNo++;
    }

    public static void migrateStudent(int regNo) {
        // Method to migrate a student
    	Scanner sc = new Scanner(System.in);
    	if(isStudentExist(regNo)) {
    		System.out.println("hello " + std[regNo].getStudentName());
    		System.out.println("Now Enter your New hostel Details");
    		System.out.println("Enter The Hostel name for the Student ->");
    		String hostelName= sc.nextLine();
    		System.out.println("Enter The Hostel Location ->");
    		String hostelLocation= sc.nextLine();
    		System.out.println("Enter The number of room ->");
    		int noOfRooms= sc.nextInt();
    		
    		std[regNo].setHostelName(hostelName);
    		std[regNo].setHostelLocation(hostelLocation);
    		std[regNo].setNumberofRooms(noOfRooms);
    		
    		System.out.println("Details SuccessFully Changed");
    		
    	}else {
    		System.out.println("Student is not exist");
    	}
    }

    public static void displayStudentDetails(int regNo) {
        // Method to display details of a student based on registration number
    	if(isStudentExist(regNo)) {
    		std[regNo].printDetails();
    	}else {
    		System.out.println("Student is not exist");
    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To the Student Management System made by Ayan Saha");
	        // Menu-driven code
	        while (true) {
	        	System.out.println("---------------------------------");
	        	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	            System.out.println("Menu:");
	            System.out.println("1. Admit new student");
	            System.out.println("2. Migrate a student");
	            System.out.println("3. Display details of a student");
	            System.out.println("4. Exit");
	            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	            System.out.println("---------------------------------");

	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    admitStudent();
	                    break;
	                case 2:
	                	System.out.print("Enter registration number: ");
	                    int regdNo = sc.nextInt();
	                    migrateStudent(regdNo);
	                    break;
	                case 3:
	                    System.out.print("Enter registration number: ");
	                    int regdNo1 = sc.nextInt();
	                    displayStudentDetails(regdNo1);	                    	
	                    
	                    break;
	                case 4:
	                	System.out.println("Thanks for using :)");
	                    System.out.println("Exiting the program. Goodbye!");
	                    sc.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        }
	}

}
/*
 * OutPut - >
Welcome To the Student Management System made by Ayan Saha
---------------------------------
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Menu:
1. Admit new student
2. Migrate a student
3. Display details of a student
4. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
---------------------------------
Enter your choice: 1
Enter The name Of the Student ->
Ayan Saha
Enter The Average Marks Of the Student ->
78
Enter Elective Subject the Student ->
Maths
Now Enter your hostel Details
Enter The Hostel name for the Student ->
Sweet Home
Enter The Hostel Location ->
Puri
Enter The number of room ->
32
Thanks for Registering your registration Number is 1
---------------------------------
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Menu:
1. Admit new student
2. Migrate a student
3. Display details of a student
4. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
---------------------------------
Enter your choice: 3
Enter registration number: 1
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Student Details->
----------------
Registration No 	Student Name 	 Avg Marks 	 Elective Subject
	1		  Ayan Saha	    78			Maths
Department Details->
-------------------
Department Name 	 Department Head 
MCA 	 	 	 Suman Ghosh
Hostel Details->
--------------
Hostel Name 	 Hostel Location 	 NumberOfRooms
Sweet Home		Puri			32
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
---------------------------------
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Menu:
1. Admit new student
2. Migrate a student
3. Display details of a student
4. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
---------------------------------
Enter your choice: 1
Enter The name Of the Student ->
Ram Das
Enter The Average Marks Of the Student ->
67
Enter Elective Subject the Student ->
English
Now Enter your hostel Details
Enter The Hostel name for the Student ->
Home LOdge
Enter The Hostel Location ->
Kolkata
Enter The number of room ->
12
Thanks for Registering your registration Number is 2
---------------------------------
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Menu:
1. Admit new student
2. Migrate a student
3. Display details of a student
4. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
---------------------------------
Enter your choice: 3
Enter registration number: 2
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Student Details->
----------------
Registration No 	Student Name 	 Avg Marks 	 Elective Subject
	2		  Ram Das	    67			English
Department Details->
-------------------
Department Name 	 Department Head 
MCA 	 	 	 Suman Ghosh
Hostel Details->
--------------
Hostel Name 	 Hostel Location 	 NumberOfRooms
Home LOdge		Kolkata			12
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
---------------------------------
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Menu:
1. Admit new student
2. Migrate a student
3. Display details of a student
4. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
---------------------------------
Enter your choice: 2
Enter registration number: 2
hello Ram Das
Now Enter your New hostel Details
Enter The Hostel name for the Student ->
Apna Hotel
Enter The Hostel Location ->
Bihar
Enter The number of room ->
20
Details SuccessFully Changed
---------------------------------
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Menu:
1. Admit new student
2. Migrate a student
3. Display details of a student
4. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
---------------------------------
Enter your choice: 3
Enter registration number: 2
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Student Details->
----------------
Registration No 	Student Name 	 Avg Marks 	 Elective Subject
	2		  Ram Das	    67			English
Department Details->
-------------------
Department Name 	 Department Head 
MCA 	 	 	 Suman Ghosh
Hostel Details->
--------------
Hostel Name 	 Hostel Location 	 NumberOfRooms
Apna Hotel		Bihar			20
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
---------------------------------
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Menu:
1. Admit new student
2. Migrate a student
3. Display details of a student
4. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
---------------------------------
Enter your choice: 4
Thanks for using :)
Exiting the program. Goodbye!

 */