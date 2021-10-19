public class Address {
	String street;
	String city;
	String county;
	
	public Address(String t_street, String t_city, String t_county)
	{
		setAddress(t_street, t_city, t_county);
	}
	
	public void setAddress(String t_street, String t_city, String t_county)
	{
		street = t_street;
		city = t_city;
		county = t_county;
	}
	
	public String toString()
	{
		return street + ", " + city + ", Co." + county;
	}
}
