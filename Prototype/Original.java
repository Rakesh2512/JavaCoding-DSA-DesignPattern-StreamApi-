package Prototype;

public class Original implements Cloneable{
	
	String name;
	
	
	Original(String name){
		this.name = name;
	}
	
	@Override
	protected Original clone() throws CloneNotSupportedException {
		
		return  (Original)super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Original o = new Original("original");
		
		Original c = o.clone();
		
		
		
		System.out.println("Clone object name :"+c);
	}

	

}
