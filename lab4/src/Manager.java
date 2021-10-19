/**
 * @author C00261172 Huu Chi Huynh
 * @date 19/10/2021
 * @summary 
 * Manager class, Like the employee class but has a car description variable
 */
public class Manager extends Employee {
	private String m_carDescription;

	public Manager(Address address)
	{
		super(address);
		m_carDescription = "null";
	}
	
	public Manager(Address address, String carDescription)
	{
		super(address);
		m_carDescription = carDescription;
	}
	public String toString()
	{
		return "Employee Number: " + m_employeeNumber + ". Employee Type: Manager. In " + officeAmount + " Office(s). Lives at " + currentAddress.toString() + ". Car Description: " + m_carDescription;
	}
}
