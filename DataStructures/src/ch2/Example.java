package ch2;

public class Example {

	public static void main(String[] args) {
		
		String[] elements = new String[10];
		System.out.println(elements.length);
		
		elements[0] = "Hello world";
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
		
	}
	
}
