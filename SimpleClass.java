
public class SimpleClass {
	
	String brand;
	int speed;
	
	SimpleClass(String brand,int speed){
		this.brand = brand;
		this.speed = speed;
	}
	
	public void show() {
		System.out.println("Brand :"+brand+" "+"speed :"+speed );
	}

	public static void main(String[] args) {
		
		SimpleClass obj = new SimpleClass("BMW", 200);
		
		obj.show();
		SimpleClass obj1 = new SimpleClass("Audi", 300);
		
		obj1.show();
		

	}

}
