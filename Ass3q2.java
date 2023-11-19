/**
 * 
 */
package javaAssignment4And3;

import java.util.Scanner;

/**
 *  Create a class Queue to implement queue data structure with constructors. Define suitable
	methods for insertion & deletion of elements to & from the queue. Write a program for this,
	clearly specifying the overflow & underflow conditions.
 */

class Queue{
	private int[] q;
	private int front,rear,capacity;
	
	Queue(){
		capacity=5;
		q = new int[capacity];
		this.front=-1;
		this.rear=-1;
	}
	
	// Queue OverFlow
	private boolean isFull (){
		return (this.capacity-1) == this.rear;
	}
	
	// Queue UnderFlow
	private boolean isEmpty (){
		return this.front == -1;
	}
	
	// Inserting Element in Queue
	public void enQueue(int ele){
		if(isFull()){
			System.out.println("-----------------------------");
			System.out.println("OverFlow(Queue is Full)");
		}else{
			// If Queue is Empty Means the initial condition   
			if(isEmpty()) {
				this.front++;
				this.rear++;
				this.q[this.rear]=ele;
				System.out.println("------------------");
				System.out.println(q[rear]+" is inserted");
			
			}else {
				q[++rear]=ele;
				System.out.println("------------------");
				System.out.println(q[rear]+" is inserted");
			}
			
		}
	}
	
	//Deleting element in Queue
	public void deQueue(){
		int ele;
		if(isEmpty()){
			System.out.println("-----------------------------");
			System.out.println("UnderFlow(Queue is Empty)");
		}else{
			if(this.front == this.rear) {
				ele= this.q[this.front];
				this.front=-1;
				this.rear=-1;
				System.out.println("The deleted element is : "+ele);
			}
			else {
				ele= this.q[this.front];
				this.front++;
				System.out.println("The deleted element is : "+ele);
			}
		}
			
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("-----------------------------");
			System.out.println("Queue is Empty(UnderFlow)");
		}else{
			System.out.println("-----------------------------");
			System.out.print("The element in Queue is : ");
			for (int i=front; i<=rear; i++){
				System.out.print(" "+q[i]+" ");
			}
			System.out.println();
		}
	}
}
public class Ass3q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		
		Scanner sc = new Scanner(System.in);
		
		int ch,ele;
		
		System.out.println("Welcome!! This system is made by Ayan Saha");
		while (true) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1. Push in Queue ");
			System.out.println("2. Pop in Queue ");
			System.out.println("3. Display Queue ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("4. for Exit");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Please Enter Your Choice: ");
			ch = sc.nextInt();
			System.out.println("------------------------------");
			
			switch (ch){
			case 1: System.out.println("Enter the element :");
					ele = sc.nextInt();
					q.enQueue(ele);
			break;
			
			case 2: q.deQueue();
					break;
			
			case 3: q.display();
					break;
					
			case 4: sc.close();
					System.out.println("Thanks For using this system...");
					System.out.println("Exiting... :-)");
					System.exit(0);
					
			default: System.out.println("You Enter a wrong choice");
			
			}
		}
	}

}

/*
 * OutPut->
Welcome!! This system is made by Ayan Saha
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Queue 
2. Pop in Queue 
3. Display Queue 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
4. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
Enter the element :
33
------------------
33 is inserted
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Queue 
2. Pop in Queue 
3. Display Queue 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
4. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
2
------------------------------
The deleted element is : 33
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Queue 
2. Pop in Queue 
3. Display Queue 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
4. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
2
------------------------------
-----------------------------
UnderFlow(Queue is Empty)
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Queue 
2. Pop in Queue 
3. Display Queue 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
4. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
Enter the element :
45
------------------
45 is inserted
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Queue 
2. Pop in Queue 
3. Display Queue 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
4. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
Enter the element :
89
------------------
89 is inserted
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Queue 
2. Pop in Queue 
3. Display Queue 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
4. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
3
------------------------------
-----------------------------
The element in Queue is :  45  89 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Queue 
2. Pop in Queue 
3. Display Queue 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
4. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
Enter the element :
45
------------------
45 is inserted
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Queue 
2. Pop in Queue 
3. Display Queue 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
4. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
Enter the element :
89
------------------
89 is inserted
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Queue 
2. Pop in Queue 
3. Display Queue 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
4. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
Enter the element :
34
------------------
34 is inserted
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Queue 
2. Pop in Queue 
3. Display Queue 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
4. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
Enter the element :
33
-----------------------------
OverFlow(Queue is Full)
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Queue 
2. Pop in Queue 
3. Display Queue 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
4. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
22
------------------------------
You Enter a wrong choice
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Queue 
2. Pop in Queue 
3. Display Queue 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
4. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
3
------------------------------
-----------------------------
The element in Queue is :  45  89  45  89  34 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Queue 
2. Pop in Queue 
3. Display Queue 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
4. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
2
------------------------------
The deleted element is : 45
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Queue 
2. Pop in Queue 
3. Display Queue 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
4. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
3
------------------------------
-----------------------------
The element in Queue is :  89  45  89  34 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Queue 
2. Pop in Queue 
3. Display Queue 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
4. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
4
------------------------------
Thanks For using this system...
Exiting... :-)

 */
