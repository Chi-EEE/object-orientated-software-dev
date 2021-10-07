public class HotelRoomQ1
{
	private int roomNumber;
    private String roomType;

	public HotelRoomQ1()
	{
	}

    //Initalise HotelRoom1 with the values as arguments
	public HotelRoomQ1(int t_roomNumber, String t_roomType)
	{
		setRoomNumber(t_roomNumber);
        setRoomType(t_roomType);
	}

	public int getRoomNumber()
	{
		return roomNumber;
	}

	public void setRoomNumber(int t_roomNumber)
	{
		roomNumber = t_roomNumber;
	}

	public void setRoomType(String t_roomType)
	{
		roomType = t_roomType;
	}
    
	public String getRoomType()
	{
		return roomType;
	}
}
