import java.util.ArrayList;
public class Teacher 
{
	protected String name;
	protected ArrayList<String> subjects;
	protected ArrayList<Student> currentStudents;
	protected int awesomeFactor;
	public Teacher(String n, ArrayList<String> s, ArrayList<Student> st, int a)
	{
		name = n;
		subjects = s;
		awesomeFactor = a;
		currentStudents = st;
	}
	public void assignWeekendHomework()
	{
		//imagine a teacher who would do this
		awesomeFactor -= 10;
		System.out.println(":( " + getAwesomeFactor());
	}
	public void tellStories(String subject, String location, String name, ArrayList<Student> students)
	{
		System.out.println("Class, I'd like to tell you a story about " + subject + ".");
		System.out.println("Once upon a time there was a wise man named " + name + " who lived in " + location + "...");
		awesomeFactor += 10;
		System.out.println(":) " + getAwesomeFactor());
		System.out.println("");
		for(Student s : students)
		{
			s.learnLifeLesson();
			awesomeFactor += 20;
			System.out.println(":) " + getAwesomeFactor());
		}
		
	}
	public void teach(String subject)
	{
		System.out.println(name + " is teaching " + subject + ".");
		awesomeFactor += 10;
		System.out.println(":) " + getAwesomeFactor());
	}
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
	public ArrayList<String> getSubjects()
	{
		return subjects;
	}
	public void setSubjects(ArrayList<String> s)
	{
		subjects = s;
	}
	public ArrayList<Student> getStudents()
	{
		return currentStudents;
	}
	public void setStudents(ArrayList<Student> s)
	{
		currentStudents = s;
	}
	public String getAwesomeFactor()
	{
		String a = "Awesome Factor: " + awesomeFactor;
		return a;
	}
	public void setAwesomeFactor(int a)
	{
		awesomeFactor = a;
	}
	
}
