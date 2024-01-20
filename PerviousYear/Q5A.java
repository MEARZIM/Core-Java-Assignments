/**
 * 
 */
package PerviousYear;

/**
 *  Write a program to create a class named Vehicle having protected instance variables 
	regnNumber, speed, color, ownerName and a method showData( ) to show “This is a 
	vehicle class”. Inherit the  Vehicle class and create two subclasses named Bus and 
	Car having individual private instance variables routeNumber in Bus and 
	manufacturerName in Car and both of them having showData ( ) method showing all 
	details of Bus and Car respectively with content of the super class’s showData ( ) 
	method. 
 */

class Vehicle{
	protected int regnNumber, speed;
	protected String color, ownerName;
	
	protected void showData() {
		System.out.println("This is a vehicle class");
	}
}

class Bus extends Vehicle {
	private int routeNumber = 1001;
	
	protected void showData() {
		super.showData();;
		System.out.println(routeNumber);
	}
}


class Car extends Vehicle{
	private String manufacturerName =  "Ayan Saha";
	
	protected void showData() {
		super.showData();
		System.out.println(manufacturerName);
	}
}
public class Q5A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Car();
		Vehicle v2 =  new Bus();
		
		v1.showData();
		v2.showData();
	}

}
