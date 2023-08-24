package zoo;

public class Bird extends Animal implements Flyable{
	int age;
	String name;
	
	public Bird() {}
	public Bird(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	void sing() {
		System.out.println("basic sing");
	}
	
	@Override
	public void fly() {
		System.out.println("basic fly");
	}
}
