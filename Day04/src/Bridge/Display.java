package Bridge;

/**
 * 기능 클래스 계층 - 최상위 클래스 
 * @author Jieun Lee
 * @version 1.0
 * */
public class Display {
	/**
	 * Display 클래스의 '구현'을 나타내는 인스턴스 
	 * */
	private DisplayImpl impl;
	
	/**
	 * 하나의 인자를 받는 생성자 
	 * 인수로 전달된 인스턴스는 impl 필드에 저장
	 * @param impl 구현을 나타내는 클래스의 인스턴스 
	 * */
	public Display(DisplayImpl impl) {
		this.impl = impl;
	}
	
	/**
	 * 표시의 전처리하는 메소드 
	 * */
	public void open() {
		impl.rawOpen();
	}
	
	/**
	 * 표시하는 메소드 
	 * */
	public void print() {
		impl.rawPrint();
	}
	
	/**
	 * 표시의 후처리하는 메소드 
	 * */
	public void close() {
		impl.rawClose();
	}
	
	/**
	 * 선언된 open, print, close 메소드를 호출하는 메소드 
	 * */
	public final void display() {
		open();
		print();
		close();
	}
}
