/**
 * @author C00261172 Huu Chi Huynh
 * @date 19/10/2021
 * @summary 
 * HR System, for handling Employees and Offices
 */
public class MyHR
{
	static private int MAX_EMPLOYEES = 5;
	static private int MAX_EMPLOYEES_IN_OFFICE = 2;
	
	static private Employee[] employees = new Employee[5];
	static private Office[] offices = new Office[3];

	/**
	 * Does a loop and prints out the office to string result
	 */
	static public void listOffices()
	{
		for (int i = 0; i < Office.getLastRoomNumber(); i++)
		{
			System.out.println(offices[i].toString());
		}
	}
	
	/**
	 * Does a loop and prints out the employee to string result
	 */
	static public void listEmployees()
	{
		for (int i = 0; i < Employee.getEmployeeRecords(); i++)
		{
			System.out.println(employees[i].toString());
		}
	}
	
	/**
	 * Assigns an office to the employee
	 * @param employee The current employee
	 * @param roomNumber The room number of the office
	 */
	static private void assignOffice(int employeeNumber, int roomNumber)
	{
		Office currentOffice = offices[roomNumber - 100];

		if (currentOffice.getEmployeeAmount() >= MAX_EMPLOYEES_IN_OFFICE)
		{
			System.out.println("Unable to assign employee " + employeeNumber + " to Room number: " + roomNumber);
			return;
		}
		employees[employeeNumber - 1000].setOffice(currentOffice);
		currentOffice.increaseEmployeeAmount();
	}
	
	/**
	 * Create a new employee with a given Employee type, room number and address
	 * @param type The employee's type
	 * @param roomNumber The room number
	 * @param street The street name
	 * @param city The city name
	 * @param county The county name
	 * @param carDescription The car's description
	 */
	static private void createEmployeeRecord(EmployeeType type, int roomNumber, String street, String city, String county, String carDescription)
	{
		if (Employee.getEmployeeRecords() >= MAX_EMPLOYEES)
		{
			System.out.println("Unable to create new employee record, The maximum is: " + MAX_EMPLOYEES);
			return;
		}
		Address employeeAddress = new Address(street, city, county);
		switch(type)
		{
		case Staff:
			/**
			 * Create a class of Employee
			 */
			Employee newEmployee = new Employee(employeeAddress);
			employees[newEmployee.getEmployeeNumber() - 1000] = newEmployee;
			assignOffice(newEmployee.getEmployeeNumber(), roomNumber);
			break;
		case Manager:
			/**
			 * Create a class of Manager
			 */
			Manager newManager = new Manager(employeeAddress, carDescription);
			employees[newManager.getEmployeeNumber() - 1000] = newManager;
			assignOffice(newManager.getEmployeeNumber(), roomNumber);
			break;
		default:
			/**
			 * Error checking
			 */
			System.out.println("Employee Type of " + type + " not supported.");
			break;
		}
	}
	
	public static void main(String args[]) 
    {
		// Creates 3 rooms with different room numbers
		for (int i = 0; i < 3; i++)
		{
			offices[i] = new Office();
		}

		// Create 5 different employees with different enum types.
		createEmployeeRecord(EmployeeType.Staff, 100, "IT Carlow", "Carlow Town", "Carlow", null);
		createEmployeeRecord(EmployeeType.Manager, 100, "32 Oldwood Terrace", "Randalstown", "Antrim", "Epic Car");
		createEmployeeRecord(EmployeeType.Staff, 100, "Dublin House", "Dublin City", "Dublin", null); // Can't assign employee 3 to room 100
		createEmployeeRecord(EmployeeType.Staff, 102, "63 Kenyon St.", "Nenagh", "Tipperary", null);
		createEmployeeRecord(EmployeeType.Manager, 102, "53 Canterbrook Trim Rd", "Navan", "Meath", null);

		assignOffice(1003, 101);
		
		listEmployees();
		listOffices();
		createEmployeeRecord(EmployeeType.Staff, 101, "Ballyhaught", "Kilmallock", "Limerick", null);
	}
}
