/**
 * @author C00261172 Huu Chi Huynh
 * @date 23/11/2021
 * @summary 
 * Animal class
 */
public abstract class Animal {
	private String name;
	private int age;
	private char gender;
	private boolean sleep;
	
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

	public boolean isAsleep() {
		return sleep;
	}

	public void sleep() {
		System.out.println(getName() + " has fallen asleep.");
		this.sleep = true;
	}
	
	public void wake() {
		System.out.println(getName() + " has waken up.");
		this.sleep = false;
	}
	
	abstract void eat();
	
	abstract void makeSound();

}
