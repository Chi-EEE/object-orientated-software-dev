// Student Name 	: Chi Huu Huynh
// Student Id Number: C00261172
// Date 			: 05 October 2021
// Purpose 			: Initalise and print out the room numbers, types

public class HotelTest
{
	public static void main(String args[]) 
	{

		HotelRoomQ3 roomA = new HotelRoomQ3(200, "Single");

		System.out.println("Room Number. of Room A is " + roomA.getRoomNumber() + " and Room Type is: " + roomA.getRoomType());
        
        //Q2
        roomA.setOccupied(1);
        roomA.setRate(100.0);

        System.out.println("Room A is occupied: " + roomA.isOccupied() + " with a nightly rate of " + roomA.getRate());

        HotelRoomQ4 roomB = new HotelRoomQ4();
		
        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");

        //Q2
        roomB.setOccupied(false);
        roomB.setRate(20.0);

		System.out.println("Room Number. of Room B is " + roomB.getRoomNumber() + " and Room Type is: " + roomB.getRoomType());
        System.out.println("Room B is occupied: " + roomB.isOccupied() + " with a nightly rate of " + roomB.getRate());

        //Q3
        HotelRoomQ4 roomC = new HotelRoomQ4(202, "Single", false, 90);

		System.out.println("Room Number. of Room C is " + roomC.getRoomNumber() + " and Room Type is: " + roomC.getRoomType());
        System.out.println("Room B is occupied: " + roomC.isOccupied() + " with a nightly rate of " + roomC.getRate());

        //Q4
        roomB.setOccupied(true);
        if (!roomB.isOccupied())
        {
            System.out.println("Room isn't occupied");
            roomB.setOccupied(true);
        }
	}
}
