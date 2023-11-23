/**
 * 
 */
package strings;

/**
 *  Write a Java program to pass the string “Have a nice day!” from the command line, and
	display each word in a new line. Use proper import statement for this program.
 */
public class StringQ1 {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println("Please Enter a valid String in CMD.");
		}else {
			for (String words : args) {
				System.out.println(words);
			}
		}
		
	}

}
/*
 * Output - >
Have
a
nice
day!

 */
