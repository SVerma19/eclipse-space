package hw8;

public class Dog extends Animal {
	
	private String name;
	
	Dog(String name) {
		super(name);
	}
	
	public void makeSound() {
		System.out.println("BARK!");
	}

}
