public class HotelRoom
{
	private int roomNumber;
    private String roomType;

	public HotelRoom()
	{
	}

    //Initalise HotelRoom with the values as arguements
	public HotelRoom(int t_roomNumber, String t_roomType)
	{
		setRoomNumber(t_roomNumber);
        setRoomType(t_roomType);
	}
		
	public Thermometer(double cel)
	{
		setCelsius(cel);
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
