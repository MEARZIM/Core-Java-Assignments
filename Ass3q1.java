/**
 * 
 */
package javaAssignment4And3;

import java.util.Scanner;

/**
 *  Create a class Stack that declares a stack and the methods to perform push ( ), pop ( ) and
	display( ) operations on the stack. Create two stacks and write a menu-driven program to
	perform operations on the two stacks. Whenever the number of elements in the two stacks
	becomes equal, a message should automatically be generated displaying the number of elements
	in each stack.
 * 
 */

class Stack{
	private int s[];
	private int capacity=5;
	private int top;
	
	public Stack() {
		this.top =-1;
		s = new int [this.capacity];
	}
	
	// Stack OverFlow
	private boolean isFull(){
		return this.top == (this.capacity-1);
	}
	
	//Stack UnderFlow
	private boolean isEmpty() {
		return this.top == -1;
	}
	
	// Push Operation
	public void push (int ele) {
		if(isFull()) {
			System.out.println("-----------------------------");
			System.out.println("Stack OverFlow (Stack is Full)");
		}else {
			this.s[++this.top] = ele; 
			System.out.println("------------------");
			System.out.println(ele+" is inserted");
		}
	}
	
	// Pop Operation
	public void pop () {
		if (isEmpty()) {
			System.out.println("--------------------------------");
			System.out.println("Stack UnderFlow (Stack is Empty)");
		}else {
			int ele = s[this.top];
			this.top--;
			System.out.println("------------------");
			System.out.println(ele+ " is Removed");
		}
	}
	
	//Display Stack
	public void display() {
		if (isEmpty()) {
			System.out.println("--------------------------------");
			System.out.println("Stack UnderFlow (Stack is Empty)");
		}else {
			System.out.println("-----------------------------");
			System.out.print("The element of the stack is : ");
			for (int i=0; i<=this.top; i++) {
				System.out.print(" "+this.s[i]+" ");
			}
			System.out.println();
		}
	}
	
	public void checkEqualityOfStacks(Stack s1, Stack s2) {
		if(s1.top == s2.top) {
			System.out.println("The two Stack has equal number of elements");
		}
	}
	
}

public class Ass3q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1 = new Stack();
//		s1.push(90);
//		s1.push(77);
//		s1.push(90);
//		s1.push(77);
//		s1.display();
//		
		Stack s2 = new Stack();
//		s2.push(0);
//		s2.push(7);
//		s2.push(9);
//		s2.push(72);
//		s2.pop();
//		s2.display();
//		
//		s1.checkEqualityOfStacks(s1, s2);
		Scanner sc = new Scanner(System.in);
		int ch,ele1,ele2;
		
		System.out.println("Welcome!! This system is made by Ayan Saha");
		while (true){
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1. Push in Stack 1");
			System.out.println("2. Pop in Stack 1");
			System.out.println("3. Display Stack 1");
			System.out.println("~~~~~~~~~~~~~~~~~~~~");
			System.out.println("4. Push in Stack 2");
			System.out.println("5. Pop in Stack 2");
			System.out.println("6. Display Stack 2");
			System.out.println("~~~~~~~~~~~~~~~~~~~~");
			System.out.println("7. for Exit");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Please Enter Your Choice: ");
			ch = sc.nextInt();
			System.out.println("------------------------------");
			
			switch (ch){
			case 1: System.out.println("Enter the element :");
					ele1 = sc.nextInt();
					s1.push(ele1);
					break;
					
			case 2: s1.pop();
					break;
					
					
			case 3: s1.display();
					s1.checkEqualityOfStacks(s1,s2);
					break;
					
			case 4: System.out.println("Enter the element :");
					ele2 = sc.nextInt();
					s2.push(ele2);
					break;
					
			case 5: s2.pop();
					break;
					
			case 6: s2.display(); 
					s2.checkEqualityOfStacks(s1,s2);
					break;
					
			case 7: sc.close();
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
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
Enter the element :
23
------------------
23 is inserted
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
Enter the element :
56
------------------
56 is inserted
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
Enter the element :
89
------------------
89 is inserted
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
3
------------------------------
-----------------------------
The element of the stack is :  23  56  89 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
Enter the element :
66
------------------
66 is inserted
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
Enter the element :
89
------------------
89 is inserted
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
3
------------------------------
-----------------------------
The element of the stack is :  23  56  89  66  89 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
Enter the element :
45
-----------------------------
Stack OverFlow (Stack is Full)
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
4
------------------------------
Enter the element :
66
------------------
66 is inserted
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
4
------------------------------
Enter the element :
90
------------------
90 is inserted
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
4
------------------------------
Enter the element :
66
------------------
66 is inserted
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
4
------------------------------
Enter the element :
11
------------------
11 is inserted
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
4
------------------------------
Enter the element :
23
------------------
23 is inserted
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
6
------------------------------
-----------------------------
The element of the stack is :  66  90  66  11  23 
The two Stack has equal number of elements
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
3
------------------------------
-----------------------------
The element of the stack is :  23  56  89  66  89 
The two Stack has equal number of elements
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
5
------------------------------
------------------
23 is Removed
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
2
------------------------------
------------------
89 is Removed
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
3
------------------------------
-----------------------------
The element of the stack is :  23  56  89  66 
The two Stack has equal number of elements
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
6
------------------------------
-----------------------------
The element of the stack is :  66  90  66  11 
The two Stack has equal number of elements
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Push in Stack 1
2. Pop in Stack 1
3. Display Stack 1
~~~~~~~~~~~~~~~~~~~~
4. Push in Stack 2
5. Pop in Stack 2
6. Display Stack 2
~~~~~~~~~~~~~~~~~~~~
7. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
7
------------------------------
Thanks For using this system...
Exiting... :-)

*/
