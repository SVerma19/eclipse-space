package project;

public class TestHarness {

	public static void main(String[] args) {

		// Printing basic information for the player
		System.out.println("Options...");
		System.out.println(" ");
		
		
		// creating court and player objects
		Court courts = new Court(); 
		courts.printCourts();

		Player players = new Player(); 
		players.printLevels();
		
		
		// Player 1
		System.out.println("*******************************************************");
		
		TennisTime tennisTime = new TennisTime();
		
		tennisTime.setName("Ameer");
		tennisTime.setLevel("Expert");
		tennisTime.setType("grass");
		tennisTime.setNumber(24);
		tennisTime.printStatus();
		System.out.println("*******************************************************");
		System.out.println(" ");
		
		
		// Player 2
		System.out.println("*******************************************************");
				
		TennisTime tennisTime2 = new TennisTime();
				
		tennisTime2.setName("Dom");
		tennisTime2.setLevel("Beginner");
		tennisTime2.setType("asphault");
		tennisTime2.setNumber(4);
		tennisTime2.printStatus();
		System.out.println("*******************************************************");
		System.out.println(" ");
				
		
		// Player 3
		System.out.println("*******************************************************");
				
		TennisTime tennisTime3 = new TennisTime();
				
		tennisTime3.setName("Kevin");
		tennisTime3.setLevel("Professional");
		tennisTime3.setType("hardTru");
		tennisTime3.setNumber(10);
		tennisTime3.printStatus();
		System.out.println("*******************************************************");
		System.out.println(" ");
		
	}

}
