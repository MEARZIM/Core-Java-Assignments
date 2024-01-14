/**
 * 
 */
package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * vWrite a program that inputs the names of people into different array list, A and B. Array A has N
	number of names while array B has M number of names, with no duplicates in either of them. Merge
	arrays A and B into a single array list C, such that the resulting array list is sorted alphabetically.
	Display all the three arrays list, A, B and C, stored alphabetically.
 */
public class Question3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		
		ArrayList<String> nameList1 = new ArrayList<String>();
		List<String> names = Arrays.asList("Rams","Sams","Madhu","Rams");
		set.addAll(names);
		nameList1.addAll(set);
		
		ArrayList<String> nameList2 = new ArrayList<String>();
		names = Arrays.asList("Ayan","Samal","ABhi","Rajat","Zeshan", "Ayan");
		set.clear();
		set.addAll(names);
		nameList2.addAll(set);
		
		System.out.print("Name List 1 : ");
		for(String element : nameList1) {
			System.out.print(element+", ");
		}
		
		System.out.print("\nName List 2 : ");
		Iterator<String> itr = nameList2.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+", ");
		}
		
		ArrayList<String> mergeArray = new ArrayList<String>();
		mergeArray.addAll(nameList1);
		mergeArray.addAll(nameList2);
		
		Collections.sort(mergeArray);
		
		System.out.print("\nName mergeArray : ");
		itr = mergeArray.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+", ");
		}
	}

}
