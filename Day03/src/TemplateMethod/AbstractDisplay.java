package TemplateMethod;

public abstract class AbstractDisplay {
	public abstract void open();
	public abstract void print();
	public abstract void close();
	
	/**
	 * Override 없이 하위 클래스에서 공통으로 사용하기 위해 미리 구현 
	 * */
	public final void display() {	
		open();
		for(int i=0; i<5; i++) {
			print();
		}
		close();
	}
}
