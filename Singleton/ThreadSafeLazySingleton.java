package Singleton;

public class ThreadSafeLazySingleton {

		
		//first instance is null
		private static ThreadSafeLazySingleton instance = null;
				
		// private constructor to prevent Instantiate from outer class
		private ThreadSafeLazySingleton() {};
		
		//method to create instance if null
		public static synchronized ThreadSafeLazySingleton getInstance() {
			if(instance == null) {
				instance = new ThreadSafeLazySingleton();
			}
			return instance;
		}
		
		public void show() {
			System.out.println("Lazy Initilizatoin is created :"+this);
		}
		
		public static void main(String[] args) {
			
			ThreadSafeLazySingleton ob1 = ThreadSafeLazySingleton.getInstance();
			ob1.show();
			
			ThreadSafeLazySingleton ob2 = ThreadSafeLazySingleton.getInstance();
			
			ob1.show();
			
			System.out.println(ob1 == ob2);
		}
}
