public class Rectangle extends TwoDShape{
	private double width;
	private double height;
	
	public Rectangle(String name, String color, double width, double height)
	{
		super(name, color);
		setWidth(width);
		setHeight(height);
	}
	
	public double area()
	{
		return width * getHeight();
	}
	public String toString()
	{
  		return (super.toString() + "\nShape width = " + this.width + "\nShape height = " + this.getHeight());
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
}
