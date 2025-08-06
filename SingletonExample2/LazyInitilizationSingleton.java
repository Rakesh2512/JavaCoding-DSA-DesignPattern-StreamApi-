package SingletonExample2;

public class LazyInitilizationSingleton {
	
	private static LazyInitilizationSingleton instance = null;
	
	private LazyInitilizationSingleton() {};
	
	public static LazyInitilizationSingleton getInstance() {
		
		if(instance == null) {
			instance = new LazyInitilizationSingleton();
		}
		return instance;
	}
	
	public void get() {
		System.out.println(this+" is a instance of LazyInitilizationSingleton ");
	}
	
	
	public static void main(String[] args) {
		
		LazyInitilizationSingleton obj1 = LazyInitilizationSingleton.getInstance();
		LazyInitilizationSingleton obj2 = LazyInitilizationSingleton.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
	}

}
