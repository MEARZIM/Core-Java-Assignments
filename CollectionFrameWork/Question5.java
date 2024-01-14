/**
 * 
 */
package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */
public class Question5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		List<Integer> refArr = Arrays.asList(1,2,3,4,4,5,6);
		arr1.addAll(refArr);
		System.out.print("Array 1 Element: ");
		Iterator<Integer> itr = arr1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+", ");
		}
		
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		refArr = Arrays.asList(2,4,1);
		arr2.addAll(refArr);
		System.out.print("\nArray 2 Element: ");
		itr = arr2.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+", ");
		}
		
		HashSet<Integer> checker = new HashSet<>();
		checker.addAll(arr2);
		
		System.out.print("\nElement that are present in 1st array not in 2nd array :");
		for(Integer pointer: arr1) {
			if(!checker.contains(pointer)) {
				System.out.print(pointer+", ");
			}
		}
		
	}

}
