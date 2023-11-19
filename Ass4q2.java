/**
 * 
 */
package javaAssignment4And3;

import java.util.Scanner;

/**
 *  Create two classes DM and DB which store the value of distances. DM stores distances in
	meters and centimeters and DB in feet and inches. Write a program that can read values for
	the class objects and add one object of DM with another object of DB. 
	Use method to carry out the addition operation. 
	The object that stores the result may be a DM object or a DB object, depending on the units in 
	which the results are required. The display should be done in the format of feet and inches or 
	meters and centimeters depending on the object on display.
 */

class DM{
	private int meters;
	private int centimeters;
	
	DM (){
		this.meters = 0;
		this.centimeters = 0;
	}
	
	public DM(int totalCentimeters, int totalMeters) {
		// TODO Auto-generated constructor stub
		this.centimeters = totalCentimeters;
		this.meters = totalMeters;
	}

	protected int getMeters() {
		return meters;
	}
	
	protected void setMeters(int meters) {
		this.meters = meters;
	}
	
	protected int getCentimeters() {
		return centimeters;
	}
	
	protected void setCentimeters(int centimeters) {
		this.centimeters = centimeters;
	}
	
	public DM addition(DM obj) {
		int totalCentimeters=obj.centimeters+this.centimeters;
		int totalMeters = obj.meters+this.meters;
		
		if(totalCentimeters>=100) {
			totalMeters += totalCentimeters/100;
			totalCentimeters %=100;
		}
		return new DM(totalCentimeters,totalMeters);
	}

	public void display() {
		System.out.println("The distance is : "+this.meters+" meter "+this.centimeters+" centimeter");
	}
	
	
}

class DB{
	private int feet;
	private int inche;
	
	public DB() {
		this.feet = 0;
		this.inche = 0;
	}
	
	public DB(int feet, int inche) {
		this.feet = feet;
		this.inche = inche;
	}
	
	protected int getFeet() {
		return feet;
	}

	protected void setFeet(int feet) {
		this.feet = feet;
	}

	protected int getInche() {
		return inche;
	}

	protected void setInche(int inche) {
		this.inche = inche;
	}
	
	public DB addition(DB obj) {
		int totalFeets=obj.feet+this.feet;
		int totalInches = obj.inche+this.inche;
		
		if(totalInches>=12) {
			totalFeets += totalInches/12;
			totalInches %=12;
		}
		return new DB(totalFeets,totalInches);
	}

	public void display() {
		System.out.println("The distance is : "+this.feet+" Feet "+this.inche+" Inches");
	}
}

public class Ass4q2 {

	/**
	 * @param args
	 */
	
	private static DM convertDBtoDM(DB db) {
		int totalCM=(int)((int)((db.getFeet()*12)*2.54)+(db.getInche()*2.54));  //since 1cm = 2.54inch
		int resm=totalCM/100;
		int rescm=totalCM%100;
		return new DM(rescm,resm);
	}
	
	private static DB convertDMtoDB(DM dm) {
		int convertToCM = dm.getMeters()*100;
		int totalcm = dm.getCentimeters()+convertToCM;
		int totalinch = (int)(totalcm*0.3937);  //Since 1cm = 0.3937inch
		int resf = totalinch/12;
		int resinch = totalinch%12;
		
		return new DB(resf,resinch);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Input for DM object
		System.out.println("Enter distance in meter and centimeter for DM : ");
		System.out.print("Meters : ");
		int m = sc.nextInt();
		System.out.print("Centimeters : ");
		int cm = sc.nextInt();
		DM dm = new DM(cm,m);
		dm.display();
		
		//Input for DB object
		System.out.println("Enter distance in feet and inch for DB : ");
		System.out.print("Feet : ");
		int f = sc.nextInt();
		System.out.print("Inch : ");
		int i = sc.nextInt();
		DB db = new DB(f,i);
		db.display();
		
		// Now Convert them
		DM ansDm = dm.addition(convertDBtoDM(db));
		DB ansDb = db.addition(convertDMtoDB(dm));
		
		
		// Print the Result
		System.out.println("Result in meters and centimeters:");
		ansDm.display();

        System.out.println("Result in feet and inches:");
        ansDb.display();
		
        sc.close();
	}

}

/*
 * OutPut 1->
Enter distance in meter and centimeter for DM : 
Meters : 5
Centimeters : 23
The distance is : 5 meter 23 centimeter
Enter distance in feet and inch for DB : 
Feet : 24
Inch : 5
The distance is : 24 Feet 5 Inches
Result in meters and centimeters:
The distance is : 12 meter 66 centimeter
Result in feet and inches:
The distance is : 41 Feet 6 Inches


  * OutPut 2->
Enter distance in meter and centimeter for DM : 
Meters : 67
Centimeters : 22
The distance is : 67 meter 22 centimeter
Enter distance in feet and inch for DB : 
Feet : 3
Inch : 78
The distance is : 3 Feet 78 Inches
Result in meters and centimeters:
The distance is : 70 meter 11 centimeter
Result in feet and inches:
The distance is : 230 Feet 0 Inches

 */
