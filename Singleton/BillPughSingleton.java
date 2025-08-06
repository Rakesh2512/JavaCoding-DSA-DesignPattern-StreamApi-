package Singleton;

public class BillPughSingleton {
	
	private BillPughSingleton(){
		
	}
	
	public class holder{
		private static BillPughSingleton instance = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		
		return BillPughSingleton.holder.instance;
	}
	public void show() {
		System.out.println("insance is created :"+this);
	}

	public static void main(String[] args) {
		
		BillPughSingleton ob1 = BillPughSingleton.getInstance();
		
		ob1.show();
		
		BillPughSingleton ob2 = BillPughSingleton.getInstance();
		
		ob2.show();
		
		System.out.println(ob1 == ob2);
		

	}

}
