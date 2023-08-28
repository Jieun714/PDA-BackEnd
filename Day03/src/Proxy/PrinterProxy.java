package Proxy;

/**
 * 인터페이스 Printable을 implements 받는 이름 붙인 프린터를 나타내는 클래스(대리인)
 * @author Jieun Lee
 * @version 1.0 
 * */
public class PrinterProxy implements Printable{
	/**
	 * 이름 
	 * */
	private String name;
	/**
	 * '본인'  
	 * */
	private Printer real;
	
	/**
	 * 기본 생성자
	 */
	public PrinterProxy() {
		this.name = "No Name";
		this.real = null;
	}
	
	/**
	 * 하나의 인자를 받는 생성자
	 * @param name 이름
	 * */
	public PrinterProxy(String name) {
		this.name = name;
		this.real = null;
	}
	
	/**
	 * 입력받은 이름을 설정하는 메소드
	 * 본인 생성이 되었다면 이름을 설정한다 
	 * @param name 이름
	 * */
	@Override
	public synchronized void setPrinterName(String name) {
		if(real != null) { //실체화가 되었다면 
			real.setPrinterName(name);
		}
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
	 * 본인 생성하는 동기화 메소드를 호출하고, '본인' 결과를 출력하는 메소드  
	 * @param string 문자열 
	 * */
	@Override
	public void print(String string) {
		realize();
		real.print(string);
	}
	
	/**
	 * 본인을 생성하는 동기화 메소드
	 * 생성된 적이 없다면 Printer 인스턴스를 생성한다
	 * */
	private synchronized void realize() {
		if(real == null) { //실체화된 적이 없다면 
			real = new Printer(name); // Printer 인스턴스 생성 
		}
	}
}
