public class Cylinder extends ThreeDShape{
	private double height;
	private double radius;
	public Cylinder(String name, String color, double height, double radius)
	{
		super(name, color);
		this.height = height;
		this.radius = radius;
	}
	public double area()
	{
		return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
	}
	public double volume()
	{
		return Math.PI * Math.pow(radius, 2) * height;
	}
}
