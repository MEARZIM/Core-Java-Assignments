/**
 * 
 */
package Interface2Driver;
import Interface2Helper1Package.Outer;
import Interface2MainInerface.MainInterface;

/**
 *  Create an interface with at least one method, in its own package. Create a class in a
	separate package. Add a protected inner class that implements the interface. In a third
	package, inherit from your class and, inside a method, return an object of the protected
	inner class, up casting to the interface during the return.
 */

class Test extends Outer{
	public MainInterface getInnerClassObject() {
		return new Inner();
	}
}

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ob = new Test();
		MainInterface in = ob.getInnerClassObject();
		in.details();
		
	}

}
/*
 * OutPut->
InnerClass Created
------------------------------------------
Package Name - >Interface2Helper1Package
Interface Merhod Override In InnerClass
------------------------------------------

 */