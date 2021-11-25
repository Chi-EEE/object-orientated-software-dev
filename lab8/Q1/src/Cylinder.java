public class Cylinder extends ThreeDShape{
	private double height;
	private double radius;
	public Cylinder(String name, String color, double height, double radius)
	{
		super(name, color);
		this.setHeight(height);
		this.radius = radius;
	}
	public double area()
	{
		return 2 * Math.PI * radius * getHeight() + 2 * Math.PI * Math.pow(radius, 2);
	}
	public double volume()
	{
		return Math.PI * Math.pow(radius, 2) * getHeight();
	}
	public String toString()
	{
  		return (super.toString() + "\nShape radius = " + this.radius + "\nShape height = " + this.getHeight());
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
}
