package project;

public class Player {

	String name;
	String level;
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void printLevels() {
		
		System.out.println("Levels: ");
		System.out.println("beginner");
		System.out.println("intermediate");
		System.out.println("expert");
		System.out.println(" ");
		
	}
	
	public void setLevel(String level) {
		
		if ((level == "beginner") || (level == "intermediate") || (level == "expert")) {
			this.level = level;
		} else {
			this.level = "not a valid level";
		}
		
	}
	
	public void playerPrint() {
		
		System.out.println("your name is: " + name);
		System.out.println(" ");
		System.out.println("the level selected is: " + level); 
		System.out.println(" ");
		
	}
	
}
