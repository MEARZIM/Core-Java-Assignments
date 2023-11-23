/**
 * 
 */
package strings;

/**
 *  Write a method (not the entire application) called CountVowels, which takes the input
	arguments as character and checks whether it is a vowel; increment the instance variable
	called vCnt by 1.
 */
class VowelCounter{
	private int vCnt = 0; // Instance variable to count vowels

    // Method to count vowels
    public void countVowels(char ch) {
        // Convert the character to lowercase for case-insensitive comparison
        char lowercaseCh = Character.toLowerCase(ch);

        // Check if the character is a vowel
        if (lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o' || lowercaseCh == 'u') {
            vCnt++; // Increment the vowel count
        }
    }

    // Getter method to retrieve the vowel count
    public int getVowelCount() {
        return vCnt;
    }
}


public class StringQ6 {

	/**
	 * @param args
	 */

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		VowelCounter vowelCounter = new VowelCounter(); // Create an instance of the class

	    // Test the countVowels method with a character
	    vowelCounter.countVowels('A');
	    vowelCounter.countVowels('b');
	    vowelCounter.countVowels('e');

	    // Display the vowel count
	    System.out.println("Vowel Count: " + vowelCounter.getVowelCount());
	}

}
