package human;

public class Human {
	int age;
	String name;
	
	public Human() {} //기본 생성자 
	
	public Human(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public void speak() {
		System.out.println("human speak()");
	}
}
