
class ThreadsA extends Thread{
	public void run() {
		for(int i = 0; i<10; i++)
			System.out.println("Thread A : " + i);	
	}
}

class ThreadsB extends Thread{
	public void run() {
		for(int i = 0; i<10; i++)
			System.out.println("Thread B : " + i);	
	}
}

public class ThreadClassExample {

	public static void main(String[] args) {

		ThreadsA t1 = new ThreadsA();
		ThreadsB t2 = new ThreadsB();
		t1.start();
		t2.start();
	}

}
