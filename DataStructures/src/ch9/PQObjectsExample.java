package ch9;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQObjectsExample {
	public static void main(String args[]) {
		// Redefining the custom ordering using employee's name
		Comparator<Employee> nameSorter = Comparator.comparing(Employee::getName);		
		PriorityQueue<Employee> namepq = new PriorityQueue<>(nameSorter);
		
		PriorityQueue<Employee> pq = new PriorityQueue<>();
		
		pq.add(new Employee(1l, "AAA", LocalDate.now()));
		pq.add(new Employee(4l, "CCC", LocalDate.now()));
		pq.add(new Employee(5l, "BBB", LocalDate.now()));
		pq.add(new Employee(2l, "FFF", LocalDate.now()));
		pq.add(new Employee(3l, "DDD", LocalDate.now()));
		pq.add(new Employee(6l, "EEE", LocalDate.now()));
		
		while(true) {
			Employee e = pq.poll();
			System.out.println(e);
			if (e == null) {
				break;
			}
		}
		
	}
}
