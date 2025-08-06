package BuilderDesingExample;

public class Audi {
	
	private String model;
	private String FuelType;
	
	private double price;
	
	private String color;
	
	
	Audi(Builder builder){
		this.model = builder.model;
		this.FuelType = builder.FuelType;
		this.price = builder.price;
		this.color = builder.color;
	}
	
	
	
	public static class Builder{
		
		private String model;
		private String FuelType;
		
		private double price;
		
		private String color;
		
		Builder(String model){
			this.model = model;
		}
		
		public Builder setFuelType(String FuelType) {
			this.FuelType = FuelType;
			return this;
		}
		
		public Builder setPrice(double price) {
			this.price = price;
			return this;
		}
		
		public Builder setColor(String color) {
			this.color = color;
			return this;
		}
		
		public Audi Build() {
			return new Audi(this);
		}
		
	}
	
	
	

	@Override
	public String toString() {
		return "Audi [model=" + model + ", FuelType=" + FuelType + ", price=" + price + ", color=" + color + "]";
	}




	public static void main(String[] args) {
		
		Audi audi = new Audi.Builder("audiclass").setFuelType("Diesel").setColor("Blue").Build();
		
		System.out.println(audi);
		

	}

}
