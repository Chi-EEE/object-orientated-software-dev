public class RoadVehicle{
	private int wheels;	    //How many wheels it has
	private int passengers; //How many passengers it can carry
	private float price;
	
	public RoadVehicle() {
 		this(0,0,0);	
	}
 
	public RoadVehicle(int w, int p, float price) { 
		setWheels(w);
		setPass(p);
		setPrice(price);
	}
 
	public void setWheels(int num) {
		wheels = num;
		}
 
	public int getWheels() {
		return wheels;
		}
 
	public void setPass(int num) {
		passengers = num;
		}
 
	public int getPass() {
		return passengers;
		}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}