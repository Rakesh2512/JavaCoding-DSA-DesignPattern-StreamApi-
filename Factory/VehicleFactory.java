package Factory;



public class VehicleFactory {
	
	public static Vehicle getVehicle(String type) {
		if(type.equalsIgnoreCase("car")) {
			return new car();
		}
		else if(type.equalsIgnoreCase("truck")) {
			return new truck();
		}
		else if(type.equals("Bike")) {
			return new Bike();
		}
		return null;
	}

}
