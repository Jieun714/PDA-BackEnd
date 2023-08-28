package Adapter;

/**
 * 위임을 사용하는 Adapter 패턴을 구현하기 위한 추상 클래스   
 */
public abstract class Print {
	public abstract void printWeak();
	public abstract void printStrong();
}