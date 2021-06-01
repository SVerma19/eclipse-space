package homework;

public class Heater {

	double temperature = 15.0;
    double min;
    double max;
    double increment = 5.0;
	
    // Heater constructor
    public Heater(double min, double max) {
    	
    	this.min = min; 
    	this.max = max;
        
    }
 
    // turns the temperature up by 5 degrees
    public void Warmer() {

    	temperature = temperature + increment;
    	
    	if (temperature >= max) {
    		temperature = max;
    		System.out.println("The max possible temperature is 100.0 degrees");
    	}
    }

    // turns the temperature down by 5 degrees
    public void Cooler() {

    	temperature = temperature - increment;
    	
    	if (temperature <= min) {
    		temperature = min;
    		System.out.println("The min possible temperature is 55.0 degrees");
    	}

    }
    
    // modifies the value of the increment member
    public void setInc(double value) {
    	
    	increment = value;
    	
    }
    
    // gets the value of the temperature
    public double getTemp() {

        return temperature;

    }
    
    // prints the value of the increment
    public void printInc() {
    	
    	System.out.println("The current increment is: " + increment);
    	System.out.println(" ");
    	
    }
    
    // prints the current temperature of the heater
    public void printTemp() {

        System.out.println("The current temperature is: " + temperature + " degrees");
        System.out.println(" ");

    }
}


  
