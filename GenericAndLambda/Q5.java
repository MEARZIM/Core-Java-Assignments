/**
 * 
 */
package GenericAssignment;

/**
 * Write the following methods that return a lambda expression performing a
 * specified action: isOdd(): The lambda expression must return true if a number
 * is odd or false if it is even. isPrime(): The lambda expression must return
 * true if a number is prime or false if it is composite. isPalindrome(): The
 * lambda expression must return true if a number is a palindrome or false if it
 * is not.
 */
public class Q5 {

	interface OddChecker {
		boolean check(int number);
	}

	interface PrimeChecker {
		boolean check(int number);
	}

	interface PalindromeChecker {
		boolean check(int number);
	}

	public static OddChecker isOdd() {
		return n -> n % 2 != 0;
	}

	public static PrimeChecker isPrime() {
		return n -> {
			if (n <= 1) {
				return false;
			}
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		};
	}
	
	public static PalindromeChecker isPalindrome() {
        return n -> {
            String strNum = Integer.toString(n);
            String reversed = new StringBuilder(strNum).reverse().toString();
            return strNum.equals(reversed);
        };
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 9;
        int num2 = 11;
        int num3 = 131;

        System.out.println("Is " + num1 + " odd? : " + isOdd().check(num1));
        System.out.println("Is " + num2 + " prime? :" + isPrime().check(num2));
        System.out.println("Is " + num3 + " a palindrome? : " + isPalindrome().check(num3));
	}

}
