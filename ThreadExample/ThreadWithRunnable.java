package ThreadExample;

public class ThreadWithRunnable implements Runnable{
	
	@Override
	public void run() {
		
		try {
			for(int i =1;i<=10;i++) {
				System.out.println("Thread "+ Thread.currentThread().getId()+ " is running :"+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Exception is Interrupted");
		}
		
	}

	public static void main(String[] args) {
		
		ThreadWithRunnable ob1 = new ThreadWithRunnable();
		
		Thread t1 = new Thread(ob1);
		t1.start();
		
		//ThreadWithRunnable ob2 = new ThreadWithRunnable();
		
		Thread t2 = new Thread(ob1);
		t2.start();
		

	}

}
