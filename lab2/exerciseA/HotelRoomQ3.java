public class HotelRoomQ3
{
	private int roomNumber;
    private String roomType;

    private int occupied;
    private double rate;

	public HotelRoomQ3()
	{
	}

    //Initalise HotelRoom3 with the values as arguements
	public HotelRoomQ3(int t_roomNumber, String t_roomType)
	{
		setRoomNumber(t_roomNumber);
        setRoomType(t_roomType);
		setOccupied(0);
	}

    //Q3
	public HotelRoomQ3(int t_roomNumber, String t_roomType, int t_occupied, double t_rate)
	{
		setRoomNumber(t_roomNumber);
        setRoomType(t_roomType);
        setOccupied(t_occupied);
        setRate(t_rate);
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

	public int isOccupied()
	{
		return occupied;
	}

	public void setOccupied(int t_occupied)
	{
		occupied = t_occupied;
	}

	public double getRate()
	{
		return rate;
	}

	public void setRate(double t_rate)
	{
		rate = t_rate;
	}

}
