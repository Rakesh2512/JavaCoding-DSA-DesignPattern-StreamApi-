package Singleton;

public class DoubleCheckSingleton {
	
		
		//first instance is null
		private static volatile DoubleCheckSingleton instance = null;
				
		// private constructor to prevent Instantiate from outer class
		private DoubleCheckSingleton() {};
		
		//method to create instance if null
		public static DoubleCheckSingleton getInstance() {
			if(instance == null) {
				synchronized(DoubleCheckSingleton.class) {
					if(instance == null) {
						instance = new DoubleCheckSingleton();
					}
				}
			}
			
			return instance;
			
		}
		
		public void show() {
			System.out.println("Lazy Initilizatoin is created :"+this);
		}
		


	public static void main(String[] args) {
		
		DoubleCheckSingleton ob1 = DoubleCheckSingleton.getInstance();
		ob1.show();
		
		DoubleCheckSingleton ob2 = DoubleCheckSingleton.getInstance();
		ob2.show();
		
		System.out.println(ob1 == ob2);

	}

}
