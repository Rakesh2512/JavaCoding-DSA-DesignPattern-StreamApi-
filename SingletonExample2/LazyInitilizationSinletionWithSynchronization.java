package SingletonExample2;

public class LazyInitilizationSinletionWithSynchronization {
	
	private static LazyInitilizationSinletionWithSynchronization instance = null;
	
	private LazyInitilizationSinletionWithSynchronization() {};
	
	public static  synchronized LazyInitilizationSinletionWithSynchronization getInstance() {
		
		if(instance == null) {
			instance = new LazyInitilizationSinletionWithSynchronization();
		}
		return instance;
	}

	public static void main(String[] args) {
		LazyInitilizationSinletionWithSynchronization obj1 = LazyInitilizationSinletionWithSynchronization.getInstance();
		LazyInitilizationSinletionWithSynchronization obj2 = LazyInitilizationSinletionWithSynchronization.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

	}

}
