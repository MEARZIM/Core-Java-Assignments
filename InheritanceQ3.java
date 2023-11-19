/**
 * 
 */
package javaAssingment1And2;

/**
*	Write a program to create a class named Vehicle having protected instance variables
	regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a vehicle
	class”. Inherit the Vehicle class into subclasses named Bus and Car having individual private
	instance variables routeNumber in Bus and manufacturerName in Car and both of them
	having showData ( ) method showing all details of Bus and Car respectively with content of
	the super class’s showData ( ) method.
 */
abstract class Vehicle{
	protected int regnNumber;
	protected double speed;
	protected String color, ownerName;
	Vehicle(){
		this.regnNumber=0;
		this.speed=0;
		this.color=null;
		this.ownerName=null;
	}
	Vehicle(int r, double s, String c, String o){
		this.regnNumber=r;
		this.speed=s;
		this.color=c;
		this.ownerName=o;
	}
	
	
	void showData() {
		System.out.println("This is a vehicle");
	}
	
}

//Bus
class Bus extends Vehicle{
	private int routeNumber;
	Bus(int r, double s, String c, String o,int rn){
		super(r,s,c,o);
		this.routeNumber=rn;
	}
	
	void showData() {
		super.showData();
		System.out.println(toString());
	}

	public String toString() {
		return "Bus [routeNumber=" + routeNumber + ", regnNumber=" + regnNumber + ", speed=" + speed + ", color="
				+ color + ", ownerName=" + ownerName + "]";
	}
}

//Car
class Car extends Vehicle{
	private String manufacturerName;
	Car(int r, double s, String c, String o,String mn){
		super(r,s,c,o);
		this.manufacturerName = mn;
	}
	
	void showData() {
		super.showData();
		System.out.println(toString());
	}

	public String toString() {
		return "Car [manufacturerName=" + manufacturerName + ", regnNumber=" + regnNumber + ", speed=" + speed
				+ ", color=" + color + ", ownerName=" + ownerName + "]";
	}
	
	

}

public class InheritanceQ3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b = new Bus(383883,128,"blue","Ayan",2711);
		b.showData();
		
		Car c = new Car(1234,110,"White","Shame","Aulto");
		c.showData();
	}

}
/*
 * OutPut->
Box->
Area : 94.0
Volume : 60.0
Cube->
Area : 54.0
Volume : 27.0
Cylinder->
Area : 251.32741228718345
Volume : 235.61944901923448
Cone->
Area : 170.13219452115223
Volume : 78.53981633974483

 * */
