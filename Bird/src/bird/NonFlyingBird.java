package bird;

public class NonFlyingBird extends Bird implements iBird {

	public void fly() {
		System.out.println("Error - you're trying to make a non flying bird fly... ");
	}
	
}
