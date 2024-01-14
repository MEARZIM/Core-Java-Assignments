/**
 * 
 */
package CollectionFrameWork;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *  Write a program that reads in a series of first names and stores them in a LinkedList. Do not store
	duplicate names. Allow the user to search for a first name.
 */
public class Question1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<String> nameOfList =  new LinkedList<String>();
		
		// Adding some Default names
		nameOfList.add("Ayan");
		nameOfList.add("Sayan");
		nameOfList.add("Ankita");
		nameOfList.add("Samal");
		nameOfList.add("Pratik");
		
		System.out.println("Default Names");
		for (String pointer: nameOfList) {
			System.out.println("Name : " + pointer);
		}
		
		System.out.println("-----------------------------------");
		System.out.println("Enter the Name you want to search");
		String name = sc.next();
		
		if(nameOfList.contains(name)) {
			System.out.println("Name Found. location at "+ (nameOfList.indexOf(name)+1));
		}else {
			System.out.println("Name Not Found");
		}
		sc.close();
	}

}
