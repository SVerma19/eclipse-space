package homework;

public class testHarness {

	public static void main(String[] args) {

		Heater heater = new Heater(0, 50.0);
		
		// getting the initial temperature with an accessor and printing it
		heater.getTemp();
		heater.printTemp();
		
		// changes the value of the increment and prints it
		heater.setInc(5.0);
		heater.printInc();
		
		// raising the temperature by 5 degrees with a mutator and printing it
		heater.Warmer();
		heater.printTemp();
		
		// decreasing the temperature by 5 degrees with a mutator and printing it
		heater.Cooler();
		heater.printTemp();
		
		System.out.println("*****************************************");
		System.out.println(" ");
		
		Heater heater2 = new Heater(10.0, 70.0);
		
		// getting the initial temperature with an accessor and printing it
		heater2.getTemp();
		heater2.printTemp();
		
		// changes the value of the increment and prints it
		heater2.setInc(15.0);
		heater2.printInc();
		
		// raising the temperature by 15 degrees with a mutator and printing it
		heater2.Warmer();
		heater2.printTemp();
		
		// decreasing the temperature by 15 degrees with a mutator and printing it
		heater2.Cooler();
		heater2.printTemp();
		

	}
	
	
}
