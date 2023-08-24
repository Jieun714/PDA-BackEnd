package human;

public class Student extends Human {
	int age;
	String name;
	
	public void speak() {
		System.out.println("I am a Student");
	}
	
	public void learn() {
		System.out.println("I am studying Java");
	}
}
