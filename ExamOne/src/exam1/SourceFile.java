package exam1;

import java.util.List;

public class SourceFile {
	
	String name;
	int size;
	String source;
	String change;
	private List<String> history;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setExtension(String source) {
		this.source = source;
	}
	
	public String getExtension() {
		return source;
	}
	
	public void History(String change) {
		this.change = change;
		history.add(change);
	}
	
	public void Display() {
		
	}


}
