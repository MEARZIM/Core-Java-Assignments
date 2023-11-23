/**
 * 
 */
package strings;

/**
    * Write a program that takes a String from the user on the command-line and print it in
	  reverse.
		“This is a test” must be printed as: “test a is This”.
 */
public class StringQ3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args.length == 0) {
			
	        System.out.println("Please provide a string as a command line argument.");
	        return;
	    }
		
		System.out.print("Reverse String :");
		for(int i=args.length-1; i>=0; i--) {
			System.out.print(args[i]+ " ");
		}
		
	}

}
/*
 * OutPut->
Reverse String :test a is This 
*/
