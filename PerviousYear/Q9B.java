/**
 * 
 */
package PerviousYear;

/**
 * Write a generic method that can perform the sorting of any type of data. 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Sorting<T extends Comparable<T>>{
	
	
	public T[] BubbleSort(T[] a) {
		for(int i=0; i<a.length; i++ ) {
			for(int j=0; j <(a.length - i - 1); j++) {
				if(a[j].compareTo(a[j+1])>0) {
					T temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
	
}
public class Q9B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer demo[] = {2,8,0,1,4};
		Sorting<Integer> arr = new Sorting<Integer>();
		Integer[] output = arr.BubbleSort(demo);
		for(Integer i: output) {
			System.out.print(i+" ,");
		}
	}

}
