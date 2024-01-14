/**
 * 
 */
package GenericAssignment;

/**
 *  Design the Queue Using Generic Class that can contain any type of data. Implement the
	insertion, deletion methods.
 */

class Queue<T>{
	private T queue[];
	private int rear, front, capacity;
	
	@SuppressWarnings("unchecked")
	Queue(){
		capacity=5;
		this.front=-1;
		this.rear=-1;
		queue = (T[]) new Object[capacity];
	}
	
	// Queue OverFlow
	private boolean isFull (){
		return (this.capacity-1) == this.rear;
	}
	
	// Queue UnderFlow
	private boolean isEmpty (){
		return this.front == -1;
	}
	
	protected boolean enQueue(T element) {
		if (isFull()) {
			System.out.println("OverFlow(Queue is Full)");
			return false;
		}
		if (isEmpty()) {
			this.front++;
			this.rear++;
			this.queue[this.rear] = element;
			return true;
		}
		this.queue[++this.rear] = element;
		return true;
	}
	
	protected boolean deQueue() {
		if(isEmpty()) {
			System.out.println("UnderFlow(Queue is Empty)");
		}
		if(this.front == this.rear) {
			this.front = -1;
			this.rear = -1;
			return true;
		}
		T ele  = this.queue[this.front];
		this.front++;
		System.out.println( ele+ " is removed");
		return true;
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("-----------------------------");
			System.out.println("Queue is Empty(UnderFlow)");
		}else{
			System.out.println("-----------------------------");
			System.out.print("The element in Queue is : ");
			for (int i=front; i<=rear; i++){
				System.out.print(" "+this.queue[i]+" ");
			}
			System.out.println();
		}
	}
}

public class Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new Queue<Integer>();
		q.enQueue(2);
		q.enQueue(2);
		q.enQueue(2);
		q.enQueue(2);
		q.enQueue(2);
		q.deQueue();
		q.enQueue(3);
		
		
		q.display();
	}

}
