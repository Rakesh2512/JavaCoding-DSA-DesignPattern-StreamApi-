package Thread;

public class Counter {
	
	private int count = 0;
	
	public void InsafeIncrement() {
		count++;
	}
	
	public synchronized void SafeIncrementMethod() {
		count++;
	}
	
	public void SafeIncrementBlock() {
		
		synchronized(this) {
			count++;
		}
	}
	
	public int getCount() {
		return count;
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		Counter c = new Counter();
		
		Runnable task  = ()  -> {
			for(int i=1;i<=1000;i++) {
				c.InsafeIncrement();
				
			}
		};
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.getCount());

	}

}
