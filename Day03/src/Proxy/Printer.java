package Proxy;

/**
 * 인터페이스 Printable을 implements 받는 이름 붙인 프린터를 나타내는 클래스(본인) 
 * @author Jieun Lee
 * @version 1.0 
 * */
public class Printer implements Printable {
	/**
	 * 이름 
	 * */
	private String name;
	
	/**
	 * 기본 생성자 
	 * */
	public Printer() {
		heavyJob("Printer 인스턴스 생성 중");
	}
	
	/**
	 * 하나의 인자를 받는 생성자
	 * @param name 이름
	 * */
	public Printer(String name) {
		this.name = name;
		heavyJob("Printer 인스턴스("+ name + ") 생성 중");
	}
	
	/**
	 * 입력받은 이름을 설정하는 메소드
	 * @param name 이름
	 * */
	@Override
	public void setPrinterName(String name) {
		this.name = name;
	}

	/**
	 * 취득한 이름을 리턴하는 메소드
	 * @return name 이름
	 * */
	@Override
	public String getPrintName() {
		return name;
	}

	/**
	 * 입력 받은 문자열을 출력하는 메소드 
	 * @param string 문자열 
	 * */
	@Override
	public void print(String string) {
		System.out.println("======== " + name + " ========");
		System.out.println(string);
	}
	
	/**
	 * 5초가 실행되는 메소드 - 무거운 작업이라 가정하기 위해 사용  
	 * @param msg 출력할 메세지
	 */
	private void heavyJob(String msg) {
		System.out.print(msg);
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			System.out.print(".");
		}
		System.out.println("완료!!!");
	}
}
