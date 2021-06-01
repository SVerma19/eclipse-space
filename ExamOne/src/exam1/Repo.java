package exam1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Repo {
	
	private Map<String, SourceFile> sourceFileMap;
	private Set<String> nameSet;
	private List<String> history;
	private Iterator<String> iterator;
	
	public Repo() {
		sourceFileMap = new HashMap<>();
		nameSet = new HashSet<>();
		history = new ArrayList<String>();
	}
	
	public void createSourceFile(String name, int size, String source) {
		SourceFile sfile = new SourceFile();
		sfile.setSize(size);
		sfile.setExtension(source);
		
		sourceFileMap.put(name, sfile);
		
		addToSet(name);
		
		addToHistory("added file: " + name);
	}
	
	public void removeFile(String file) {
		sourceFileMap.remove(file);
		
		addToHistory("removed file: " + file);
	}
	
	public void addToSet(String name) {
		nameSet.add(name);
	}
		
	public void addToHistory(String addedFile) {
		history.add(addedFile);
	}
	
	public void retrieveSingle(String name) {
		for (Map.Entry<String, SourceFile> sourceFileMap : sourceFileMap.entrySet()) {
			if (sourceFileMap.getKey().contains(name)) {
				System.out.println("Source file:  " + name + " | " + sourceFileMap.getValue());
			}
		}
	}
	
	public void retrieveMultiple(String value) {
		for (Map.Entry<String, SourceFile> sourceFileMap : sourceFileMap.entrySet()) {
			if (sourceFileMap.getValue().contains(value)) {
				System.out.println("Source file:  " + sourceFileMap.getKey() + " | " + value);
			}
		}
	}
	
	public void retrieveNames() {
		iterator = nameSet.iterator();
		
		while (iterator.hasNext()) {
	        System.out.println(iterator.next());
		}
	}

	
	public void retrieveRandom() {
		
	}
	
	public void displayFile() {
		
	}
	
	public void displayAll() {
		for (Entry<String, SourceFile> sourceFileMap : sourceFileMap.entrySet()) {
			System.out.println("file name: " + sourceFileMap.getKey() + " | info:  " + sourceFileMap.getValue());
		}
	}
			
}
