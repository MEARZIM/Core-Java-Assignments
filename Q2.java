/**
 * 
 */

/**
 *  Write a Java class called CountAndPrintArgs to print the number of arguments passed on
	the command-line as well as the 1st letter of the arguments. For example, if the command
	line arguments are: “Mango Cucumber Apple” then the output will be
		No. of arguments – 3 MCA
	Write a main method to test the class.
 *
 */
public class Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            return;
        }

        // Print the number of arguments
        System.out.println("No. of arguments - " + args.length);

        // Print the first letter of each argument
        StringBuilder initials = new StringBuilder();
        for (String arg : args) {
            if (!arg.isEmpty()) {
                initials.append(arg.charAt(0));
            }
        }

        // Display the result
        System.out.println("Initials: " + initials.toString().toUpperCase());
	}

}
/*
 * Input -> Ayan saha
 * OutPut ->
No. of arguments - 2
Initials: AS


 */