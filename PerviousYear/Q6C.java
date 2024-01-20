/**
 * 
 */
package PerviousYear;

/**
 *  Create a private inner class that implements a public interface. Write a method that 
	returns a reference to an instance of the private inner class, up cast to the interface. 
	Show that the inner class is completely hidden by trying to downcast it. 
 */

public class Q6C {
	public interface testInterface{
		void showData();
	}


	private class Testhandler implements testInterface{

		@Override
		public void showData() {
			// TODO Auto-generated method stub
			System.out.println("In private class");
		}
		
	}
	
	public Testhandler getInnerClassInstance() {
		return new Testhandler();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q6C obj = new Q6C();
		
		testInterface it = obj.getInnerClassInstance();
		
		it.showData();
	}

}
