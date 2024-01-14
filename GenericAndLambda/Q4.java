package GenericAssignment;
/**
 *  Write a generic method that computes the Second minimum and Second maximum elements of an array
	of type T and returns a pair containing the minimum and maximum value.
 *
 */

class SecondMaxMin<T extends Comparable<T>>{
	private T[] ascendingArr;
	private T[] outputSet;
	
	/* ERROR
	SecondMaxMin(){
		outputSet = (T[]) new Object[2];
	}*/
	
	private T[] genericAscendingSort(T[] inputArr) {
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
	
	
	public T[] computeSecondMaxAndMin(T[] inputArr) {
//		outputSet = (T[]) new Object[2]; Error
		T min,max;
		this.ascendingArr = this.genericAscendingSort(inputArr);
		
		/* ERROR
		outputSet[0] = this.ascendingArr[1];
		outputSet[1] = this.ascendingArr[inputArr.length-1]; 
		return outputSet;
		*/
		
		min = this.ascendingArr[1];
		max = this.ascendingArr[inputArr.length-2]; 
		System.out.println(min+" , "+max);
		return null;
	}
	
}
public class Q4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecondMaxMin<Integer> obj = new SecondMaxMin<Integer>();
		
		Integer arr[] = {1,5,7,9,6,3,4};
		
		
		
		Integer result[] = obj.computeSecondMaxAndMin(arr);
		
		/*
		for (Integer i: result) {
			System.out.print(i+" ");
		}*/
		
	}

}
