package BuilderDesingExample;

public class Pizza {
	
	//required parameter
	private String size;
	
	//Optional Parameter
	
	private boolean cheese;
	private boolean mushrrom;
	private boolean onion;
	
	private Pizza(Builder builder) {
		
		this.size = builder.size;
		this.cheese = builder.cheese;
		this.mushrrom = builder.mushrrom;
		this.onion = builder.onion;
		
	}
	
	
	public static class Builder{
		
		//required parameter
		private String size;
		
		//Optional Parameter
		
		private boolean cheese;
		private boolean mushrrom;
		private boolean onion;
		
		Builder(String size){
			this.size = size;
		}
		
		public Builder setCheese(boolean cheese) {
			this.cheese = cheese;
			return this;
		}
		
		public Builder setMushroom(boolean mushroom) {
			this.mushrrom = mushroom;
			return this;
		}
		
		public Builder setOnion(boolean onion) {
			this.onion = onion;
			return this;
		}
		
		
		public Pizza Builde() {
			return new Pizza(this);
		}
		
	}
	

	@Override
	public String toString() {
		return "Pizza [size=" + size + ", cheese=" + cheese + ", mushrrom=" + mushrrom + ", onion=" + onion + "]";
	}




	public static void main(String[] args) {
		
		Pizza p = new Pizza.Builder("Large").setCheese(true).setMushroom(false).setOnion(true).Builde();
		
		System.out.println(p);
		

	}

}
