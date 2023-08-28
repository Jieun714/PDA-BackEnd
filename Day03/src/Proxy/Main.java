package Proxy;

/**
 * 메인 클래스 
 * @author Jieun Lee
 * @version 1.0
 * */
public class Main {
	
	public static void main(String[] args) {
		/**
		 * PrinterProxy 인스턴스 p1 생성 
		 * */
		Printable p1 = new PrinterProxy();
		System.out.println("이름은 현재 " + p1.getPrintName() + " 입니다.");
		p1.setPrinterName("Bob");
		System.out.println("이름은 현재 " + p1.getPrintName() + " 입니다.");
		p1.print("Hello, world");
		
		System.out.println("=====================\n");
		/**
		 * PrinterProxy 인스턴스 p2 생성 
		 * */
		Printable p2 = new PrinterProxy("Jieun");
		System.out.println("이름은 현재 " + p2.getPrintName() + " 입니다.");
		System.out.println("이름은 현재 " + p1.getPrintName() + " 입니다.");
	}

}
