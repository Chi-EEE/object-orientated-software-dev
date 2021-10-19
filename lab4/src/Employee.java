public class Employee
{
	protected static int employeeRecords = 0;
	protected int officeAmount;
	protected Office[] currentOffices = new Office[2];
	
	protected int s_employeeNumber;
	protected Address currentAddress;

	public Employee(Address address)
	{
		currentAddress = address;
		s_employeeNumber = employeeRecords + 100;
		employeeRecords++;
	}
	public void setOffice(int officeIndex, Office office)
	{
		currentOffices[officeIndex] = office;
	}
	public String toString()
	{
		return "Employee Type: Staff. In " + officeAmount + " Office(s). Lives at " + currentAddress.toString() + "." ;
	}
}