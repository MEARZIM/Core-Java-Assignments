/**
 * 
 */
package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Write a java program to check the number where the difference between every adjacent digit should be 1
	using ArrayList.
 */
public class Question6 {

	/** Explanation::
	 ** Input: 54321

		The digits are 5, 4, 3, 2, and 1. The differences between adjacent digits are:
		
		Difference between 5 and 4: 1
		Difference between 4 and 3: 1
		Difference between 3 and 2: 1
		Difference between 2 and 1: 1
		The program should output that the adjacent digit difference is 1 for the number 54321.
	 */
	private static boolean hasAdjacentDigitDifferenceOne(int number) {
		ArrayList<Integer> digits = new ArrayList<>();
		while(number>0) {
			digits.add(0, number%10);
			number/=10;
		}
		
		for(int i=0; i < digits.size()-1 ; i++) {
			int diff = Math.abs(digits.get(i)- digits.get(i+1));
			if(diff != 1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a integer Number");
		int number = sc.nextInt();
		
		
		if (hasAdjacentDigitDifferenceOne(number)) {
            System.out.println("The adjacent digit difference is 1 for the number " + number);
        } else {
            System.out.println("The adjacent digit difference is not 1 for the number " + number);
        }
		sc.close();
	}

}
