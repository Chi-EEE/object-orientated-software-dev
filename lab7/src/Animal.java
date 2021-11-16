public class Animal {
	private String name;
	private int age;
	private char gender;
	
	public Animal(String name, int age, char gender)
	{
		setName(name);
		setAge(age);
		setGender(gender);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void eat()
	{
		
	}
	
	public void sleep()
	{
		
	}
	
	public void makeSound()
	{
		
	}
}
