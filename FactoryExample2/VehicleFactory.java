package FactoryExample2;

public class VehicleFactory {
	
	
	public static Vehicle getEngineDetails(String type) {
		
		if(type.equalsIgnoreCase("Car")) {
			return new Car();
		}
		else if(type.equalsIgnoreCase("Bike")) {
			return new Bike();
		}
		else if(type.equalsIgnoreCase("Truck")) {
			return new Truck();
		}
		else {
			return null;
		}
	}

}
