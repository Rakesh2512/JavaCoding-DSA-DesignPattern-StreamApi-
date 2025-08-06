package Singleton;

public class LazyInitilization {
	
	//first instance is null
	private static LazyInitilization instance = null;
			
	// private constructor to prevent Instantiate from outer class
	private LazyInitilization() {};
	
	//method to create instance if null
	public static LazyInitilization getInstance() {
		if(instance == null) {
			instance = new LazyInitilization();
		}
		return instance;
	}
	
	public void show() {
		System.out.println("Lazy Initilizatoin is created :"+this);
	}

	public static void main(String[] args) {
		
		LazyInitilization ob1 = LazyInitilization.getInstance();
		ob1.show();
		
		LazyInitilization ob2 = LazyInitilization.getInstance();
		ob2.show();
		
		System.out.println(ob1 == ob2);
	}

}
