package zoo;

/**
 * Bird 클래스 상속받는 Chicken 클래스
 * @author Jieun Lee
 * @version 1.0
 * */
public class Chicken extends Bird {
	/**
	 * 나이 
	 * */
	int age;
	/**
	 * 이름 
	 * */
	String name;
	
	/**
	 * Chicken 클래스의 기본 생성자 
	 * */
	public Chicken() {}
	/**
	 * 2개의 인자를 받는 생성자
	 * @param age 나이
	 * @param name 이름
	 * */
	public Chicken(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	/**
	 * Bird 클래스의 fly() 메소드를 오버라이딩  
	 * */
	@Override
	public void fly() {
		System.out.printf("not so far %d\n", name);
	}
	
	/**
	 * Bird 클래스의 sing() 메소드를 오버라이딩  
	 * */
	@Override
	public void sing() {
		System.out.println("꼬끼오");
	}
}