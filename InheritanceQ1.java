/**
 * 
 */
package javaAssingment1And2;

/**
 *  Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle
	and Square. Use Quadrilateral as the super class of the hierarchy. Specify the instance
	variables and methods for each class. The private instance variables of Quadrilateral should
	be the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that
	instantiates objects of your classes and outputs each object's area (except Quadrilateral).
 */

abstract class Quadrilateral{
	double x1,x2,x3,x4,y1,y2,y3,y4;
	double d1=0.0,d2=0.0,d3=0.0,d4=0.0;
	Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4,double y4){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
	}
	
	public String toString() {
		return "Coordinates [x1=" + x1 + ", x2=" + x2 + ", x3=" + x3
				+ ", x4=" + x4 + ", y1=" + y1 + ", y2=" + y2 + ", y3=" + y3
				+ ", y4=" + y4 + "]";
	}
	void calcDist(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4)
	{
		d1=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		d2=Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
		d3=Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
		d4=Math.sqrt(Math.pow((x1-x4),2)+Math.pow((y1-y4),2));
	}

	public abstract double area();
}

//Trapezoid
class Trapezoid extends Quadrilateral{
	Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4,double y4){
		super(x1,x2,x3,x4,y1,y2,y3,y4);
	}
	public double area(){
		System.out.println(" In Trapezoid ");
		System.out.println(super.toString());
		double a=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		double b=Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
		double c=Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
		double d=Math.sqrt(Math.pow((x1-x4),2)+Math.pow((y1-y4),2));
		
		double h=Math.sqrt((-a+b+c+d)*(a-b+c+d)*(a-b-c+d)*(a-b+c-d))/(2*(a-b));
		
		return 0.5*h*(a+b);
	}
}

// Parallelogram
class Parallelogram extends Quadrilateral{
	double h;
	Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4,double y4, double h){
		super(x1,x2,x3,x4,y1,y2,y3,y4);
		this.h =h;
	}
	public double area(){
		System.out.println(" In Parallelogram ");
		System.out.println(super.toString());
		System.out.println("In Parallelogram");
		double d1=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		return d1*h;
	}
}

// Rectangle
class Rectangle extends Quadrilateral{
	Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4,double y4){
		super(x1,x2,x3,x4,y1,y2,y3,y4);
	}
	public double area(){
		System.out.println(" In Rectangle ");
		System.out.println(super.toString());
		double d1=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		double d2=Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
		return d1*d2;
	}
}

// Square
class Square extends Quadrilateral{
	Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4,double y4){
		super(x1,x2,x3,x4,y1,y2,y3,y4);
	}
	public double area(){
		System.out.println(" In Square ");
		System.out.println(super.toString());
		double d1=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return d1*d1;
	}
}

public class InheritanceQ1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrilateral q = new Square(1,2,3,4,5,6,7,8);
		System.out.println("Area of the Square is: "+q.area());
		System.out.println();
		
		Quadrilateral t = new Trapezoid(1,2,3,4,5,6,7,8);
		System.out.println("Area of the Trapezoid is: "+t.area());
		System.out.println();
		
		Quadrilateral p = new Parallelogram(1,2,3,4,5,6,7,8, 9); // Adding another argument height
		System.out.println("Area of the Parallelogram is: "+p.area());
		System.out.println();
		
		Quadrilateral r = new Rectangle(1,2,3,4,5,6,7,8);
		System.out.println("Area of the Rectangle is: "+r.area());
		System.out.println();
	}

}

/*
 * OutPut->
 In Square 
Coordinates [x1=1.0, x2=5.0, x3=2.0, x4=6.0, y1=3.0, y2=7.0, y3=4.0, y4=8.0]
Area of the Square is: 32.00000000000001

 In Trapezoid 
Coordinates [x1=1.0, x2=5.0, x3=2.0, x4=6.0, y1=3.0, y2=7.0, y3=4.0, y4=8.0]
Area of the Trapezoid is: 1.1094829821173818E-6

 In Parallelogram 
Coordinates [x1=1.0, x2=5.0, x3=2.0, x4=6.0, y1=3.0, y2=7.0, y3=4.0, y4=8.0]
In Parallelogram
Area of the Parallelogram is: 50.91168824543143

 In Rectangle 
Coordinates [x1=1.0, x2=5.0, x3=2.0, x4=6.0, y1=3.0, y2=7.0, y3=4.0, y4=8.0]
Area of the Rectangle is: 32.00000000000001


  */
