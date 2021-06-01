package milestone2;

import java.util.Iterator;
import java.util.Map;

public interface IArticleReporter {
	
	

	/*
	 * call this method in the parser to print the richness of the article
	 */
	public void printArticleRichness(float value);
	
	/*
	 * call this method in the parser in order to print the frequencies
	 */
	public void printFrequency(Map<Integer, String> mostRepeated);

	
	

}
