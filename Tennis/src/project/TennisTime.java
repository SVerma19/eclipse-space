package project;

public class TennisTime {
	
	Court court;
	Player player;
	
	public TennisTime() {
		
		court = new Court();
		player = new Player();
		
	}

	public void setName(String name) {
		
		player.setName(name);
		
	}
	
	public void setLevel(String level) {
		
		player.setLevel(level);
		
	}
	
	public void setType(String type) {
		
		court.setCourtType(type);
		
	}
	
	public void setNumber(int num) {
		
		court.setCourtNumber(num);
		
	}
	
	/*
	public void playGame() {
	
	}
	*/
	
	public void printStatus() {
	
		player.playerPrint();
		court.courtPrint();
		
	}

	
}