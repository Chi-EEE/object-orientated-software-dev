/**
 * @author C00261172 Huu Chi Huynh
 * @date 19/10/2021
 * @summary 
 * 
 */
public class MyHR
{
	// 3 Objects
	static private int s_roomNumber = 100;
	static private int s_employeeNumber = 1000;
	
	static private Employee[] employees = new Employee[5];
	static private Office[] offices = new Office[3];
	
	static public void listOffices()
	{
		for (int i = 0; i < s_roomNumber - 100; i++)
		{
			
		}
	}
	static public void createEmployeeRecord()
	{
		
	}
	static public void listEmployees()
	{
		for (int i = 0; i < s_employeeNumber - 1000; i++)
		{
			
		}
	}
	
	static private void assignOffice(Employee employee, int roomNumber)
	{
		
	}
	
	static private createEmployee(String street, String city, String county)
	{
		Address employeeAddress = new Address(street, city, county);
		employees.length
		employees[0] = new Employee(employee1Address);
		employees[0].setOffice(0, offices[0]);
	}
	
	public static void main(String args[]) 
    {
		for (int i = 0; i < 3; i++)
		{
			offices[i] = new Office(s_roomNumber);
		}
		s_roomNumber += 1;
		
		s_employeeNumber += 1;
    }
}