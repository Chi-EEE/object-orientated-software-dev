
public class Employee extends Person{
	private double salary;
	
	public Employee(String name, double salary) {
		super(name);
		setSalary(salary);
	}
	
	public String getDescription()
	{
		return "An employee with a salary of " + getSalary();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
