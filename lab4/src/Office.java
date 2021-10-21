/**
 * @author C00261172 Huu Chi Huynh
 * @date 19/10/2021
 * @summary 
 * Office Class for handling offices
 */
public class Office
{
	static private final int MAX_EMPLOYEES = 2;
	static private int roomNumbers = 0;
	private int roomNumber;
	private int employeeAmount;
	private Employee[] employees = new Employee[2];
	
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
	public void addEmployee(Employee employee)
	{
		if (employeeAmount < MAX_EMPLOYEES)
		{
			employees[employeeAmount] = employee;
			employeeAmount++;
		}
		else
		{
			System.out.println("Unable to assign employee " + employeeAmount + " to Room number: " + roomNumber);
		}
	}
	public String getEmployees()
	{
		String employeeString = "The " + employeeAmount + " employee(s) in office: [" + roomNumber + "] are:\n";
		for (int i = 0; i < MAX_EMPLOYEES; i++)
		{
			employeeString += employees[i].toString();
			employeeString += "\n";
		}
		return employeeString;
	}
	public String toString()
	{
		return "Room Number: " + roomNumber + ". Employee Amount: " + employeeAmount; 
	}
}