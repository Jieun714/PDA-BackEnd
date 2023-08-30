package visitor;

/**
 * 파일이나 디렉터리 목록을 표시하는 클래스 - Visitor 클래스의 하위 클래스 
 * */
public class ListVisitor extends Visitor{
	private String currentdir = "";

	@Override
	public void visit(File f) {
		System.out.println(currentdir + "/" + f);
	}

	@Override
	public void visit(Directory d) {
		System.out.println(currentdir + "/" + d);
		String savedir = currentdir;
		currentdir = currentdir + "/" + d.getName();
		for(Entry e: d) {
			e.accept(this);
		}
		currentdir = savedir;
	}
}
