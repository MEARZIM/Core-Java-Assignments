/**
 * 
 */
package GenericAssignment;

/**
 * Write a program to create a thread using a lambda expression.
 */
public class Q8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th = new Thread(()->{
			System.out.println("Hello, I am Lambda Thread.");
		});
		
		th.start();
	}

}
