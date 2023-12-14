/**
 * 
 */
package ThreadsCoreConcepts;

/**
 * Write a program, which will create a deadlock.
 */

class Resource1 {
	private String msg;

	public Resource1() {
		super();
		this.msg = "Resource1";
	}

	@Override
	public String toString() {
		return this.msg;
	}

}

class Resource2 {
	private String msg;

	public Resource2() {
		super();
		this.msg = "Resource2";
	}

	@Override
	public String toString() {
		return this.msg;
	}
}

class DeadLockThread1 extends Thread {
	private Resource1 res1;
	private Resource2 res2;

	public DeadLockThread1(Resource1 res1, Resource2 res2) {
		super();
		this.res1 = res1;
		this.res2 = res2;
	}

	public void print() {
		synchronized (res1) {
			System.out.println("DeadLock Thread 1: Holding " + res1 + "...");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("DeadLock Thread 1: Waiting for " + res2);

			synchronized (res2) {
				System.out.println("DeadLock Thread 1: Holding " + res1 + " & " + res2);
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		print();
	}

}

class DeadLockThread2 extends Thread {
	private Resource1 res1;
	private Resource2 res2;

	public DeadLockThread2(Resource1 res1, Resource2 res2) {
		super();
		this.res1 = res1;
		this.res2 = res2;
	}

	public void print() {
		synchronized (res2) {
			System.out.println("DeadLock Thread 2: Holding " + res2 + "...");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("DeadLock Thread 2: Waiting for " + res1);
			synchronized (res1) {
				System.out.println("DeadLock Thread 2: Holding " + res1 + " & " + res2);
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		print();
	}
}

public class ThreadsQ8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource1 r1 = new Resource1();
		Resource2 r2 = new Resource2();

		DeadLockThread1 dt1 = new DeadLockThread1(r1, r2);
		DeadLockThread2 dt2 = new DeadLockThread2(r1, r2);

		dt1.start();
		dt2.start();
	}

}
/*
 * Output->
DeadLock Thread 2: Holding Resource2...
DeadLock Thread 1: Holding Resource1...
DeadLock Thread 1: Waiting for Resource2
DeadLock Thread 2: Waiting for Resource1

 */