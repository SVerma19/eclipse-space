package milestone2;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HeuristicProcessor implements IHeuristicProcessor { 

	// string for positive words
	private static String[] positiveWords = { "Good", "yes", "like", "great", "amazing", "smart", "outstanding",
			"awesome", "decent", "excellent", "enjoyable", "nice", "fabulous", "radiant", "super", "happy", "terrific",
			"believe", "perfect", "quality", "terrific", "enjoy", "unique", "safe", "safe" };

	// declare positivelist
	private List<String> positiveList = new ArrayList<>();

	// string for negative words
	private static String[] negativeWords = { "bad", "no", "dislike", "danger", "dumb", "unintelligent", "evil", "ugly",
			"sad", "terrible", "crash", "dead", "lousy", "mean", "negative", "not good", "gross", "reject", "quit",
			"painful", "injury", "hurt" };

	// declare negativelist
	private List<String> negativeList = new ArrayList<>();

	// constructor
	public HeuristicProcessor() {
		positiveList = Arrays.asList(positiveWords);
		negativeList = Arrays.asList(negativeWords);
	}

	/*
	 * words not repeated in the list this amount of words repeated that value % is
	 * richness
	 */
	public float getVocabRichness(List<String> words) {
		// declare variables
		int uniqueWords = 0;
		int wordCount = 0;

		ArrayList<String> articleNonRepeatingWords = new ArrayList<String>();

		// make the whole article into one string
		String joined = String.join(" ", words);
		String[] individualwords = joined.split(" ");

		for (int i = 0; i < individualwords.length; i++) {
			String word = individualwords[i];
			word = word.toLowerCase();

			// if the list doesn't contain this word yet, add it to the list
			if (!articleNonRepeatingWords.contains(word)) {
				articleNonRepeatingWords.add(word);
				// increment for every new word
				uniqueWords++;
			}
			// increment for every word it loops through
			wordCount++;

		}
		// divide total words by number of unique words to get a percentage for the
		// article richness
		float richness = (((float) uniqueWords / wordCount) * 100);
		return richness;
	}

	/*
	 * Returns Frequencies as a map of <Times repeated, Word>
	 * 
	 */
	public Map<Integer, String> getFrequencies(List<String> words) {
		Map<String, Integer> frequencies = new TreeMap<String, Integer>();
//		List<String> words = new ArrayList<String>();
		Map<Integer, String> mostRepeated = new TreeMap<>(Collections.reverseOrder());

		Integer repeated = 0;

		// Puts words in frequencies along with the actual frequency.
		for (int i = 0; i < words.size(); i++) {
			String next = words.get(i);
			if (!frequencies.containsKey(next)) {
				frequencies.put(next, 1);
			} else {
				frequencies.put(next, frequencies.get(next) + 1);
			}
		}

		// Iterates through map to add the values (Just adds 1 value from smallest to
		// largest, deletes all the words that have the same size and stays with 1)
		for (Map.Entry<String, Integer> entry : frequencies.entrySet()) {

			if (entry.getValue() >= repeated) {
				mostRepeated.put(entry.getValue(), entry.getKey());
			}

		}

		return mostRepeated;
	}

	/*
	 * this method determines whether the articles have a positive or negative
	 * attitude by comparing the different words each article contains
	 */
	public void getAttitude(List<String> words) {

		String currentLine = null;
		String[] data = null;
		int numWords = 0;

		// create count variables for positive and negative words
		int positivecount = 0;
		int negativecount = 0;

		// split the list by spaces so each word is its own element in the list
		for (int i = 0; i < words.size(); i++) {
			currentLine = words.get(i);
			data = currentLine.split(" ");

			// loop through data
			// if the positive word list contains the current word, increment positivecount,
			// otherwise increment negativecount
			for (int j = 0; j < data.length; j++) {
				if (positiveList.contains(data[j])) {
					positivecount++;
				} else if (negativeList.contains(data[j])) {
					negativecount++;

				}
			}

		}
		// look at values of positivecount and negative count to determine if the
		// article has a positive or negative value
		if (positivecount > negativecount) {
			System.out.println("This article expresses a POSITIVE attitude");
		} else if (positivecount < negativecount) {
			System.out.println("Thie article expresses a NEGATIVE attitude");
		}
	}
}
