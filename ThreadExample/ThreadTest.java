package ThreadExample;

public class ThreadTest extends Thread {
	
	@Override
	public void run() {
		//System.out.println("In Class ThreadTest "+ Thread.currentThread().getName()+" is running");
		
		try {
			for(int i =1;i<=10;i++) {
				System.out.println("Thread "+Thread.currentThread().getId()+" is running :"+ i);
				Thread.sleep(500);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		
		ThreadTest t1 = new ThreadTest();
		
		t1.start();
		
		ThreadTest t2 = new ThreadTest();
		
		t2.start();
		

	}

}
