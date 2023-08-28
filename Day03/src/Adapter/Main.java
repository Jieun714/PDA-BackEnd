package Adapter;

public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello"); // 인자 있는 인스턴스 생성 
		System.out.println("====== p.printWeak() ======");
		p.printWeak();
		System.out.println("===== p.printStrong() =====");
		p.printStrong();
	}
}
