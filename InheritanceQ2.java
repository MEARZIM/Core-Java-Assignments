/**
 * 
 */
package javaAssingment1And2;

/**
 *  Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone
	from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and volume ( ). Override
	these two methods in each of the derived classes to calculate the volume and whole surface
	area of each type of three-dimensional objects. The dimensions of the objects are to be taken
	from the users and passed through the respective constructors of each derived class. Write a
	main method to test these classes.
 */

abstract class ThreeDObject{
	public double pie = 3.14;
	
	// Incase of Cylinder and Cone its height and radios 
	// Incase of box length width and height and for cone it is side
	private int var1;
	private int var2;
	private int var3;
	
	// getters
	public int getVar1() {
		return var1;
	}

	public int getVar2() {
		return var2;
	}

	public int getVar3() {
		return var3;
	}
	
	
	// For Cube
	ThreeDObject(int var1){
		this.var1 =  var1;
	}
	
	// For Cone and Cylinder
	ThreeDObject(int var1, int var2){
		this.var1=  var1;
		this.var2 = var2;
	}
	
	// For Box
	ThreeDObject(int var1, int var2, int var3){
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}
	
	public abstract double wholeSurfaceArea();
	public abstract double volume();
}

class Box extends ThreeDObject{
	
	Box(int height, int width, int length){
		super(height, width, length);
	}

	public double wholeSurfaceArea() {
		// TODO Auto-generated method stub
		double rem = (super.getVar2()*super.getVar3())+(super.getVar1()*super.getVar3())+(super.getVar1()*super.getVar2());
		return 2*rem;
	}

	public double volume() {
		// TODO Auto-generated method stub
		return (super.getVar1()*super.getVar2()*super.getVar3());
	}
	
}

class Cube extends ThreeDObject{
	
	Cube(int side){
		super(side);
	}
	
	public double wholeSurfaceArea() {
		// TODO Auto-generated method stub
		return 6*(Math.pow(getVar1(), 2));
	}

	public double volume() {
		// TODO Auto-generated method stub
		return Math.pow(getVar1(), 3);
	}
	
}

class  Cylinder extends ThreeDObject{
	
	Cylinder(int radious, int height){
		super(radious, height);
	}

	public double wholeSurfaceArea() {
		// TODO Auto-generated method stub
		return (2*Math.PI*super.getVar1()*(super.getVar1()+super.getVar2()));
	}

	public double volume() {
		// TODO Auto-generated method stub
		return (Math.PI * Math.pow(super.getVar1(), 2)* super.getVar2());
	}
	
}

class  Cone extends ThreeDObject{
	
	Cone(int radious, int height){
		super(radious, height);
	}

	public double wholeSurfaceArea() {
		// TODO Auto-generated method stub
		double rem = (Math.pow(super.getVar1(),2)+(Math.pow(super.getVar2(),2)));
		double l = Math.sqrt(rem);
		return (Math.PI*super.getVar1()*(l+super.getVar1()));
	}

	public double volume() {
		// TODO Auto-generated method stub
		return (Math.PI * Math.pow(super.getVar1(), 2) * super.getVar2())/3;
	} 
	
}

public class InheritanceQ2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int side=3, height=3, width=4, length=5, radious=5;
		
		ThreeDObject b = new Box(height, width, length);
		System.out.println("Box->");
		System.out.println("Area : " + b.wholeSurfaceArea());
		System.out.println("Volume : " + b.volume());
		
		ThreeDObject c = new Cube(side);
		System.out.println("Cube->");
		System.out.println("Area : " + c.wholeSurfaceArea());
		System.out.println("Volume : " + c.volume());
		
		ThreeDObject cy = new Cylinder(radious, height);
		System.out.println("Cylinder->");
		System.out.println("Area : " + cy.wholeSurfaceArea());
		System.out.println("Volume : " + cy.volume());
		
		ThreeDObject co = new Cone(radious, height);
		System.out.println("Cone->");
		System.out.println("Area : " + co.wholeSurfaceArea());
		System.out.println("Volume : " + co.volume());
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

*/
