
class threadA implements Runnable{
	public void run() {
		int i; 
		for(i = 0; i<10; i++)
			System.out.println("Thread A: " + i);
	}
}

class threadB implements Runnable{    // Runnable interface has only one method i.e., run() 
	public void run() {
		int i;
		for(i = 0; i<10; i++)	
			System.out.println("Thread B: " + i);
	}
}

public class ThreadRunnableExample { 
	
	public static void main(String[] args) {

		Thread t1 = new Thread(new threadA());   // this thread object will be received by the reference varaible of Runnable.
		Thread t2 = new Thread(new threadB());   // which is defined in the constructor of Thread.
		t1.start();
		t2.start();	// This is to start the thread
	}

}
