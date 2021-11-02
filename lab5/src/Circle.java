
public class Circle extends Point{
	private int Radius;

	public Circle(int X, int Y, int Radius)
	{
		super(X, Y);
		setRadius(Radius);
	}
	
	public void setRadius(int Radius)
	{
		this.Radius = Radius;
	}
	public int getRadius()
	{
		return this.Radius;
	}
	public String toString()
	{
		return "Position: " + this.X + ", " + this.Y + " | Radius: " + this.Radius;
	}
}
