/**
 * 
 */
package javaAssignment4And3;

/**
 *  Create a class with a private field and a private method. Create an inner class with a method
	that modifies the outer class field and calls the outer class method. In a second outer class
	method, create an object of the inner class and call it’s method, then show the effect on the
	outer class object.
 */

class Outer{
	private int number=10;
	private void outer1Modifies(){
		System.out.println("In Outer1 Number is :" +this.number);
	}
	class Inner1{
		public void usingInnerClassMethodModifiesouter1(int n){
			number =n;
			outer1Modifies();
		}
	}
	public void OuterMethord(){
		System.out.println("Before modification : Number = "+number);
		Inner1 ob = new Inner1();
		ob.usingInnerClassMethodModifiesouter1(90);
		System.out.println("after modification : Number = "+number);
	}
}
public class Ass4q4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		o.OuterMethord();
	}

}
/*
 * OutPut->
Before modification : Number = 10
In Outer1 Number is :90
after modification : Number = 90

*/
