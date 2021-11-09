/**
 * @author C00261172 Huu Chi Huynh
 * @date 09/11/2021
 * @summary 
 * Student Class
 */
public class Student extends Person{	
	private int numCourses;
	private String[] courses = new String[2];
	private int[] grades = new int[2];
	
	public Student(String name, String address) {
		super(name, address);
	}

	public String toString()
	{
		String studentString = "Student: " + this.getName() + "(" + this.getAddress() + ")";

		for (int i = 0; i < numCourses; i++)
		{
			studentString += courses[i] + ":" + grades[i] + " ";
		}
		return studentString;
	}
	public void addCourseGrade(String courseCode, int courseGrade)
	{
		if (numCourses < 2)
		{
			courses[numCourses] = courseCode;
			grades[numCourses] = courseGrade;
			numCourses++;
		}
		else
		{
			System.out.print("Unable to add new course");
		}
	}
	public void printGrades()
	{
		String coursesString = "";
		for (int i = 0; i < numCourses; i++)
		{
			coursesString += courses[i] + ":" + grades[i] + " ";
		}
		System.out.println(coursesString);
	}
	
	public double getAverageGrade()
	{
		int gradeSum = 0;
		for (int i = 0; i < numCourses; i++)
		{
			gradeSum += grades[i];
		}
		return gradeSum / numCourses;
	}
}
