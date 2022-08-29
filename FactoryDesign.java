
 interface Vehicle{
	abstract void makeVehicle();
}
 class MakeScooter implements Vehicle{
	 @Override
	 public void makeVehicle() {
		 System.out.println("Manufacture Scooter");
	 }
 }
 class MakeCar implements Vehicle{
	 @Override
	 public void makeVehicle() {
		 System.out.println("Manufacture cars");
	 }
 }
 class MakeBike implements Vehicle{
	 @Override
	 public void makeVehicle() {
		 System.out.println("Manufacture Bike");
	 }
 }
 class ManufactureVehicle{
	 public Vehicle designVehicle(String vehicleName) {
		 if(vehicleName==null) {
			 return null;
		 }
		 if(vehicleName.equalsIgnoreCase("scooter")) {
			 return new MakeScooter();
		 }else if(vehicleName.equalsIgnoreCase("car")) {
			 return new MakeCar();
		 }else if(vehicleName.equalsIgnoreCase("bike")) {
			 return new MakeBike();
		 }
		return null;
	 }
 }
public class FactoryDesign {
	public static void main(String[] args) {
	ManufactureVehicle type=new ManufactureVehicle();
	Vehicle vehicle=type.designVehicle("car");
	vehicle.makeVehicle();
	Vehicle vehicle2=type.designVehicle("Bike");
	vehicle2.makeVehicle();
	Vehicle vehicle3=type.designVehicle("Scooter");
	vehicle3.makeVehicle();
	}

}