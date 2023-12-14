/**
 * 
 */
package ThreadsCoreConcepts;

import java.util.Scanner;

/**
 *  Write a program to sort a list of strings using multithreading. Create one of the threads
	that take a string as input from the user, another thread that sorts the strings and finally
	another thread that displays the sorted list of strings. Each of the input, sort, and display
	methods is to be synchronized.
 */
class StringManupulation {
	final private int MAX_SIZE=100;
	private String arrStr[] = new String[MAX_SIZE];
	private int count=0;
	
	public synchronized void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strings (type 'done' to finish inputBuffer):");

        while (true) {
            String input = sc.nextLine();
            if (input.equals("done")) {
                break;
            }
            arrStr[count++] = input;
        }
        sc.close();
	}
	
	public synchronized void sortArrayOfString() {
		for(int i=0; i<(this.count-1); i++) {
			for(int j=0; j<(this.count-i-1);j++) {
				if(this.arrStr[j].compareTo(this.arrStr[j+1])>0) {
					 String temp = this.arrStr[j];
					 this.arrStr[j] = this.arrStr[j + 1];
					 this.arrStr[j + 1] = temp;
				}
			}
		}
	}
	
    public synchronized void displaySortedArrayOfString() {
        System.out.println("Sorted Strings:");
        for (int i = 0; i < this.count; i++) {
            System.out.println(this.arrStr[i]);
        }
    }
}

public class ThreadsQ3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringManupulation sm = new StringManupulation();
		
		Thread inputBuffer = new Thread(()->sm.takeInput());
		Thread sortString = new Thread(()->sm.sortArrayOfString());
		Thread displayArrayofStr = new Thread(()->sm.displaySortedArrayOfString());
		
		
		inputBuffer.start();
		try {
			inputBuffer.join();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
		sortString.start();
		try {
			sortString.join();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
		displayArrayofStr.start();
		try {
			displayArrayofStr.join();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}

}
/*
 * OutPut->
Enter Strings (type 'done' to finish inputBuffer):
Ayan
Saha
Full
Moon
Sun
Groot
IronMan
Captain
Book
Zoo
done
Sorted Strings:
Ayan
Book
Captain
Full
Groot
IronMan
Moon
Saha
Sun
Zoo

 */