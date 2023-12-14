package ThreadsCoreConcepts;

/**
 *  Write a Java program that illustrates the use of the 
	    yield( ), 
	    start( ),
	    stop( ),
	    run ( ), 
	    sleep( ),
		wait( ) and 
		isAlive( )
    methods.
 */

class MyThread extends Thread{

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.print("For Using start() method-> ");
		System.out.println("The MyThread is Running....");
		
		//Yield
		for (int i = 0; i < 5; i++) {
			System.out.println("In Yield");
			Thread.yield();
		}
		
		
	}
	
}

class MyThreadSleep extends Thread{

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		// Sleep
		System.out.print("For Using sleep() method-> ");
		System.out.print("OutPut->");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.print((i + 1) + ", ");
		}
	}
	
}


class TrafficSignal{
	private int timer=30;
	
	synchronized public void redLigntOn() {

		System.out.println("Red Signal Turn On:");
		System.out.println("Invoking the wait() method");
		System.out.print("Timer: ");
		for (int i = this.timer; i>=0; i--) {
			if (this.timer == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
			System.out.print(timer+", ");
			this.timer--;
		}
		System.out.println();
		System.out.println("The 1 Cycle is completed"); 
	}
	
	synchronized public void greenSignal() {
		System.out.println();
		System.out.println("Green Signal On");
		System.out.print("Timer: ");
		for (int i=this.timer; i<30; i++) {
			this.timer++;
//			System.out.print((this.timer)+", ");
			System.out.print((i)+", ");
		}
		notify();
	}

}


public class ThreadsQ1 extends Thread{

	/**
	 * @param args
	 */
	synchronized public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyThreadSleep nn= new MyThreadSleep();
//		nn.start();
//		
		MyThread th1 = new MyThread();
		
		System.out.println("Status of MyThread Before start : "+th1.isAlive());
		th1.start();
		 
		for (int i = 0; i < 5; i++) {
			System.out.println("In Main");
			Thread.yield();
		}
		System.out.println("Status of MyThread After start : "+th1.isAlive());
		
		
		
//		 IMPLEMENTSTION OF wait and notify
		System.out.println("----------------------------");
		TrafficSignal ts = new TrafficSignal();
		
		new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				ts.redLigntOn();
			}
			
		}.start();
		
		new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				ts.greenSignal();
			}
			
		}.start();
		
		
		
	}
	

}
/*
 *	OutPut:
Status of MyThread Before start : false
In Main
In Main
In Main
In Main
In Main
For Using start() method-> The MyThread is Running....
In Yield
In Yield
In Yield
In Yield
In Yield
Status of MyThread After start : true
----------------------------
Red Signal Turn On:
Invoking the wait() method
Timer: 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 
Green Signal On
Timer: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 
The 1 Cycle is completed

 * */
