/**
 * @author C00261172 Huu Chi Huynh
 * @date 02/11/2021
 * @summary 
 * Circle Application: Makes a new point object and circle object;
 * And prints the point and circle's position
 */
public class MyFirstCircle {
	public static void main (String args[])
	{
		Point myPoint = new Point(10, 20);
		Circle myCircle = new Circle(15, 30, 5);
		System.out.println("Point  details: "  + myPoint);
		System.out.println("Circle  details: "  + myCircle);
	}
}
