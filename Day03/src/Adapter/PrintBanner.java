package Adapter;

/**
 * 추상 클래스를 상속 받은 클래스    
 * */
public class PrintBanner extends Print{
	private Banner banner; 
	
	/**
	 * 생성자에서 위임을 사용하여 인스턴스 생성  
	 * */
	public PrintBanner(String string) {
		this.banner = new Banner(string);  
	}
	
	/**
	 * 생성한 Banner 인스턴스의 메소드 호출 - showWithParen()
	 * */
	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	/**
	 * 생성한 Banner 인스턴스의 메소드 호출 - showWithAster()
	 * */
	@Override
	public void printStrong() {
		banner.showWithAster();
	}
}
