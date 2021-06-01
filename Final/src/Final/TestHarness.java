package Final;

import java.util.ArrayList;
import java.util.List;

public class TestHarness {

	public static void main(String[] args) {
		
		MyIceCream myIce = new MyIceCream();

		myIce.setScoops(4);
		myIce.setFlavor("strawberry");
		myIce.addTopping("sprinkles");
		myIce.addTopping("fudge");
		myIce.addTopping("oreos");
		
		myIce.displayTreat();

	}


}