/**
 * 
 */
package PerviousYear;

/**
 *  Write the following methods that return a lambda expression performing a specified 
	action: 
	isPrime(): The lambda expression must return true if a number is prime or false if it 
	is composite.   
 */


public class Q9C {
	interface Prime{
		boolean check(int number);
	}
	
	public static Prime isPrime() {
		return number ->{
//			int k=0;
//			for (int i=2; i<=number/2; i++) {
//				if(number%i==0) {
//					k++;
//				}
//			}
//			if(k==0) {
//				return true;
//			}
//			return false;
			
			if (number <= 1) {
				return false;
			}
			for (int i=2; i<=Math.sqrt(number); i++) {
				if(number%i==0) {
					return false;
				}
			}
			return true;
		};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime().check(90));
	}

}
