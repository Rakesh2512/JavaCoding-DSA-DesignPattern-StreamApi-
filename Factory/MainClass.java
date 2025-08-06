package Factory;

public class MainClass {

	public static void main(String[] args) {
		
		
		Vehicle v = VehicleFactory.getVehicle("Bike");
		
		v.VehicleType();
		

		Vehicle vv = VehicleFactory.getVehicle("car");
		
		vv.VehicleType();

	}

}
