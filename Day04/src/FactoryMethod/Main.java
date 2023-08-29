package FactoryMethod;

/**
 * 메인 클래스
 * @author Jieun Lee
 * @version 1.0
 * */
public class Main {
	public static void main(String[] args) {
		/**
		 * IDCardFactory의 인스턴스 생성 - 상위클래스에서 동작(Factory) 
		 * */
		Factory factory = new IDCardFactory();
	

		System.out.println("========== Youngjin Kim ==========");
		/**
		 * IDCard의 인스턴스 생성 - 상위 클래스에서 받아 하위클래스에서 구체화 
		 * */
		Product card1 = factory.create("Youngjin Kim");
		
		System.out.println("\n========== Heungmin Son ==========");
		Product card2 = factory.create("Heungmin Son");

		System.out.println("\n=========== use() 출력 ============");
		card1.use();
		card2.use();
	}
}
