/**
 * 
 */
package javaAssingment1And2;

import java.util.Scanner;

/**
 *  A company has four salespeople (1 to 4) who sell five different products (1 to 5). Once a
	day, each salesperson passes in a slip for each different type of product sold. Each slip
	contains:
		* The salesperson number
		* The product number
		* The total dollar value of that product sold that day
		
	Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the
	information from all of the slips for last month is available. Write a program that will
	read all this information for last month’s sales and summarize the total sales by
	salesperson by product. All totals should be stored in the double-subscripted array sales.
	After processing all the information for last month, print the results in tabular format with
	each of the columns represent a particular salesperson and each of the rows representing a
	particular product. Cross total each row to get the total sales of each product for last
	month, and cross total each column to get the total sales by salesperson for last month.
	Your tabular printout should include these cross totals to the right of the totaled rows and
	to the bottom of the totaled columns.
 */

class SaleDetails{
	private int numberOfProduct;
	private int numberSalePeople;
	private double sales[][];
	
	public SaleDetails(int numberOfProduct, int numberSalePeople){
		this.numberOfProduct = numberOfProduct;
		this.numberSalePeople = numberSalePeople;
		sales = new double [numberOfProduct][numberSalePeople];

	}
	
	public void recordSalesData(int day, int salesPerson, int product, double value) {
	    sales[product-1][salesPerson-1] += value; 
	    
	}

	public void printSalesDetails() {
	    System.out.println("Sales Summary for Last Month:");
	     
	    // 1st Section( Printing the details ROW )
	    System.out.print("Product/Salesperson\t");
	     
	    for (int i = 0; i < numberSalePeople; i++) {
	         System.out.print((i + 1) + "\t");
	    }
	     
	    System.out.println("Total"); // each product total sale 
	     
	    // 2nd Section (Print the product id and the Details-of-Array with total in every row )
	    // Cross total each row to get the total sales of each product for last month
	    for (int product = 0; product < numberOfProduct; product++) {
	    	
	        double productTotal = 0;
	        System.out.print("Product " + (product + 1) + "\t\t");
	         
	        for (int salesperson = 0; salesperson < numberSalePeople; salesperson++) { 
	            System.out.print(sales[product][salesperson] + "\t");
	            productTotal += sales[product][salesperson];
	        }
	         
	        System.out.println(productTotal);
	    }
	    
	    
	    // 3rd Section (Each SalesMan total Sale)
	    System.out.print("Total\t\t\t"); //Each SalesMan total Sale
	    
        for (int salesperson = 0; salesperson < numberSalePeople; salesperson++) {
        	double salesPersonTotal = 0;
	        for (int product = 0; product < numberOfProduct; product++) {
	        	salesPersonTotal += sales[product][salesperson];
	        }
	        System.out.print(salesPersonTotal + "\t");
	    }
        
        //Grand Total Section
	    double grandTotal = 0;
	    for (int product = 0; product < numberOfProduct; product++) {
	    	
	        for (int salesperson = 0; salesperson < numberSalePeople; salesperson++) {
	            grandTotal += sales[product][salesperson];
	        }
	     }
	        System.out.println(grandTotal + " Grand Total");
    }
}


public class Ass2Q10 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = sc.nextInt();

        System.out.print("Enter the number of products: ");
        int numProducts = sc.nextInt();
        
        // object Creation
        SaleDetails sd = new SaleDetails(numProducts,numSalespeople);

        for (int day = 1; day <= 30; day++) {
        	
            System.out.println("Enter sales data for day " + day + ":");
            System.out.print("Salesperson number (1 to " + numSalespeople + "): ");
            int salesPerson = sc.nextInt();
            
            System.out.print("Product number (1 to " + numProducts + "): ");
            int product = sc.nextInt();
            
            System.out.print("Total dollar sold: ");
            double value = sc.nextDouble();

            sd.recordSalesData(day, salesPerson, product, value);
        }

        sd.printSalesDetails();

        sc.close();
		
	}

}

