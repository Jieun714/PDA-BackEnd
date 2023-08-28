package Adapter;

/**
 * Main에서 인스턴스로 생성해서 사용할 클래스  
 */
public class Banner {
	private String string;
	
	// 인자 하나를 갖는 생성자 선언 
	public Banner(String string) {
		this.string = string;
	}
	
	public void showWithParen() {
		System.out.println("("+ string +")");
	}
	
	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
