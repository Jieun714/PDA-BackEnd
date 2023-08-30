package visitor;

/**
 * 참고: Element 인터페이스를 상속받지만 인터페이스 메소드의 구체적인 구현은 하위 클래스로 넘긴다. 
 * */
public abstract class Entry implements Element {
	public abstract String getName(); //파일 명을 얻어온다
	public abstract int getSize(); //파일의 크기를 얻어온다 
	
	
	@Override
	public String toString() {
		return getName() + "(" + getSize() + ")";
	}
}
