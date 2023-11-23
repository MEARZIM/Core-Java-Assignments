import java.util.Scanner;

/**
 * 
 */

/**
 *Write a program to accept a string from the user and find out the following statistics:

			(a) Count of uppercase character
			(b) Count of lowercase character
			(c) Count of digits
			(d) Count of spaces
 */
public class Q4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
       

        // Initialize counters
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int spaceCount = 0;

        // Iterate through each character in the input string
        for (char ch : inputString.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            }
        }

        // Display things
        System.out.println("Count of Uppercase Characters: " + uppercaseCount);
        System.out.println("Count of Lowercase Characters: " + lowercaseCount);
        System.out.println("Count of Digits: " + digitCount);
        System.out.println("Count of Spaces: " + spaceCount);
        
        scanner.close();
	}

}
/*
 * Output ->
Enter a string: Ayan Saha
Count of Uppercase Characters: 2
Count of Lowercase Characters: 6
Count of Digits: 0
Count of Spaces: 1

 */