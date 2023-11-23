/**
 * 
 */

/**
 *  Write a Java program to pass the string “Have a nice day!” from the command line, and
	display each word in a new line. Use proper import statement for this program.
 *
 */


public class Q1 {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		// Check if command line arguments are provided
        if (args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
            return;         
        }

       

        // Display each word in a new line
        for (String word : args) {
            System.out.println(word);
        }
	}

}
/*
 * Input - > ayan saha
 * OutPut - >
ayan
saha
*/
