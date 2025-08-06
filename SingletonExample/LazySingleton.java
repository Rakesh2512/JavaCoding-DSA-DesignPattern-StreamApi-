package SingletonExample;

public class LazySingleton {
	
	
	private static LazySingleton instance = null;
	
	public LazySingleton() {
		
	}
	
	public static LazySingleton getInstance() {
		
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	
	public void show() {
		System.out.println("This is example of Lazy Initiliazation :"+this);
	}

	public static void main(String[] args) {
		
		LazySingleton obj = LazySingleton.getInstance();
		
		obj.show();
		
		LazySingleton obj1 = LazySingleton.getInstance();
		
		obj1.show();

	}

}
