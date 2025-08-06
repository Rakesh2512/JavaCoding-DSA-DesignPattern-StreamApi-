package SingletonExample;

public class Singleton {
	
	
	//Instance is created when the class is load
	private static final Singleton instance = new Singleton();
	
	//constructor is private instance can not be instantiate from outside
	private Singleton() {
		
	}
	
	//public static method to provide the instance
	public static Singleton getInstance() {
		return instance;
	}
	
	public void show() {
		System.out.println("This is Eager Initilization Singleton example :"+this);
	}

	public static void main(String[] args) {
		
		Singleton obj = Singleton.getInstance();
		obj.show();
		
		Singleton obj1 = Singleton.getInstance();
		
		System.out.println(obj+" "+obj1);

	}

}
