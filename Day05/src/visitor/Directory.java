package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 디렉터리를 나타내는 클래스 
 * */
public class Directory extends Entry implements Iterable<Entry>{
	private String name;
	private List<Entry> directory = new ArrayList<>();
	
	public Directory(String name) {
		super();
		this.name = name;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public Iterator<Entry> iterator() {
		return directory.iterator();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		for(Entry entry: directory) {
			size += entry.getSize();
		}
		return size;
	}
	
	public Entry add(Entry e) {
		directory.add(e);
		return this;
	}
}
