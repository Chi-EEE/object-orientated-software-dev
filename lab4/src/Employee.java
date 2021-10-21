/**
 * @author C00261172 Huu Chi Huynh
 * @date 19/10/2021
 * @summary 
 * Employee Class, for handling the employee's details.
 */
public class Employee
{
	protected static int employeeRecords = 0;
	protected int officeAmount;
	protected Office currentOffice;
	
	protected int m_employeeNumber;
	protected Address currentAddress;

	public Employee(Address address)
	{
		currentAddress = address;
		m_employeeNumber = employeeRecords + 1000;
		employeeRecords++;
	}
	public void setOffice(Office office)
	{
		currentOffice = office;
		officeAmount++;
	}
	public int getEmployeeNumber()
	{
		return m_employeeNumber;
	}
	/**
	 * Returns the amount of employee records
	 * @return
	 */
	static public int getEmployeeRecords()
	{
		return employeeRecords;
	}
	public String toString()
	{
		return "Employee Number: " + m_employeeNumber + ". Employee Type: Staff. In " + officeAmount + " Office(s). Lives at " + currentAddress.toString() + "." ;
	}
}