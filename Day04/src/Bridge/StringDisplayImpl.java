package Bridge;

/**
 * 구현 클래스 계층
 * @author Jieun Lee
 * @version 1.0
 * */
public class StringDisplayImpl extends DisplayImpl{
	/**
	 * 문자열  
	 * */
	private String string;
	/**
	 * 길이 
	 * */
	private int width;

	/**
	 * 하나의 인자를 받는 생성자 
	 * @param string 입력받은 문자열 
	 * @param width 문자열의 길이 
	 * */
	public StringDisplayImpl(String string) {
		this.string = string;
		this.width = string.length();
	}
	
	/**
	 * 출력 전 전처리 메소드 
	 * */
	@Override
	public void rawOpen() {
		printLine();
	}

	/**
	 * 입력받은 문자열을 출력하는 메소드 
	 * */
	@Override
	public void rawPrint() {
		System.out.printf("|%s|\n", string);
	}

	/**
	 * 출력 전 후처리 메소드 
	 * */
	@Override
	public void rawClose() {
		printLine();
	}

	/**
	 * 입력받은 문자열의 길이만큼 출력하는 메소드 
	 * */
	private void printLine() {
		System.out.print("+");
		for(int i=0; i<width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
