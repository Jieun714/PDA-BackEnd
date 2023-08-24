package zoo;

/**
 * Bird 클래스 상속받는 Sparrow 클래스
 * @author Jieun Lee
 * @version 1.0
 * */
public class Sparrow extends Bird{
	/**
	 * 나이 
	 * */
	int age;
	/**
	 * 이름 
	 * */
	String name;
	
	/**
	 * Sparrow 클래스의 기본 생성자 
	 * */
	public Sparrow() {}

	/**
	 * 2개의 인자를 받는 생성자
	 * @param age 나이
	 * @param name 이름
	 * */
	public Sparrow(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	/**
	 * Bird 클래스의 fly() 메소드를 오버라이딩  
	 * */
	@Override
	public void fly() {
		System.out.println("high");
	}
	
	/**
	 * Bird 클래스의 sing() 메소드를 오버라이딩  
	 * */
	@Override
	public void sing() {
		System.out.println("짹쨱");
	}
}
