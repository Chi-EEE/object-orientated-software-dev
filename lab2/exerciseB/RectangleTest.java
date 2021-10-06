// Student Name 	: Chi Huu Huynh
// Student Id Number: C00261172
// Date 			: 05 October 2021
// Purpose 			: Test out the Rectangle object

public class RectangleTest
{
	public static void main(String args[]) 
	{
		Rectangle rectangleA = new Rectangle();

        rectangleA.setLength(5.0);
        rectangleA.setWidth(10.0);
        System.out.println(rectangleA.toString());

        System.out.println("The area of rectangleA is " + rectangleA.getArea());
        System.out.println("The perimeter of rectangleA is " + rectangleA.getPerimeter());

        rectangleA.printRectangle();
	}
}
