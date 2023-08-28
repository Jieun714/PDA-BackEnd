package Proxy;

public class Main {

	public static void main(String[] args) {
		Printable p1 = new PrinterProxy();
		System.out.println("이름은 현재 " + p1.getPrintName() + " 입니다.");
		p1.setPrinterName("Bob");
		System.out.println("이름은 현재 " + p1.getPrintName() + " 입니다.");
		p1.print("Hello, world");
		
		System.out.println("=====================\n");
		Printable p3 = new PrinterProxy("Jieun");
		System.out.println("이름은 현재 " + p3.getPrintName() + " 입니다.");
		System.out.println("이름은 현재 " + p1.getPrintName() + " 입니다.");
	}

}
