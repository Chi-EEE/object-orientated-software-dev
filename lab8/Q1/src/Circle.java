public class Circle extends TwoDShape{
	private double radius;
	public Circle(String name, String color, double radius)
	{
		super(name, color);
		this.setRadius(radius);
	}
	public double area()
	{
		return Math.PI * Math.pow(getRadius(), 2);
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
