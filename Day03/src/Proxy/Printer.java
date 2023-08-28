package Proxy;

/**
 * 이름 붙인 프린터를 나타내는 클래스(본인) 
 * */
public class Printer implements Printable {
	private String name;
	
	/**
	 * 기본 생성자 
	 * */
	public Printer() {
		heavyJob("Printer 인스턴스 생성 중");
	}
	
	/**
	 * 인자 하나 있는 생성자 
	 * */
	public Printer(String name) {
		this.name = name;
		heavyJob("Printer 인스턴스("+ name + ") 생성 중");
	}
	
	@Override
	public void setPrinterName(String name) {
		this.name = name;
	}

	@Override
	public String getPrintName() {
		return name;
	}

	@Override
	public void print(String string) {
		System.out.println("======== " + name + " ========");
		System.out.println(string);
	}
	
	// 무거운 작업이라 가정 - 실헹에 5초가 소요됨 
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
