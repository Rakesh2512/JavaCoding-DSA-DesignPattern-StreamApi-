package SingletonExample2;

public class DoubleCheckLocking {
	
	private static volatile DoubleCheckLocking instance = null;
	
	private DoubleCheckLocking() {
		
	}
	
	public static DoubleCheckLocking getInstance() {
		
		if(instance == null) {
			
			synchronized (DoubleCheckLocking.class) {
				
				if(instance == null) {
					instance = new DoubleCheckLocking();
				}
			}
		}
		
		return instance;
	}

	public static void main(String[] args) {
		
		DoubleCheckLocking obj1 = DoubleCheckLocking.getInstance();
		DoubleCheckLocking obj2 = DoubleCheckLocking.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());


	}

}
