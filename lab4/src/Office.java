/**
 * @author C00261172 Huu Chi Huynh
 * @date 19/10/2021
 * @summary 
 * Office Class for handling offices
 */
public class Office
{
	static private int roomNumbers = 0;
	private int roomNumber;
	private int employeeAmount;
	public Office()
	{
		employeeAmount = 0;
		roomNumber = roomNumbers + 100;
		roomNumbers++;
	}
	static public int getLastRoomNumber()
	{
		return roomNumbers;
	}
	public int getEmployeeAmount()
	{
		return employeeAmount;
	}
	public void increaseEmployeeAmount()
	{
		employeeAmount++;
	}
	public String toString()
	{
		return "Room Number: " + roomNumber + ". Employee Amount: " + employeeAmount; 
	}
}