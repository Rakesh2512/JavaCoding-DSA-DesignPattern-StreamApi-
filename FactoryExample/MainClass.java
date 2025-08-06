package FactoryExample;

public class MainClass {

	public static void main(String[] args) {
		
		Vehicle car = VehicleFactory.getType("Car");
		
		car.VehicleType();
		
		Vehicle train = VehicleFactory.getType("Train");
		
		train.VehicleType();

	}

}
