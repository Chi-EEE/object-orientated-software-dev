public class Sphere extends ThreeDShape {
	private double radius;
	public Sphere(String name, String color, double radius)
	{
		super(name, color);
		this.radius = radius;
	}
	public double area()
	{
		return 4 * Math.PI * Math.pow(radius, 2);
	}

	public double volume() {
		return (4/3) * Math.PI * Math.pow(radius, 3);
	}
}
