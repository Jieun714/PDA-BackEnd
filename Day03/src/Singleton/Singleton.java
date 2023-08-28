package Singleton;

public class Singleton {
	/**
	 * 싱글톤 인스턴스 생성 
	 * */
	private static Singleton singleton = new Singleton();
	
	/**
	 * private 생성자
	 * : private 생성자를 통해 싱글톤 클래스가 아닌 외부 어디에서도 인스턴스를 생성하지 못하도록함    
	 * */
	private Singleton() {
		System.out.println("인스턴스를 생성했습니다.");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
