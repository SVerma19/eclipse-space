package ch8;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class HWMap {

	public static void main (String[] args) {	
		Map<Integer, String> mapHttpErrors = new HashMap<Integer, String>();
		
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(404, "Not Found");
		mapHttpErrors.put(500, "Internal Server Error");
		mapHttpErrors.put(501, "Bad Geteway");
		mapHttpErrors.put(511, "Network Authentication Required");
		mapHttpErrors.put(599, "Network Connection Timeout Error");
		
		System.out.println("Map is empty?: " + mapHttpErrors.isEmpty());
		
		if (mapHttpErrors.containsKey(301)) {
			System.out.println("Http status 301");
		} else {
			System.out.println("Http status 301 NOT FOUND");
		}
		
		if (mapHttpErrors.containsValue("OK")) {
			System.out.println("Found status OK");
		}	
		
		String removedValue = mapHttpErrors.remove(200);
		System.out.println("Value removed: " + removedValue);
		
		System.out.println(mapHttpErrors.size());
		
		System.out.println(mapHttpErrors.get(500));
		
		
		Iterator it = mapHttpErrors.entrySet().iterator();
		while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        System.out.println(pair.getKey() + " => " + pair.getValue());
		        it.remove();
		}
		
	}
}
