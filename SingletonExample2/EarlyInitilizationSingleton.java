package SingletonExample2;



public class EarlyInitilizationSingleton {
	
	private static final EarlyInitilizationSingleton instance = new EarlyInitilizationSingleton();
	
	public static EarlyInitilizationSingleton getInstance() {
		return instance;
	}
	
	private EarlyInitilizationSingleton() {};
	
	public void get() {
		System.out.println(this +" is a instance of EarlyInitilizationSingleton ");
	}
	

	public static void main(String[] args) {
		
		EarlyInitilizationSingleton obj1 = EarlyInitilizationSingleton.getInstance();
		
		EarlyInitilizationSingleton obj2 = EarlyInitilizationSingleton.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		
		

	}

}
