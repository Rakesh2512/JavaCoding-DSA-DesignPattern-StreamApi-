package SingletonExample;

public class ThreadSafeLazySinleton {
	
	private static ThreadSafeLazySinleton instance = null;
	
	private ThreadSafeLazySinleton() {
		
	}
	
	public static synchronized ThreadSafeLazySinleton getInstance() {
		
		if(instance == null) {
			instance = new ThreadSafeLazySinleton();
		}
		return instance;
	}
	
	public void show() {
		System.out.println("This is syncronized Lazy Initilization :"+this);
	}

	public static void main(String[] args) {
		
		ThreadSafeLazySinleton obj = ThreadSafeLazySinleton.getInstance();
		obj.show();

	}

}
