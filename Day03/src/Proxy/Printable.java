package Proxy;

/**
 * Printer와 PrintProxy의 공통 인터페이스 
 * */
public interface Printable {
	/**
	 * 이름 설정 
	 * */
	public abstract void setPrinterName(String name);
	/**
	 * 이름 취득  
	 * */
	public abstract String getPrintName();
	/**
	 * 이름 표기  
	 * */
	public abstract void print(String string);
}
