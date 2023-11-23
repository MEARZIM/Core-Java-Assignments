/**
 * 
 */
package strings;

import java.util.Scanner;

/**
 *  Write a program to determine if a string has all Unique Characters.[remove white space]
	Given a string, determine if the string has all unique characters.
	
		Examples :
			Input: ab cd 10jk
			Output: true
			
			Input: hutg9mnd!nk9
			Output: false
 */
public class StringQ7 {

	/**
	 * @param args
	 */
	public static boolean hasUniqueCharacter(String inputStr) {
		inputStr = inputStr.replace(" ", "");
		
		for (int i=0; i <inputStr.length()-1; i++) {
			for (int j=1; j<inputStr.length(); j++) {
				if(inputStr.charAt(i)== inputStr.charAt(j)) 
					return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		
		System.out.println("Given String :"+s );
		System.out.println(hasUniqueCharacter(s));
		
		sc.close();
	}

}

/*
 * Output1->
Enter the String :
hutg9mnd!nk9
Given String :hutg9mnd!nk9
false

* Output2->
Enter the String :
ab cd 10jk
Given String :ab cd 10jk
true

*/
