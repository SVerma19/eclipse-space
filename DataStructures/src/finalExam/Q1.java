package finalExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1 {
	
	public static String arraySort(int arr[], int num) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			list.add(element);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		return "The " + num + "-th largest element in the array is: " + list.get(num - 1);
	}
	
}

