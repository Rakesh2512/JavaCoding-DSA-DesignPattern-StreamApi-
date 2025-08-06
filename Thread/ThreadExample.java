package Thread;



public class ThreadExample extends Thread {
	
	@Override
	public void run() {
		System.out.println("This is Thread example :"+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		
		ThreadExample obj1 = new ThreadExample();
		obj1.start();
		
		
		ThreadExample obj2 = new ThreadExample();
		obj2.start();
		

	}

}
