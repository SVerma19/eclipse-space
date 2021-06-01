package homework6;


public class TestHarness {

public static void main(String[] args) {
	
	Superheroes hero = new Superheroes();
	
	hero.putEntryInMap("Thor", "Mjolnir");
	hero.putEntryInMap("Iron Man", "Suit");
	hero.putEntryInMap("Captain America", "Shield");
	hero.putEntryInMap("Hawkeye", "Bow & Arrow");
	hero.putEntryInMap("Loki", "Staff");
	
	hero.getValueFromMap("Hawkeye");
	hero.getValueFromMap("Thor");
	System.out.println(" ");
	
	System.out.println("All the map entries");
	System.out.println("******************************");
	hero.displayAllMapEntries();
	System.out.println(" ");
	
	hero.removeEntryFromMap("Iron Map");
	
	System.out.println("All the map entries");
	System.out.println("******************************");
	hero.displayAllMapEntries();
	System.out.println(" ");
	
	hero.addToSet("Green Lantern");
	hero.addToSet("Iron Man");
	hero.addToSet("Captain America");
	hero.addToSet("Wonder Woman");
	
	System.out.println("The set");
	System.out.println("******************************");
	hero.printSet();
	System.out.println(" ");
	
	hero.removeFromSet("Captain America");
	
	System.out.println("The set");
	System.out.println("******************************");
	hero.printSet();
	System.out.println(" ");
}

}