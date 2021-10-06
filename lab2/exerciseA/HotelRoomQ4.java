public class HotelRoom
{
	private int roomNumber;
    private String roomType;

    private boolean occupied;
    private double rate;

	public HotelRoom()
	{
	}

    //Initalise HotelRoom with the values as arguements
	public HotelRoom(int t_roomNumber, String t_roomType)
	{
		setRoomNumber(t_roomNumber);
        setRoomType(t_roomType);
	}

	public HotelRoom(int t_roomNumber, String t_roomType, int t_occupied, double t_rate)
	{
		setRoomNumber(t_roomNumber);
        setRoomType(t_roomType);
        setOccupied(t_occupied);
        setRate(t_rate);
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

    // Q2
	public boolean isOccupied()
	{
		return occupied;
	}

	public void setOccupied(boolean t_occupied)
	{
		occupied = t_occupied;
	}

	public bool getRate()
	{
		return rate;
	}

	public void setRate(double t_rate)
	{
		rate = t_rate;
	}

}
