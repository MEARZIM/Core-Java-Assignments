/**
 * 
 */
package GenericAssignment;

/**
 *  Design the Stack Using Generic Class that can contain any type of data. Implement the insertion,
	deletion, peek function.
 */
class Stack<T>{
	private T stack[];
	private int Capacity;
	private int top;
	@SuppressWarnings("unchecked")
	Stack(){
		this.Capacity = 10;
		this.top = -1;
		stack = (T[]) new Object [this.Capacity];
	}
	
	private boolean isEmpty() {
		return this.top == -1;
	}
	
	private boolean isFull() {
		return top == Capacity-1;
	}
	
	protected boolean push(T element) {
		if (isFull()) {
			System.out.println("Stack OverFlow");
			return false;
		}
		this.stack[++top] = element;
		return true;

	}
	
	protected boolean pop() {
		if(isEmpty()) {
			System.out.println("Stack UnderFlow");
			return false;
		}
		T element = stack[this.top];
		this.top--;
		System.out.println(element +" is Removed");
		return true;
	}
	
	protected T peek() {
		return stack[this.top]; 
	}
	
	public void display() {
		if (isEmpty()) {
			System.out.println("--------------------------------");
			System.out.println("Stack UnderFlow (Stack is Empty)");
		}
		System.out.println("-----------------------------");
		System.out.print("The element of the stack is : ");
		for (int i = 0; i <= this.top; i++) {
			System.out.print(" " + this.stack[i] + " ");
		}
		System.out.println();

	}
	
	public void checkEqualityOfStacks(Stack<?> s1, Stack<?> s2) {
		if(s1.top == s2.top) {
			System.out.println("The two Stack has equal number of elements");
		}
	}
}

public class Q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		s.push(6);
		s.push(0);
		s.push(6);
		s.push(0);
		s.push(6);
		s.push(0);
		s.push(6);
		s.push(0);
		s.push(6);
		s.push(0);
		
		s.pop();
		s.push(9);
		
		s.display();
	}

}
