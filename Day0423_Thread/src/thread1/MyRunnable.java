package thread1;

public class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("파생스레드: "+i);
		}
	}
		
}
