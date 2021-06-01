package lab2;

import java.util.ArrayList;
import java.util.List;

public class TestHarness {

	public static void main(String[] args) {
		
		List<Superhero> superList = new ArrayList<>();
		
		SuperheroFactory superhero = new SuperheroFactory();
		
		Superhero Ironman = superhero.getSuperhero(SuperheroTypes.TECH);
		Superhero Thor = superhero.getSuperhero(SuperheroTypes.GOD);
		Superhero Spiderman = superhero.getSuperhero(SuperheroTypes.POWERS);
		
		superList.add(Ironman);
		superList.add(Thor);
		superList.add(Spiderman);
		
		for (Superhero s : superList)
			s.useSuperPower();
		
	}
}
