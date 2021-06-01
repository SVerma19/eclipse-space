package milestone2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArticleReporter implements IArticleReporter {

	/*
	 * call this method in the parser to print the richness of the article
	 */
	public void printArticleRichness(float value) {
		System.out.println("Richness of current article: " + value + "%");

	}

	/*
	 * call this method in the parser in order to print the frequencies
	 */
	public void printFrequency(Map<Integer, String> mostRepeated) {
		//use iterator to iterate through map in order to get corresponding key value pairs
		System.out.println("Frequency of each word: ");
		Iterator<Integer> iterator = mostRepeated.keySet().iterator();
		while (iterator.hasNext()) {
			Integer value = iterator.next();
			String key = mostRepeated.get(value);
			System.out.println(value + ":" + key);

		}

	}
}