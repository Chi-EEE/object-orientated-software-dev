/**
 * @author C00261172 Huu Chi Huynh
 * @date 23/11/2021
 * @summary 
 * Cat class, subclass of Animal
 */
public class Cat extends Animal {
	public Cat(String name, int age, char gender) {
		super(name, age, gender);
	}

	public void eat() {
		if (!isAsleep())
			System.out.println(getName() + " is now eatting cat food.");
		else
			System.out.println(getName() + " can't eat while asleep.");
	}

	public void makeSound() {
		if (!isAsleep())
			System.out.println(getName() + ": Meow ~");
		else
			System.out.println(getName() + " can't make a sound while asleep.");
	}

	public String toString()
	{
		return "Cat Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender() + ", Currently sleeping: " + isAsleep();
	}
}
