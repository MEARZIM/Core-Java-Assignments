/**
 * 
 */
package strings;

/**
 *  Write a Java class called ArrayExample to declare an array of String objects called
	Products of the size 10, assign values to each element while declarations and print and
	sort them.
 */
public class StringQ5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] products = {"Product1", "Product4", "Product2", "Product8", "Product5", "Product3", "Product7", "Product6", "Product9"};
		
		String temp;
		// Applying Bubble Sort
		for (int i=0; i<products.length; i++) {
			for (int j=1; j<products.length-i; j++) {
				if(products[j-1].compareTo(products[j])>0) {
					// Swapping
					temp = products[j-1];
					products[j-1]= products[j];
					products[j]= temp;
				}
			}
		}
		
		// Display Sorted Array
		System.out.print("Sorted Array is :");
		for (String product : products) {
			System.out.print(product +", ");
		}
	}

}
/*
 * OutPut - >
Sorted Array is :Product1, Product2, Product3, Product4, Product5, Product6, Product7, Product8, Product9, 
*/
