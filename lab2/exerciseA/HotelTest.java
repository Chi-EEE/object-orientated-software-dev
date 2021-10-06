// Student Name 	: Chi Huu Huynh
// Student Id Number: C00261172
// Date 			: 05 October 2021
// Purpose 			: Initalise and print out the room numbers and types

public class HotelTest
{
	public static void main(String args[]) 
	{

		HotelRoom roomA = new HotelRoom(200, "Single");

		System.out.println("Room Number. of Room A is " + roomA.getRoomNumber() + " and Room Type is: " + roomA.getRoomType());
        
        //Q2
        roomA.setOccupied(1);
        roomA.setRate(100.0);

        System.out.println("Room A is occupied: " + roomA.isOccupied() + " with a nightly rate of " + roomA.getRate());

        HotelRoom roomB = new HotelRoom()
		
        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");

        //Q2
        roomB.setOccupied(false);
        roomB.setRate(20.0);

		System.out.println("Room Number. of Room B is " + roomB.getRoomNumber() + " and Room Type is: " + roomB.getRoomType());
        System.out.println("Room B is occupied: " + roomB.isOccupied() + " with a nightly rate of " + roomB.getRate());

        //Q3
        HotelRoom roomC = new HotelRoom(202, "Single", 0, 90);
        
        //Q4
        roomB.setOccupied(true);
        if (!roomB.isOccupied())
        {
            System.out.println("Room isn't occupied")
            roomB.setOccupied(true);
        }
	}
}
