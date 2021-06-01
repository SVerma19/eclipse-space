package Final;

import java.io.*; 
import java.util.*;
import java.util.ArrayList; 

public class Toppings {
	
	ArrayList<String> yummyStuff = new ArrayList<String>();
	
	public void addToppings(String topping) {
		yummyStuff.add(topping);
	}

	public void getTopping(int index) {
		System.out.println(yummyStuff.get(index));
	}

	public void displayToppings() {
		System.out.println("The toppings you requested are: ");
		
		for (int i = 0; i < yummyStuff.size(); i++) {
			System.out.println(yummyStuff.get(i));
	}

}
}