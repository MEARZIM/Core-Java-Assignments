/**
 * 
 */
package CollectionFrameWork;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *  Write a program that uses a StringTokenizer to tokenize a line of text input by the user and places
	each token in a treeSet. Print the elements of the treeSet. [Note: This should cause the elements to be
	printed in ascending sorted order.]
 */
public class Question2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter The string: ");
		Scanner sc = new Scanner(System.in);
		String userInputText = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(userInputText);
		
		
		TreeSet<String> tokenSet = new TreeSet<String>();
		while (token.hasMoreElements()) {
			tokenSet.add((String) token.nextElement());
		}
		
		Iterator<String> iterator = tokenSet.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

		
		sc.close();
	}

}
