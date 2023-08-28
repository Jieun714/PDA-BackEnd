package Singleton;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start!!!");
		Singleton ob1 = Singleton.getInstance();
		Singleton ob2 = Singleton.getInstance(); //ob1과 같은 인스턴스 
		
		if(ob1 == ob2) {
			System.out.println("ob1과 ob2는 같은 인스턴스 입니다.");
		} else {
			System.out.println("ob1과 ob2는 같은 인스턴스가 아닙니다.");
		}
		System.out.println("End");
	}
}
