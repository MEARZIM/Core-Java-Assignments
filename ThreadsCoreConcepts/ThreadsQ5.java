/**
 * 
 */
package ThreadsCoreConcepts;

/**
 *  Create two Thread subclasses, one with a run( ) that starts up, captures the reference of
	the second Thread object and then calls wait( ). The other class’ run( ) should call
	notifyAll( ) for the first thread after some number of seconds have passed, so the first
	thread can print a message.
 */

class FirstThread extends Thread {
    private SecondThread secondThread;

    public FirstThread(SecondThread secondThread) {
        this.secondThread = secondThread;
        System.out.println("FirstThread started.");
    }

    @Override
    public void run() {
        synchronized (secondThread) {
            try {
                System.out.println("FirstThread is waiting for notification.");
                secondThread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("FirstThread received notification and completed.");
        }
    }
}

class SecondThread extends Thread {
    private FirstThread firstThread;

    public SecondThread(FirstThread firstThread) {
        this.firstThread = firstThread;
        System.out.println("SecondThread started.");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);

            synchronized (firstThread) {
                System.out.println("SecondThread notifying FirstThread after some seconds.");
                firstThread.notifyAll(); 
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadsQ5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread firstThread = new FirstThread(new SecondThread(null));
        SecondThread secondThread = new SecondThread(firstThread);

        // Set the references in the threads
        firstThread = new FirstThread(secondThread);

        // Start the threads
        firstThread.start();
        secondThread.start();
	}

}
/*
 * OutPut->  
SecondThread started.
FirstThread started.
SecondThread started.
FirstThread started.
FirstThread is waiting for notification.
SecondThread notifying FirstThread after some seconds.
FirstThread received notification and completed.

 */