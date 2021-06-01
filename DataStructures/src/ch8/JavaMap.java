package ch8;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class JavaMap {

	public static void main (String[] args) {
		// create a map
		// by default you can put any object into a map
		
		Map mapA = new HashMap();
		Map mapB = new TreeMap();
		
		// generic java map
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		Map<Integer, String> mapHttpErrors = new HashMap<Integer, String>();
		
		// inserting elements into java map
		mapHttpErrors.put(200, "Ok");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(400, "Bad Request");
		mapHttpErrors.put(404, "Not Found");
		mapHttpErrors.put(500, "Internal Server Error");
		
		// null keys
		mapHttpErrors.put(null, "value for null key");
		
		// null values
		mapHttpErrors.put(100, null);
		
		System.out.println(mapHttpErrors);
		
		// get elements from a java map
		System.out.println(mapHttpErrors.get(404));
		
		// inserting all elements from a java map
		map.putAll(mapHttpErrors);
		System.out.println(map);
		
		// checking if map contains key
		if (mapHttpErrors.containsKey(200)) {
			System.out.println("Http status 200");
		}	
		
		// checking if map contains value
		if (mapHttpErrors.containsValue("Ok")) {
			System.out.println("Found status Ok");
		}	
		
		// removing a mapping from the map
		String removedValue = mapHttpErrors.remove(303);
		System.out.println(removedValue);
		
		// getting size of the map
		System.out.println(mapHttpErrors.size());
		
		// iterating the keys of a java map
		for (Integer key : mapHttpErrors.keySet()) {
			System.out.println(map.get(key) + ", ");
		}
		
	}
}
