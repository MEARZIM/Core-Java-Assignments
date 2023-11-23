/**
 * 
 */
package strings;

import java.util.Scanner;

/**
 * Write a program to accept a string from the user and find out the following statistics:

		(a) Count of uppercase character
		(b) Count of lowercase character
		(c) Count of digits
		(d) Count of spaces
 */
public class StringQ4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any String: ");
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		
		 // Initialize counters
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int spaceCount = 0;
		
		for(char c : inputStr.toCharArray()) {
			if(Character.isUpperCase(c)) {
				uppercaseCount++;
			}else if (Character.isLowerCase(c)) {
				lowercaseCount++;
			}else if(Character.isDigit(c)) {
				digitCount++;
			}else if (Character.isWhitespace(c)) {
				spaceCount++;
			}
		}
		
		// Display
		System.out.println("Count of Uppercase Characters: " + uppercaseCount);
        System.out.println("Count of Lowercase Characters: " + lowercaseCount);
        System.out.println("Count of Digits: " + digitCount);
        System.out.println("Count of Spaces: " + spaceCount);
        
        sc.close();
	}

}
