public class Sphere extends ThreeDShape {
	private double radius;
	public Sphere(String name, String color, double radius)
	{
		super(name, color);
		setRadius(radius);
	}
	public double area()
	{
		return 4 * Math.PI * Math.pow(getRadius(), 2);
	}

	public double volume() {
		return (4/3) * Math.PI * Math.pow(getRadius(), 3);
	}
	public String toString()
	{
  		return (super.toString() + "\nShape radius = " + this.getRadius());
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
