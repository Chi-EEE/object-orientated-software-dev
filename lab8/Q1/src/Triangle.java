public class Triangle extends TwoDShape{
	private double base;
	private double height;
	public Triangle(String name, String color, double base, double height)
	{
		super(name, color);
		setHeight(height);
		setBase(base);
	}
	public double area()
	{
		return 0.5 * base * height;
	}
	public String toString()
	{
  		return (super.toString() + "\nShape base = " + this.base + "\nShape height = " + this.height);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
}
