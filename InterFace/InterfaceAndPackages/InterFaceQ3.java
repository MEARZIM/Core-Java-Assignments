/**
 * 
 */
package InterfaceAndPackages;

/**
 *  Create a private inner class that implements a public interface. Write a method that
	returns a reference to an instance of the private inner class, up cast to the interface. Show
	that the inner class is completely hidden by trying to downcast to it.
 */

interface PublicInterFace{
	public void dispaly();
}
class OuterClass {
	private class InnerClass implements PublicInterFace{
		InnerClass(){
			System.out.println("In InnerClass");
		}

		public void dispaly() {
			// TODO Auto-generated method stub
			System.out.println("Methord Overriden");
		}
		
	}
	public PublicInterFace getInnerOb(){
		return new InnerClass();
	}
}
public class InterFaceQ3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass ob = new OuterClass();
		PublicInterFace in = ob.getInnerOb();
		
		in.dispaly();
	}

}
/*
 * OutPut->
In InnerClass
Methord Overriden

 */