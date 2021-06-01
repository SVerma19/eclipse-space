package Final;

import java.io.*; 
import java.util.*;
import java.util.ArrayList; 

public class MyIceCream extends IceCream implements iCream {

	Toppings t = new Toppings();	
	
	public void addTopping(String topping) {
		t.addToppings(topping);
	}
	
	public void setScoops(int numScoops) {
		super.setScoops(numScoops);
	}
	
	public void setFlavor(String flavor) {
		super.setFlavor(flavor);
	}
	
	public void displayTreat() {
		System.out.println("The flavor of your ice cream is: " + flavor);
		System.out.println(" ");
		
		System.out.println("The number of scoops you requested is: " + numScoops);
		System.out.println(" ");
		
		t.displayToppings();
	}
	
	
		
}
