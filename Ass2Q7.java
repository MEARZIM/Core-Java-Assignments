/**
 * 
 */
package javaAssingment1And2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  Given are two one-dimensional arrays A & B, which are sorted in ascending order. Write
	a program to merge them into single sorted array C that contains every item from arrays.
	A & B, in ascending order.
 */
public class Ass2Q7 {


	static void getArray(int arr[], int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no of the elements of the array a : ");
		int n = sc.nextInt();
		System.out.print("Enter the no of the elements of the array b : ");
		int x = sc.nextInt();
		
		
		//Arrays
		int a[] = new int[n];
		int b[] = new int[x];
		
		//Data Insert
		System.out.println("Enter the data in the array A : ");
		for(int i=0;i<n;i++) {
			System.out.print("a["+i+"] : ");
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a); // Sorting
		
		// display
		System.out.println("The array A is : ");
		getArray(a,n);
		
		System.out.println("Enter the data in the array B : ");
		for(int i=0;i<x;i++) {
			System.out.print("b["+i+"] : ");
			b[i] = sc.nextInt();
		}
		System.out.println();
		Arrays.sort(b);
		
		System.out.println("The array B is : ");
		getArray(b,x);
		
		sc.close();
		
		int y = n+x;
		int c[] = new int[y];
		for(int i=0;i<n;i++) {
			c[i]=a[i];
		}
		int i,j;
		for(i=0,j=n;j<y;j++,i++) {
			c[j]=b[i];
		}
		System.out.println();
		Arrays.sort(c);
		
		System.out.println("The array C is : ");
		for(i=0;i<y;i++) {
			System.out.print(c[i]+" ");
			
		}
		System.out.println();
		sc.close();
	}
	
}

/*
 * Output 1 -> 
Enter the no of the elements of the array a : 3
Enter the no of the elements of the array b : 4
Enter the data in the array A : 
a[0] : 2
a[1] : 8
a[2] : 1
The array A is : 
1 2 8 
Enter the data in the array B : 
b[0] : 5
b[1] : 33
b[2] : 77
b[3] : 90

The array B is : 
5 33 77 90 

The array C is : 
1 2 5 8 33 77 90 

*/