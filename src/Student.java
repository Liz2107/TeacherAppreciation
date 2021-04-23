
public class Student 
{
	private String name;
	public Student(String n)
	{
		name = n;
	}
	public void learnLifeLesson()
	{
		System.out.println(name + " has learned a life lesson!");
	}
	public void appreciate()
	{
		System.out.println("Dear Mr. McGuire, ");
		System.out.println("Thank you so much for such a wonderful year in AP Computer Science! I've had so much fun and learned so");
		System.out.println("many interesting things. I'm so fortunate that I've had the opportunity to take this class. I'm really ");
		System.out.println("going to miss having you next year. Thank you for all the great memories and stories!");
		System.out.println("Liz");
	}
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
}
