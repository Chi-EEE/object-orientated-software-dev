public class Rectangle extends TwoDShape{
	private double width;
	private double height;
	public Rectangle(String name, String color, double width, double height)
	{
		super(name, color);
		this.width = width;
		this.height = height;
	}
	public double area()
	{
		return width * height;
	}
}
