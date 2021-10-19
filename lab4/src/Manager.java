public class Manager extends Employee {
	private String s_carDescription;

	public Manager(Address address)
	{
		super(address);
		s_carDescription = "";
	}
	
	public Manager(Address address, String carDescription)
	{
		super(address);
		s_carDescription = carDescription;
	}
	public String toString()
	{
		return "Employee Type: Manager. In " + officeAmount + " Office(s). Lives at " + currentAddress.toString() + ". Car Description: " + s_carDescription;
	}
}
