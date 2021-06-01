package bird;

import java.util.ArrayList;
import java.util.List;

public class TestHarness {

	public static void main(String[] args) {
		FlyingBird pigeon = new FlyingBird();
		NonFlyingBird penguin = new NonFlyingBird();
		
		pigeon.fly();
		penguin.fly();
		
		
		List<Bird> birds = new ArrayList<>();
		
		System.out.println("-----");
		
		Bird b = new NonFlyingBird();
		Bird b2 = new FlyingBird();
		
		birds.add(b);
		birds.add(b2);
		
		for (Bird birdies : birds)
			birdies.fly();	
		
	}
	
}
