package lab2;

import java.util.ArrayList;
import java.util.List;

public class SuperheroFactory {
	
 	public Superhero getSuperhero(SuperheroTypes tech) {

        Superhero hero  = null;
        if (tech.equals(SuperheroTypes.TECH)) {
        	hero = new Ironman();
        } if (tech.equals(SuperheroTypes.POWERS)) {
        	hero = new Spiderman();
        } else if (tech.equals(SuperheroTypes.GOD)) {
        	hero = new Thor();
        }
        return hero;
     }
 	
}