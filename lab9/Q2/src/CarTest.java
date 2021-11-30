public class CarTest{
	
	public static void main(String args[]){
		
Car car1 = new Car();
		
		car1.setWheels(4);
		car1.setPass(6);
		car1.setType("saloon");
		car1.setPrice(2000);

		System.out.println("Car1: ");
		System.out.print("Wheels: " + car1.getWheels());
		System.out.print(" Passengers: " + car1.getPass());
		System.out.print(" Type: " + car1.getType());
		System.out.println(" Import Duty Cost: " + car1.calculateDuty());
		Hgv hgv1 = new Hgv();
		
		hgv1.setWheels(6);
		hgv1.setPass(2);
		hgv1.setCargo(10);
		hgv1.setPrice(4000);

		System.out.println("Hgv1: ");
		System.out.print("Wheels: " + hgv1.getWheels());
		System.out.print(" Passengers: " + hgv1.getPass());
		System.out.print(" Cargo Size: " + hgv1.getCargo());
		System.out.println(" Import Duty Cost: " + hgv1.calculateDuty());
	}
}