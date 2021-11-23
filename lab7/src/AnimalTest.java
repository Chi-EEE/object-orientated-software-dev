/**
 * @author C00261172 Huu Chi Huynh
 * @date 23/11/2021
 * @summary 
 * This program creates a animal class called dog and cat and
 * calls the methods inside of their classes
 */
public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Dog("Poodle", 4, 'M');
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		
		System.out.println();
		
		Animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.wake();
		cat.makeSound();

		System.out.println();
		
		Vet vet = new Vet("John");
		vet.vaccination(cat);
		vet.vaccination(dog);
	}

}