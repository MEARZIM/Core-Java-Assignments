/**
 * 
 */
package ThreadsCoreConcepts;

/**
 *  Define the classes for implementing “t1” and “t2”. Write appropriate methods for
	accomplishing the above.
 */
class SharedResourceForRunnable{
	private int x=0;
	public boolean printable=true;
	
	public synchronized void increaseX() {
		if(!printable) {
			try {
				wait(); // Wait until the value is printed by t2
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		this.x++;
		System.out.println("(By T1)X is Increase.");
		printable=false;
		notify();
	}
	
	public synchronized void printX() {
		if(printable) {
			try {
				wait(); // Wait until the value is increased by t1
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("(By T2)X Value is :"+this.x);
		printable=true;
		notify();
	}
}

class T1Runnable implements Runnable{
	private SharedResourceForRunnable sr;

	public T1Runnable(SharedResourceForRunnable sr) {
		super();
		this.sr = sr;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=100;i++) {
			sr.increaseX();			
		}
	}
	
}

class T2Runnable implements Runnable{
	private SharedResourceForRunnable sr;

	public T2Runnable(SharedResourceForRunnable sr) {
		super();
		this.sr = sr;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=100;i++) {
			sr.printX();			
		}
	}
	
}

public class ThreadsQ7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedResourceForRunnable sr = new SharedResourceForRunnable();
		
		Thread t1 = new Thread(new T1Runnable(sr));
		Thread t2 = new Thread(new T2Runnable(sr));
		
		t1.start();
		t2.start();
	}

}
/*
 * OutPut->
(By T1)X is Increase.
(By T2)X Value is :1
(By T1)X is Increase.
(By T2)X Value is :2
(By T1)X is Increase.
(By T2)X Value is :3
(By T1)X is Increase.
(By T2)X Value is :4
(By T1)X is Increase.
(By T2)X Value is :5
(By T1)X is Increase.
(By T2)X Value is :6
(By T1)X is Increase.
(By T2)X Value is :7
(By T1)X is Increase.
(By T2)X Value is :8
(By T1)X is Increase.
(By T2)X Value is :9
(By T1)X is Increase.
(By T2)X Value is :10
(By T1)X is Increase.
(By T2)X Value is :11
(By T1)X is Increase.
(By T2)X Value is :12
(By T1)X is Increase.
(By T2)X Value is :13
(By T1)X is Increase.
(By T2)X Value is :14
(By T1)X is Increase.
(By T2)X Value is :15
(By T1)X is Increase.
(By T2)X Value is :16
(By T1)X is Increase.
(By T2)X Value is :17
(By T1)X is Increase.
(By T2)X Value is :18
(By T1)X is Increase.
(By T2)X Value is :19
(By T1)X is Increase.
(By T2)X Value is :20
(By T1)X is Increase.
(By T2)X Value is :21
(By T1)X is Increase.
(By T2)X Value is :22
(By T1)X is Increase.
(By T2)X Value is :23
(By T1)X is Increase.
(By T2)X Value is :24
(By T1)X is Increase.
(By T2)X Value is :25
(By T1)X is Increase.
(By T2)X Value is :26
(By T1)X is Increase.
(By T2)X Value is :27
(By T1)X is Increase.
(By T2)X Value is :28
(By T1)X is Increase.
(By T2)X Value is :29
(By T1)X is Increase.
(By T2)X Value is :30
(By T1)X is Increase.
(By T2)X Value is :31
(By T1)X is Increase.
(By T2)X Value is :32
(By T1)X is Increase.
(By T2)X Value is :33
(By T1)X is Increase.
(By T2)X Value is :34
(By T1)X is Increase.
(By T2)X Value is :35
(By T1)X is Increase.
(By T2)X Value is :36
(By T1)X is Increase.
(By T2)X Value is :37
(By T1)X is Increase.
(By T2)X Value is :38
(By T1)X is Increase.
(By T2)X Value is :39
(By T1)X is Increase.
(By T2)X Value is :40
(By T1)X is Increase.
(By T2)X Value is :41
(By T1)X is Increase.
(By T2)X Value is :42
(By T1)X is Increase.
(By T2)X Value is :43
(By T1)X is Increase.
(By T2)X Value is :44
(By T1)X is Increase.
(By T2)X Value is :45
(By T1)X is Increase.
(By T2)X Value is :46
(By T1)X is Increase.
(By T2)X Value is :47
(By T1)X is Increase.
(By T2)X Value is :48
(By T1)X is Increase.
(By T2)X Value is :49
(By T1)X is Increase.
(By T2)X Value is :50
(By T1)X is Increase.
(By T2)X Value is :51
(By T1)X is Increase.
(By T2)X Value is :52
(By T1)X is Increase.
(By T2)X Value is :53
(By T1)X is Increase.
(By T2)X Value is :54
(By T1)X is Increase.
(By T2)X Value is :55
(By T1)X is Increase.
(By T2)X Value is :56
(By T1)X is Increase.
(By T2)X Value is :57
(By T1)X is Increase.
(By T2)X Value is :58
(By T1)X is Increase.
(By T2)X Value is :59
(By T1)X is Increase.
(By T2)X Value is :60
(By T1)X is Increase.
(By T2)X Value is :61
(By T1)X is Increase.
(By T2)X Value is :62
(By T1)X is Increase.
(By T2)X Value is :63
(By T1)X is Increase.
(By T2)X Value is :64
(By T1)X is Increase.
(By T2)X Value is :65
(By T1)X is Increase.
(By T2)X Value is :66
(By T1)X is Increase.
(By T2)X Value is :67
(By T1)X is Increase.
(By T2)X Value is :68
(By T1)X is Increase.
(By T2)X Value is :69
(By T1)X is Increase.
(By T2)X Value is :70
(By T1)X is Increase.
(By T2)X Value is :71
(By T1)X is Increase.
(By T2)X Value is :72
(By T1)X is Increase.
(By T2)X Value is :73
(By T1)X is Increase.
(By T2)X Value is :74
(By T1)X is Increase.
(By T2)X Value is :75
(By T1)X is Increase.
(By T2)X Value is :76
(By T1)X is Increase.
(By T2)X Value is :77
(By T1)X is Increase.
(By T2)X Value is :78
(By T1)X is Increase.
(By T2)X Value is :79
(By T1)X is Increase.
(By T2)X Value is :80
(By T1)X is Increase.
(By T2)X Value is :81
(By T1)X is Increase.
(By T2)X Value is :82
(By T1)X is Increase.
(By T2)X Value is :83
(By T1)X is Increase.
(By T2)X Value is :84
(By T1)X is Increase.
(By T2)X Value is :85
(By T1)X is Increase.
(By T2)X Value is :86
(By T1)X is Increase.
(By T2)X Value is :87
(By T1)X is Increase.
(By T2)X Value is :88
(By T1)X is Increase.
(By T2)X Value is :89
(By T1)X is Increase.
(By T2)X Value is :90
(By T1)X is Increase.
(By T2)X Value is :91
(By T1)X is Increase.
(By T2)X Value is :92
(By T1)X is Increase.
(By T2)X Value is :93
(By T1)X is Increase.
(By T2)X Value is :94
(By T1)X is Increase.
(By T2)X Value is :95
(By T1)X is Increase.
(By T2)X Value is :96
(By T1)X is Increase.
(By T2)X Value is :97
(By T1)X is Increase.
(By T2)X Value is :98
(By T1)X is Increase.
(By T2)X Value is :99
(By T1)X is Increase.
(By T2)X Value is :100
(By T1)X is Increase.
(By T2)X Value is :101

 */