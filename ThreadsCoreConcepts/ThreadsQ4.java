/**
 * 
 */
package ThreadsCoreConcepts;

/**
 *  Inherit a class from Thread and override the run( ) method. Inside run( ), print a message,
	and then call sleep( ). Repeat this three times, then return from run( ). Put a start-up
	message in the constructor and override finalize( ) to print a shut-down message. Make a
	separate thread class that calls System.gc( ) and System.runFinalization( ) inside run( ),
	printing a message as it does so. Make several thread objects of both types and run them
	to see what happens.
 */

class DemoThread extends Thread{
	
	public DemoThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0; i<3; i++) {
			System.out.println("Thread "+ getName()+ " is Running...");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println(e);
			}	
		}
	}
	public void finalize() {
		System.out.println("Thread "+ getName()+" is Finalized.(shut-down) ");
	}
	
}

class ThreadGC extends Thread{
	
	public ThreadGC(String name) {
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("ThreadGC " + getName() + " is running...");

        System.gc();
        System.runFinalization();

        System.out.println("ThreadGC " + getName() + " finished its execution.");
		
	}
	
}

public class ThreadsQ4 {

	/**
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread thread1 = new DemoThread("Normal Thread-1");
		DemoThread thread2 = new DemoThread("Normal Thread-2");
		
		ThreadGC threadGC1 = new ThreadGC("GC Thread-1");
		ThreadGC threadGC2 = new ThreadGC("GC Thread-2");
		
		thread1.start();
		thread2.start();
		threadGC1.start();
		threadGC2.start();
	}

}
/*
 * OutPut->
ThreadGC GC Thread-1 is running...
Thread Normal Thread-1 is Running...
ThreadGC GC Thread-2 is running...
Thread Normal Thread-2 is Running...
ThreadGC GC Thread-1 finished its execution.
ThreadGC GC Thread-2 finished its execution.
Thread Normal Thread-1 is Running...
Thread Normal Thread-2 is Running...
Thread Normal Thread-1 is Running...
Thread Normal Thread-2 is Running...
 */