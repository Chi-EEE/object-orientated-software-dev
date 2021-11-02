public class Point {
	protected int X;
	protected int Y;

	public Point(int X, int Y)
	{
		setX(X);
		setY(Y);
	}
	
	protected int getX()
	{
		return this.X;
	}
	protected void setX(int X)
	{
		this.X = X;
	}

	protected int getY()
	{
		return this.X;
	}
	protected void setY(int Y)
	{
		this.Y = Y;
	}
	public String toString()
	{
		return "Position: " + this.X + ", " + this.Y;
	}
}
