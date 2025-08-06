package FactoryExample;

public class VehicleFactory {
	
	
	
	public static Vehicle getType(String type) {
		
		if(type.equalsIgnoreCase("Car")) {
			return new Car();
		}
		else if(type.equalsIgnoreCase("Bike")) {
			return new Bike();
		}
		else if(type.equalsIgnoreCase("Train")) {
			return new Train();
		}
		else {
			return null;
		}
		
	}

}
