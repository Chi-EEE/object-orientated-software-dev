public class Circle extends TwoDShape{
	private double radius;
	public Circle(String name, String color, double radius)
	{
		super(name, color);
		this.radius = radius;
	}
	public double area()
	{
		return Math.PI * Math.pow(radius, 2);
	}
}
