package Proxy;

/**
 * 이름 붙인 프린터를 나타내는 클래스(대리인) 
 * */
public class PrinterProxy implements Printable{
	private String name;
	private Printer real;
	
	/**
	 * 기본 생성자
	 */
	public PrinterProxy() {
		this.name = "No Name";
		this.real = null;
	}
	
	/**
	 * 인자 하나 있는 생성자 
	 * */
	public PrinterProxy(String name) {
		this.name = name;
		this.real = null;
	}
	
	/**
	 * 동기화 설정 - realize()와 setPrinterName()을 동시에 실행시키기 위함 
	 * */
	@Override
	public synchronized void setPrinterName(String name) {
		if(real != null) { //실체화가 되었다면 
			real.setPrinterName(name);
		}
		this.name = name;
	}

	@Override
	public String getPrintName() {
		return name;
	}

	@Override
	public void print(String string) {
		realize();
		real.print(string);
	}
	
	private synchronized void realize() {
		if(real == null) { //실체화된 적이 없다면 
			real = new Printer(name); // Printer 인스턴스 생성 
		}
	}
}
