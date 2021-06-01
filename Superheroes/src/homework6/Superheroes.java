package homework6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Superheroes {
	
	private Map<String, String> heroMap;
	private Set<String> powerSet;
	private Iterator<String> iterator;
	private Iterator<String> powerIterator;

	public Superheroes() {
		heroMap = new HashMap<>();
		powerSet = new HashSet<>();
	}

	public void putEntryInMap(String name, String weapon) {
		heroMap.put(name, weapon);
	}

	public void getValueFromMap(String key) {
		String heroKey = heroMap.get(key);
		System.out.println("value: " + heroKey);
	}
	
	public void removeEntryFromMap(String key) {
		heroMap.remove(key);
	}

	public void addToSet(String power) {
		powerSet.add(power);
	}
	
	public void removeFromSet(String removePower) {
		powerSet.remove(removePower);
	}
	
	public void displayAllMapEntries() {
		for (Map.Entry<String,String> heroMap : heroMap.entrySet()) {
			System.out.println("key: " + heroMap.getKey() + " | value:  " + heroMap.getValue());
		}
	}
	
	public void displayAllMapEntries2() {
		Set<String> s = heroMap.keySet();
		
		iterator = s.iterator();
		
		while (iterator.hasNext()) {
			
			String key = iterator.next();
			String value = heroMap.get(key);
			
			System.out.println("Key: " + key);
			System.out.println("Value: " + value);	 
		}
		
	}
	
	public void printSet() {
		powerIterator = powerSet.iterator();
		
		while (powerIterator.hasNext()) {
	        System.out.println(powerIterator.next());
		}
	}

}



