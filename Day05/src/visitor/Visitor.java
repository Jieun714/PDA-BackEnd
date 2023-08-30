package visitor;

/**
 * 파일이나 디렉터리를 방문하는 방문자를 나타내는 추상클래스
 * 두개의 추상 메소드에서 오버로드 사용 - 메소드 호출 시 인수의 형에 따라 자동으로 메소드가 식별된다 
 * */
public abstract class Visitor {
	public abstract void visit(File f);
	public abstract void visit(Directory d);
}
