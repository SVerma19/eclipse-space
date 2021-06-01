package ch8;

import java.util.HashMap;
import java.util.Map;

public class MapSum {
    HashMap<String, Integer> map;
    
    public MapSum() {
        map = new HashMap<>();
    }
    
    public void insert(int key, String val) {
        map.put(val, key);
    }
    
    public int sum(String prefix) {
        int sum = 0;
       
        for (String key : map.keySet()) {
            if (key.startsWith(prefix)) {
                sum += map.get(key);
            }
        }
        return sum;
    }
    

	public static void main (String[] args) {
		MapSum obj = new MapSum();
		
		obj.insert(37, "Bergeron");
		obj.insert(63, "Marchand");
		obj.insert(88, "Pastrnak");
		
		int sum = obj.sum("Bergeron");
		System.out.println("The sum is: " + sum);
		
	}
}

