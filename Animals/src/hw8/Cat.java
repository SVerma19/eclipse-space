package hw8;

public class Cat extends Animal {
	
	private String name;
	
	Cat(String name) {
		super(name);
	}	
	
	public void makeSound() {
		System.out.println("Meow");
	}

}
