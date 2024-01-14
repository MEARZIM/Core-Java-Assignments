/**
 * 
 */
package GenericAssignment;

/**
 * 
 */
public class Q7 {

	interface CaesarDecoder {
		String decode(String input);
	}

	/*
	 * ch: This is the current character being processed in the input string.
	 * 
	 * base: This is the base value for the character set (either 'A' for uppercase
	 * letters or 'a' for lowercase letters). It is used to normalize the character
	 * values.
	 * 
	 * rotation: This is the rotation value used in the Caesar cipher. It represents
	 * the number of positions each letter is shifted in the alphabet.
	 * 
	 * (ch - base - rotation + 26): This part calculates the new position of the
	 * character after applying the Caesar cipher decryption. It subtracts the base
	 * value to normalize the character, then subtracts the rotation value, and adds
	 * 26 to ensure a positive result. The addition of 26 is crucial because it
	 * helps handle cases where the result becomes negative.
	 * 
	 * % 26: This is the modulo operation with 26, which ensures that the result
	 * stays within the range of 0 to 25. It effectively handles cases where the
	 * character position exceeds the length of the alphabet.
	 * 
	 * + base: Finally, this part adds back the base value to re-normalize the
	 * character after the decryption process.
	 */
	public static CaesarDecoder createCaesarDecoder(int rotation) {
		return input -> {
			StringBuilder decodedMessage = new StringBuilder();

			for (char ch : input.toCharArray()) {
				if (Character.isLetter(ch)) {
					char base = Character.isUpperCase(ch) ? 'A' : 'a';
					char decodedChar = (char) ((ch - base - rotation + 26) % 26 + base);
					decodedMessage.append(decodedChar);
				} else {
					// Preserve non-alphabetic characters
					decodedMessage.append(ch);
				}
			}

			return decodedMessage.toString();
		};
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaesarDecoder decoder = createCaesarDecoder(5);
		
		String encryptedMessage = "hnuwtl";
		String decryptedMessage = decoder.decode(encryptedMessage);

		System.out.println("Encrypted message: " + encryptedMessage);
		System.out.println("Decrypted message: " + decryptedMessage);
	}

}
