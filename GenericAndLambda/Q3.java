package GenericAssignment;

/**
 * Write a Generic Method that can perform the sorting of any type of data.
 *
 */

class Sorting<T extends Comparable<T>>{
	
	public T[] genericSort(T[] inputArr) {
		T temp;
		for (int i=0; i<inputArr.length; i++) {
			for (int j=0; j<inputArr.length-i-1; j++) {
				if(inputArr[j].compareTo(inputArr[j+1])>0) {
					temp = inputArr[j];
					inputArr[j]=inputArr[j+1];
					inputArr[j+1]=temp;
				}
			}
		}
		// Display
		return inputArr;
	}
	
	
}
public class Q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorting<Integer> obj = new Sorting<Integer>();
		
		Integer arr[] = {1,5,7,9,6,3,4};
		
		Integer result[] = obj.genericSort(arr);
		
		System.out.print("The Sorted array is: ");
		for (Integer i: result) {
			System.out.print(i+" ");
		}
	}

}
