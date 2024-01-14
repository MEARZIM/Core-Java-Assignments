/**
 * 
 */
package CollectionFrameWork;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/**
 * 
 */
public class Question4 {

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
		
		System.out.println();
		System.out.println(arr1.containsAll(arr2));
	}

}
