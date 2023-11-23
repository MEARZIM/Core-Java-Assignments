/**
 * 
 */
package strings;

/**
 *  Write a Java class called CountAndPrintArgs to print the number of arguments passed on
	the command-line as well as the 1st letter of the arguments. For example, if the command
	line arguments are: 	“Mango Cucumber Apple”	 then the output will be
		No. of arguments – 3 MCA
	Write a main method to test the class.
 */
public class StringQ2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println("Please Enter a valid String in CMD.");
		}else {
			
			System.out.println("No of arguments : " + args.length);
			
			StringBuilder initials = new StringBuilder();
			
			
			for (String words : args) {
				if(!words.isEmpty()) {
					initials.append(words.charAt(0));
				}
			}
			
			System.out.println("Initials: "+ initials);
		}
	}

}
/*
 * OutPut- >
No of arguments : 3
Initials: MCA

*/
