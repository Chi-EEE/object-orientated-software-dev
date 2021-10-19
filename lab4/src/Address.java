/**
 * @author C00261172 Huu Chi Huynh
 * @date 19/10/2021
 * @summary 
 * Address Class, contains street, city and county names
 */
public class Address {
	String street;
	String city;
	String county;
	
	public Address(String t_street, String t_city, String t_county)
	{
		setAddress(t_street, t_city, t_county);
	}
	
	/**
	 * Set the following variables to the inputed strings
	 * @param t_street
	 * @param t_city
	 * @param t_county
	 */
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
