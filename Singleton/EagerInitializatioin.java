package Singleton;

public class EagerInitializatioin {
	
	//instance is created duing during class load
	
	private static final EagerInitializatioin instance = new EagerInitializatioin();
	
	// Private constructor prevents instantiation from other classes
    private EagerInitializatioin() {
    }
	
	//this method is call to get instance
	public static EagerInitializatioin getInstacne() {
		return instance;
	}
	
	public void show() {
		System.out.println("EagerInitilization Singleton is created :"+this);
	}
	

	public static void main(String[] args) {
		
		EagerInitializatioin obj = EagerInitializatioin.getInstacne();
		
		obj.show();
		
		EagerInitializatioin obj1 = EagerInitializatioin.getInstacne();
		
		obj1.show();
		
		System.out.println(obj == obj1);
		

	}

}
