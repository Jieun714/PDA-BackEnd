package Bridge;

/**
 * 기능 클래스 계층
 * @author Jieun Lee
 * @version 1.0
 * */
public class CountDisplay extends Display{
	
	/**
	 * 하나의 인자를 받는 생성자 
	 * 하나의 인자를 받는 부모 생성자 호출 
	 * @param impl 구현을 나타내는 클래스의 인스턴스 
	 * */
	public CountDisplay(DisplayImpl impl) {
		super(impl); 
	}
	
	/**
	 * 지정 횟수만큼 표시하는 메소드
	 * @param times 실행시킬 횟수  
	 * */
	public void multiDisplay(int times) {
		open();
		for(int i=0; i<times; i++) {
			print();
		}
		close();
	}
}
