/**
 * @author C00261172 Huu Chi Huynh
 * @date 23/11/2021
 * @summary 
 * Vet class
 */
public class Vet {
	private String name;

	public Vet()
	{
		setName("");
	}
	
	public Vet(String name)
	{
		setName(name);
	}
	
	public void vaccination(Animal animal)
	{
		System.out.println(getName() + " is vaccinating.");
		String vaccinatedString = "is vaccinated: " + animal.toString();
		if (animal instanceof Dog)
		{
			vaccinatedString = "Dog " + vaccinatedString;
		}
		else if (animal instanceof Cat)
		{
			vaccinatedString = "Cat " + vaccinatedString;
		}
		System.out.println(vaccinatedString);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
