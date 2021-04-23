import java.util.ArrayList;
public class Appreciator 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Liz"));
		ArrayList<String> teacherSubjects = new ArrayList<String>();
		teacherSubjects.add("Java");
		teacherSubjects.add("Web App Development");
		teacherSubjects.add("AP CS");
		Teacher mrMcGuire = new Teacher("Mr. McGuire", teacherSubjects, students, 0);
		for(String s : teacherSubjects)
		{
			mrMcGuire.teach(s);
			Thread.sleep(3000);
			System.out.println("");
		}
		mrMcGuire.tellStories("Philosophy", "Ancient Greece", "Aristotle", students);
		Thread.sleep(3000);
		System.out.println("");
		teacherSubjects.add("Theology");
		for(String s : teacherSubjects)
		{
			mrMcGuire.teach(s);
			Thread.sleep(3000);
			System.out.println("");
		}
		students.get(0).appreciate();
	}
}
