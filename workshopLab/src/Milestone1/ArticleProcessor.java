package Milestone1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArticleProcessor implements ProcessorInterface{

	HeuristicsInterface hp = new HeuristicsProcessor();

	private static final String SPACE = " ";
	// removes all the words listed within ""
	private static String[] stopWords = { "i", "me", "my", "myself", "we", "our", "ours", "ourselves", "you", "your",
			"yours", "yourself", "yourselves", "he", "him", "his", "himself", "she", "her", "hers", "herself", "it",
			"its", "itself", "they", "them", "their", "theirs", "themselves", "what", "which", "who", "whom", "this",
			"that", "these", "those", "am", "is", "are", "was", "were", "be", "been", "being", "have", "has", "had",
			"having", "do", "does", "did", "doing", "a", "an", "the", "and", "but", "if", "or", "because", "as",
			"until", "while", "of", "at", "by", "for", "with", "about", "against", "between", "into", "through",
			"during", "before", "after", "above", "below", "to", "from", "up", "down", "in", "out", "on", "off", "over",
			"under", "again", "further", "then", "once", "here", "there", "when", "where", "why", "how", "all", "any",
			"both", "each", "few", "more", "most", "other", "some", "such", "no", "nor", "not", "only", "own", "same",
			"so", "than", "too", "very", "s", "t", "can", "will", "just", "don", "should", "now" };
	private List<String> stopWordList = new ArrayList<>();

	public ArticleProcessor() {
		stopWordList = Arrays.asList(stopWords);
	}



	public void printNumberOfLines(List<String> articleList) {
		// each article has one line
		System.out.println("number of lines in my article: " + articleList.size());

	}

	private float wordCount(String[] words) {
		float wordCount = words.length;
		return wordCount;
	}

	public void printWords(List<String> data) {

		/// separates each word using " " and prints them
		String currentLine = null;
		String[] words;
		/// number of lines
		int longestWordCount = 0;
		String longestWord = "";
		for (int i = 0; i < data.size(); i++) {
			currentLine = data.get(i);
			words = currentLine.split(" ");
			
        ///checks words length and prints the word with the longest length
			for (int j = 0; j < words.length; j++) {
				System.out.println("current word: " + words[j]);

				if (words[j].length() > longestWordCount) {
					longestWordCount = words[j].length();
					longestWord = words[j];

				}

			}
			System.out.println("number of current word: " + words.length);
			System.out.println("Longest word: " + longestWord);

		}

	}
    ///Removes all the stopWords from the article
	public void filterStopWords(List<String> data) {
		String currentLine = null;
		String[] words;

		for (int i = 0; i < data.size(); i++) {
			currentLine = data.get(i);
			words = currentLine.split(SPACE);

			String currentRow = removeStopWordsFromLine(words);

			// replace the "i'th" element of the list with the updated line
			data.set(i, currentRow);

		}
	}

	private String removeStopWordsFromLine(String[] words) {
         ///Removes the stopwords
		StringBuffer buff = new StringBuffer();
		for (int j = 0; j < words.length; j++) {
			if (!stopWordList.contains(words[j])) {
				buff.append(words[j]);
				buff.append(SPACE);
			}
		}
		return buff.toString();
	}

	/**
	 *
	 * Returns a map with the words and the count.
	 *
	 */
	public HashMap<String, Integer> getData(List<String> data){
		String currentLine = null;
		HashMap<String, Integer> hMap = new HashMap<>();
		String[] words = returnWords(data);
		//checks how many times a word is repeated in the article
		for (int i = 0; i < data.size(); i++) {
			for (int i1 = 0; i1 < words.length; i1++) {
				if (hMap.containsKey(words[i1])) {
					int count = hMap.get(words[i1]);
					hMap.put(words[i1], count + 1);
				} else {
					hMap.put(words[i1], 1);
				}
			}
		}

		return hMap;
	}

	public String[] returnWords(List<String> data){
		String currentLine = null;
		String[] words = new String[0];
		//checks how many times a word is repeated in the article
		for (int i = 0; i < data.size(); i++) {
			currentLine = data.get(i);
			words = currentLine.split(" ");
		}

		return words;
	}

	public List<String> returnWordsAsList(List<String> data){
		String currentLine = null;
		List<String> words = new ArrayList<>();

		//Appends words to words list and adds to the wordCount
		for (int j = 0; j < data.size(); j++) {
			currentLine = data.get(j);
			String[] contentDivided = currentLine.split(" ");
			for (String word : contentDivided){
				words.add(word);
			}

		}

		return words;
	}

	/**
	 *
	 * Return the words with the line found.
	 *
	 */
	public Map<String, Integer> returnWordsAsMapWithLineNumber(List<String> data){
		String currentLine = null;
		Integer lineCount = 0;
		Map<String, Integer> words = new HashMap();

		//Appends words to words list and adds to the wordCount
		for (int j = 0; j < data.size(); j++) {
			currentLine = data.get(j);
			String[] contentDivided = currentLine.split(" ");
			for(String word : contentDivided){
				words.put(word, lineCount);
			}
			lineCount += 1;
		}

		return words;
	}


	public void topWordCount(List<String> data){
		HashMap<String, Integer> hMap = getData(data);
			///Sorts the repeated words in descending order
			///ranks words by frequency
			Object[] a = hMap.entrySet().toArray();
			Arrays.sort(a, new Comparator<Object>() {
				@SuppressWarnings("unchecked")
				public int compare(Object o1, Object o2) {
					return ((Map.Entry<String, Integer>) o2).getValue()
							.compareTo(((Map.Entry<String, Integer>) o1).getValue());
				}
			});
			for (Object e : a) {
				System.out.println(((HashMap.Entry<String, Integer>) e).getKey() + " : "
						+ ((Map.Entry<String, Integer>) e).getValue());
			}
			//
	}

	public void getRichVocab(List<String> data){
		HashMap<String, Integer> hMap = getData(data);
		float words = wordCount(returnWords(data));

		float richVocab = hp.getRichVocab(hMap, words);
		System.out.println("Get Rich Vocab: " + richVocab);

	}

	/**
	 *
	 * Instance of the Heuristics processor.
	 *
	 */
	public void comparePositiveNegative(List<String> data){
		HeuristicsInterface hp = new HeuristicsProcessor();

		Boolean result = hp.comparePositiveNegative(data);

		if (result.equals(true)){
			System.out.println("The article is positive");
		}else{
			System.out.println("The article is negative");
		}
	}

	/**
	 *
	 * Finds word in article by passing the data itself and the search word. To report refer to reportWordInArticle.
	 *
	 */
	public void findWordInArticle(List<String> data, String searchWord){


		List<String> matches = new ArrayList<>();
		int i = 0;
		for (String da : data){
			if (da.contains(searchWord)){
				matches.add(searchWord);
				i++;
			}
		}

		System.out.println("Word: " + searchWord + ", Repeated: " + i);
	}


}

	