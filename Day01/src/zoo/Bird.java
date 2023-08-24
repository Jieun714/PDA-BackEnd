package zoo;

/**
 * 추상클래스 Animal과 인터페이스 Flyable를 상속받는 Bird 클래스
 * @author Jieun Lee
 * @version 1.0
 * */
public class Bird extends Animal implements Flyable{
	/**
	 * 나이 
	 * */
	int age;
	/**
	 * 이름 
	 * */
	String name;
	
	/**
	 * Bird 클래스의 기본 생성자 
	 * */
	public Bird() {}
	/**
	 * 2개의 인자를 받는 생성자
	 * @param age 나이
	 * @param name 이름
	 * */
	public Bird(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	/**
	 * Animal 추상 클래스의 메소드를 오버라이딩  
	 * */
	@Override
	void sing() {
		System.out.println("basic sing");
	}
	
	/**
	 * flyable 인터페이스 메소드를 오버라이딩 
	 * */
	@Override
	public void fly() {
		System.out.println("basic fly");
	}
}
