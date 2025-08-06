package FactoryExample2;

public class MainClass {

	public static void main(String[] args) {
		
		Vehicle car = VehicleFactory.getEngineDetails("Car");
		
		car.Engine();
		
		Vehicle bike = VehicleFactory.getEngineDetails("Bike");
		
		bike.Engine();
		
		
		
	}

}
