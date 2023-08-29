package Bridge;

/**
 * 구현 클래스 계층 - 구현의 클래스 계층 최상위 
 * @author Jieun Lee
 * @version 1.0
 * */
public abstract class DisplayImpl {
	/**
	 * Display 클래스의 open에 대응하여 전처리하는 메소드 
	 * */
	public abstract void rawOpen();
	
	/**
	 * Display 클래스의 print에 대응하여 표시하는 메소드 
	 * */
	public abstract void rawPrint();
	
	/**
	 * Display 클래스의 close에 대응하여 후처리하는 메소드 
	 * */
	public abstract void rawClose();
}
