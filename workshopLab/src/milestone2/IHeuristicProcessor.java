package milestone2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public interface IHeuristicProcessor {
	
	/*
	 * words not repeated in the list this amount of words repeated that value % is
	 * richness
	 */
	public float getVocabRichness(List<String> words);

	/*
	 * Returns Frequencies as a map of <Times repeated, Word>
	 * 
	 */
	public Map<Integer, String> getFrequencies(List<String> words);
	/*
	 * this method determines whether the articles have a positive or negative
	 * attitude by comparing the different words each article contains
	 */
	public void getAttitude(List<String> words);

}
