/**
 * 
 */
package ThreadsCoreConcepts;

/**
 *  Write multithreaded program that continuously prints the strings “ping” and “PONG” in
	the console at random distances at intervals of one second. Use two threads one for
	“ping” and another for “PONG”.
 */

class PINGpong implements Runnable{
	private String msg;
	public PINGpong(String msg) {
		super();
		this.msg = msg;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				System.out.println(this.msg);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}
	
}
public class ThreadsQ2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread pingThread = new Thread(new PINGpong("ping"));
        Thread pongThread = new Thread(new PINGpong("PONG"));

        pingThread.start();
        pongThread.start();
	}

}
/*
 * OutPut - >
ping
PONG
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
ping
PONG
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping
PONG
ping

*/
