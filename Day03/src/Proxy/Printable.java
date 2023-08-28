package Proxy;

/**
 * Printer와 PrintProxy의 공통 인터페이스
 * @author Jieun Lee
 * @version 1.0
 * */
public interface Printable {
	/**
	 * 이름 설정하는 메소드 
	 * @param name 설정할 이름 
	 * */
	public abstract void setPrinterName(String name);
	/**
	 * 이름 취득하는 메소드 
	 * */
	public abstract String getPrintName();
	/**
	 * 문자열 표시하는 메소드 
	 * @param string 입력 받은 문자열 
	 * */
	public abstract void print(String string);
}
