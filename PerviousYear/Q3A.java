/**
 * 
 */
package PerviousYear;

/**
 *  A unique digit is a positive integer (without leading zeros) with no duplicate digits. 
	For example 7, 135 and 214 are all. Whereas 33, 3121 and 300 are not.  Given two 
	positive integers, m and n, where m<n. 
	Write a program to determine how many unique digit integers are there in the range 
	of m and n (both inclusive) and display them. 
 */
import java.util.ArrayList;
import java.util.HashSet;

public class Q3A {

	/**
	 * @param args
	 */
	
	public static boolean IsUniqueElement(int number) {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int temp = number;
		while (temp != 0 ) {
			int rem = temp % 10;
			digits.add(rem);
			temp /=10;
		}
		HashSet<Integer> UniqueDigit = new HashSet<Integer>();
		UniqueDigit.addAll(digits);
		
		if(digits.size() == UniqueDigit.size()) {
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=100;
		int n =120;
		
		for (int i=m ; i<=n; i++) {
			if(IsUniqueElement(i)) {
				System.out.println(i+", ");				
			}
		}
	}

}
