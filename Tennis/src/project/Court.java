package project;

public class Court {
	
	String type;
	Object num;
	
	public void printCourts() {
		
		System.out.println("Courts: ");
		System.out.println("grass");
		System.out.println("clay");
		System.out.println("hardTru");
		System.out.println(" ");

		System.out.println("Court numbers range from 1-10");
		System.out.println(" ");
		
	}

	public void setCourtType(String type) {
		
		if ((type == "grass") || (type == "clay") || (type == "hardTru")) {
			this.type = type;
		} else {
			this.type = "not a valid court type";
		}
	
	}
	
	public void setCourtNumber(int num) {
		
		if ((num >= 0) && (num <= 10)) {
			this.num = num;
		} else {
			this.num = "not a valid court number";
		}
	}

	public void courtPrint() {
		
		System.out.println("the type of court is: " + type);
		System.out.println(" ");
		System.out.println("the court number is: " + num);
		
	}
}
