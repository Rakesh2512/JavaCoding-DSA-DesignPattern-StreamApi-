package Builder;

public class Pizza {
	
	private int size;
	private String onion;
	private String cheese;
	private String corn;
	
	
	Pizza(Builder bd){
		
		this.size = bd.size;
		this.onion = bd.onion;
		this.cheese = bd.cheese;
		this.corn = bd.corn;
	}
	
	
	public static class Builder{
		
		private int size;
		private String onion;
		private String cheese;
		private String corn;
		
		
		Builder(int size){
			this.size = size;
		}
		
		public Builder setOnion(String onion) {
			this.onion = onion;
			return this;
		}
		
		public Builder setCheese(String cheese) {
			this.cheese = cheese;
			return this;
		}
		
		public Builder setCorn(String corn) {
			this.corn = corn;
			return this;
		}
		
		public Pizza Builde() {
			return new Pizza(this);
		}
	}
	
	

	@Override
	public String toString() {
		return "Pizza [size=" + size + ", onion=" + onion + ", cheese=" + cheese + ", corn=" + corn + "]";
	}



	public static void main(String[] args) {
		
		Pizza one = new Pizza.Builder(3).setCheese("yes").setCorn("yes").Builde();
		
		System.out.println(one.toString());
		

	}

}
