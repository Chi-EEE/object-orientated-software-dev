/**
 * @author C00261172 Huu Chi Huynh
 * @date 09/11/2021
 * @summary 
 * Teacher Class
 */
public class Teacher extends Person{
	private int numCourses;
	private String courses[] = new String[2];
	public Teacher(String name, String address) {
		super(name, address);
	}
	public String toString()
	{
		return "Teacher: " + this.getName() + "(" + this.getAddress() + ")";
	}
	public boolean addCourse(String course)
	{
		if (numCourses < 2)
		{
			courses[numCourses] = course;
			numCourses++;
			return true;
		}
		return false;
	}
	public boolean removeCourse(String course)
	{
		if (numCourses > 0)
		{
			numCourses--;
			courses[numCourses] = null;
			return true;
		}
		return false;
	}
}
