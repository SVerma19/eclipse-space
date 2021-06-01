package hw8;

import java.util.ArrayList;
import java.util.List;

public class TestHarness {
	
	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<>();
		
		Cat cat1 = new Cat("Snowball");
		Cat cat2 = new Cat("Furry");
		Dog dog1 = new Dog("Rufus");
		Dog dog2 = new Dog("Marmaduke");
		beardedDragon dragon1 = new beardedDragon("Cliff");
		beardedDragon dragon2 = new beardedDragon("Zolan");
		
		animals.add(cat1);
		animals.add(cat2);
		animals.add(dog1);
		animals.add(dog2);
		animals.add(dragon1);
		animals.add(dragon2);
		
		for (Animal s : animals)
			s.makeSound();
		
	}

}
