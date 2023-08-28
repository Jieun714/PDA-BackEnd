package TemplateMethod;

public class Main {
	public static void main(String[] args) {
		// CharDisplay 인스턴스 생성 
		AbstractDisplay d1 = new CharDisplay('H');
		// StringDisplay 인스턴스 생성
		AbstractDisplay d2 = new StringDisplay("Hello, world");
		
		System.out.println("====== d1.display() ======");
		d1.display();
		System.out.println("====== d2.display() ======");
		d2.display();
	}
}
