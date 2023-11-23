/**
 * 
 */

/**
 *  Write a Java class called ArrayExample to declare an array of String objects called
	Products of the size 10, assign values to each element while declarations and print and
	sort them.
 *
 */
public class Q5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Products of the size 10
		 String[] products = {"Product1", "Product4", "Product2", "Product8", "Product5", "Product3", "Product7", "Product6", "Product9"};
		 
		 for (int i=0; i<products.length-1; i++){
			 for (int j=i+1; j<products.length; j++){
				 if(products[i].compareTo(products[j])>0){
//					 swapping
					 String temp  = products[i];
					 products[i] = products[j];
					 products[j]= temp;
				 }
			 }
		 }
		 
		 System.out.print("The sorted array is: ");
		 // Display the sorted array
		 for (String word  : products){
			 System.out.print(word +", ");
		 }
	}

}
/*
 * Output - >
The sorted array is: Product1, Product2, Product3, Product4, Product5, Product6, Product7, Product8, Product9, 
 */
