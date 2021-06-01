package finalExam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeAverage {
	
	static Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		
	public static void add(String stuID, int javaGrade, int mathGrade) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(javaGrade);
		list.add(mathGrade);
		
		map.put(stuID, list);
	}
		
	public static int find(String stuID) {
		List<Integer> values = map.get(stuID);

		int sum = 0;
		for (int i = 0; i < values.size(); i++) {
		    sum += values.get(i);
		}

	    int average = (sum / 2);
	    return average;
	}
	
	
	public static void main(String[] args) {
		add("Stu001", 90, 80);
		add("Stu002", 80, 70);
		add("Stu003", 90, 80);
		add("Stu004", 82, 98);
		
		int avg1 = find("Stu001");
		int avg2 = find("Stu002");
		
		System.out.println("The first average grade is: " + avg1);
		System.out.println("The second average grade is: " + avg2);
		
	}
}

