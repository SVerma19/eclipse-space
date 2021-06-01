package Final;

public class IceCream {

	String flavor;
	int scoops; 
	int numScoops;
	
	public void addTopping(String topping) {
		
	}
	
	public void setScoops(int numScoops) {
		this.numScoops = numScoops;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public void displayTreat() {
		System.out.println("The flavor of your ice cream is: " + flavor);
		System.out.println("The number of scoops you requested is: " + numScoops);
	}
	
	
}
