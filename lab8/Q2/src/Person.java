
public abstract class Person {
	private String name;

	public Person(String name)
	{
		setName(name);
	}
	
	public abstract String getDescription();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