/*
 * OutPut ->

Enter the number of salespeople: 4
Enter the number of products: 5
Enter sales data for day 1:
Salesperson number (1 to 4): 1
Product number (1 to 5): 1
Total dollar sold: 22
Enter sales data for day 2:
Salesperson number (1 to 4): 1
Product number (1 to 5): 2
Total dollar sold: 45
Enter sales data for day 3:
Salesperson number (1 to 4): 1
Product number (1 to 5): 3
Total dollar sold: 8
Enter sales data for day 4:
Salesperson number (1 to 4): 1
Product number (1 to 5): 4
Total dollar sold: 65
Enter sales data for day 5:
Salesperson number (1 to 4): 1
Product number (1 to 5): 5
Total dollar sold: 34
Enter sales data for day 6:
Salesperson number (1 to 4): 2
Product number (1 to 5): 1
Total dollar sold: 40
Enter sales data for day 7:
Salesperson number (1 to 4): 2
Product number (1 to 5): 2
Total dollar sold: 10
Enter sales data for day 8:
Salesperson number (1 to 4): 2
Product number (1 to 5): 3
Total dollar sold: 5
Enter sales data for day 9:
Salesperson number (1 to 4): 2
Product number (1 to 5): 4
Total dollar sold: 20
Enter sales data for day 10:
Salesperson number (1 to 4): 2
Product number (1 to 5): 5
Total dollar sold: 1
Enter sales data for day 11:
Salesperson number (1 to 4): 3
Product number (1 to 5): 1
Total dollar sold: 30
Enter sales data for day 12:
Salesperson number (1 to 4): 3
Product number (1 to 5): 2
Total dollar sold: 8
Enter sales data for day 13:
Salesperson number (1 to 4): 3
Product number (1 to 5): 3
Total dollar sold: 54
Enter sales data for day 14:
Salesperson number (1 to 4): 3
Product number (1 to 5): 4
Total dollar sold: 7
Enter sales data for day 15:
Salesperson number (1 to 4): 3
Product number (1 to 5): 5
Total dollar sold: 11
Enter sales data for day 16:
Salesperson number (1 to 4): 4
Product number (1 to 5): 1
Total dollar sold: 44
Enter sales data for day 17:
Salesperson number (1 to 4): 4
Product number (1 to 5): 2
Total dollar sold: 91
Enter sales data for day 18:
Salesperson number (1 to 4): 4
Product number (1 to 5): 3
Total dollar sold: 5
Enter sales data for day 19:
Salesperson number (1 to 4): 4
Product number (1 to 5): 4
Total dollar sold: 33
Enter sales data for day 20:
Salesperson number (1 to 4): 4
Product number (1 to 5): 5
Total dollar sold: 23
Enter sales data for day 21:
Salesperson number (1 to 4): 2
Product number (1 to 5): 2
Total dollar sold: 56
Enter sales data for day 22:
Salesperson number (1 to 4): 4
Product number (1 to 5): 1
Total dollar sold: 34
Enter sales data for day 23:
Salesperson number (1 to 4): 1
Product number (1 to 5): 2
Total dollar sold: 3
Enter sales data for day 24:
Salesperson number (1 to 4): 1
Product number (1 to 5): 5
Total dollar sold: 4
Enter sales data for day 25:
Salesperson number (1 to 4): 1
Product number (1 to 5): 5
Total dollar sold: 44
Enter sales data for day 26:
Salesperson number (1 to 4): 3
Product number (1 to 5): 2
Total dollar sold: 22
Enter sales data for day 27:
Salesperson number (1 to 4): 2
Product number (1 to 5): 2
Total dollar sold: 44
Enter sales data for day 28:
Salesperson number (1 to 4): 2
Product number (1 to 5): 1
Total dollar sold: 88
Enter sales data for day 29:
Salesperson number (1 to 4): 2
Product number (1 to 5): 1
Total dollar sold: 11
Enter sales data for day 30:
Salesperson number (1 to 4): 1
Product number (1 to 5): 1
Total dollar sold: 3
Sales Summary for Last Month:
Product/Salesperson	1	    2	    3	    4	    Total
Product 1		    25.0	139.0	30.0	78.0	272.0
Product 2		    48.0	110.0	30.0	91.0	279.0
Product 3		    8.0	    5.0	    54.0	5.0	    72.0
Product 4		    65.0	20.0	7.0	    33.0	125.0
Product 5		    82.0	1.0	    11.0	23.0	117.0
Total			    228.0	275.0	132.0	230.0	865.0 Grand Total

*/
