package milestone2;

import javafx.util.Pair;
import java.io.*;
import java.util.*;

public class ArticleParser implements IArticleParser {
	


	private IHeuristicProcessor heuristics;
	private IArticleReporter reporter;
	

	

	// Variables
	String longestWord; // Holds longest word
	List<String> words = new ArrayList<String>(); // Holds the word list
	List<String> lines = new ArrayList<String>(); // Holds the lines that come from the Article Reader
	Map<String, Integer> frequencies = new TreeMap<String, Integer>(); // Has the frequencies of the words as a map
																		// <Word, Number of times>
	Map<Integer, String> mostRepeated = new TreeMap<>(Collections.reverseOrder()); // Holds the most repeated words
																					// <Number of times, Word>
	List<String> stopWords = new ArrayList<>(); // Holds a list of stop words parsed from filterStopWords()
	List<String> stopWordsCapitalize = new ArrayList<>();

	// Initializes the class with the argument line (passed from ArticleReader
	// through TestHarness)
	ArticleParser(List<String> line) {
		lines = line; // makes the lines list in this class equal to the argument passed.
		heuristics = new HeuristicProcessor();
		reporter = new ArticleReporter();
	}

	// Returns number of lines
	private Integer numberOfLines() {
		return lines.size();
	}

	// Returns longest word and size in a Pair<Lenght, Word>
	private Pair<Integer, String> longestWordAndSize() {
		int wordLength = 0;
		int longest = 0;

		String content = "";

		// Loops through words to find longest
		for (int i = 0; i < words.size(); i++) {
			String currentWord = "";

			currentWord = words.get(i);
			wordLength = currentWord.length();
			// Checks if current word is the longest
			if (wordLength > longest) {
				longest = wordLength; // Make longest (Integer) equal to the length of the word in this iteration if
										// it's longer
				this.longestWord = currentWord;
			}

		}

		return new Pair<>(longest, longestWord);
	}

	
	// Returns wordcount and adds the words to the array
	private Integer wordCount() {
		int wordCount = 0;

		String content = "";

		// Gets each line
		for (int i = 0; i < lines.size(); i++) {
			content = lines.get(i);
			// Splits lines
			String[] contentDivided = content.split(" ");
			// Appends words to words list and adds to the wordCount
			for (int j = 0; j < contentDivided.length; j++) {
				words.add(contentDivided[j]);
				wordCount++;
			}
		}

		filterStopWords();
		return wordCount;

	}

	// Prints results
	public void printResults() {
		System.out.println("Word Count: " + wordCount());
		System.out.println("Number of lines: " + numberOfLines());
		System.out.println("Longest word lenght: " + longestWordAndSize().getKey());
		System.out.println("Longest word: " + longestWordAndSize().getValue());
		

//		for (Map.Entry<Integer, String> entry : getFrequencies().entrySet()) {
//			System.out.println("The word: " + entry.getValue() + " is repeated: " + entry.getKey() + " times.");
		}
//}

	// Filters and removes stopwords.
	private void filterStopWords() {

		// ADD Path to file stopwords.txt
		File file = new File("/Users/kristenoliger/eclipse-workspace/LAB/articles/stopwords.txt");
		BufferedReader br;
		// Reads each line and appends it to list stopWords
		try {
			br = new BufferedReader(new FileReader(file));
			String st;
			while ((st = br.readLine()) != null) {
				stopWords.add(st);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Removes stopwords.
		words.removeAll(stopWords);

		for (String stopword : stopWords) {
			stopWordsCapitalize.add(stopword);
		}
		words.removeAll(stopWordsCapitalize);
	}

	/*obtain the richness of the article that is returned in the heuristics processor 
	 * 
	 */
	public float getRichness(List<String> words) {
		float rich = heuristics.getVocabRichness(words);
		return rich;
	}

	/*use article reporter to print the richness of the article
	 * 
	 */
	public void printRichness(float value) {
		reporter.printArticleRichness(value);

	}
	
	/*obtain the frequency of each word in the article that is returned in a method in the heuristic processor 
	 * 
	 */
	public Map<Integer, String> getFrequency() {
		//only using this because it loads the words into List<String> words 
		wordCount();
		Map<Integer, String> frequency = heuristics.getFrequencies(words);
		return frequency;
	}
	
	/*use article reporter to print the frequency 
	 * 
	 */
	public void printFrequency(Map<Integer, String> frequencyvalue) {
		reporter.printFrequency(frequencyvalue);
	}
	
	/*print the attitude of the article 
	 * 
	 */
	public void printAttitude(List<String> words) {
		heuristics.getAttitude(words);
		
	}
	

}
