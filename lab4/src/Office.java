public class Office
{
	private int roomNumber;
	private int employeeAmount;
	public Office(int t_roomNumber)
	{
		roomNumber = t_roomNumber;
	}
	public int getEmployeeAmount()
	{
		return employeeAmount;
	}
	public String toString()
	{
		return "Room Number: " + roomNumber + ". Employee Amount: " + employeeAmount; 
	}
}