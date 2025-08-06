package Thread;

public class RunnableExample implements Runnable {
	
	@Override
	public void run() {
		System.out.println("This is example of Runnable :"+Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		
		RunnableExample obj1 = new RunnableExample();
		
		Thread t1 = new Thread(obj1);
		t1.start();
		
		
		Thread t2 = new Thread(obj1);
		t2.start();
	}

	

}
