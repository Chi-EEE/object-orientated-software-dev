public class Dog extends Animal{
	public Dog(String name, int age, char gender) {
		super(name, age, gender);
	}

	public void eat() {
		if (!isAsleep())
			System.out.println(getName() + " is now eatting dog food.");
		else
			System.out.println(getName() + " can't eat while asleep.");
	}

	public void makeSound() {
		if (!isAsleep())
			System.out.println(getName() + ": Bark!");
		else
			System.out.println(getName() + " can't make a sound while asleep.");
	}

	public String toString()
	{
		return "Dog Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender()+ ", Currently sleeping: " + isAsleep();
	}
}
