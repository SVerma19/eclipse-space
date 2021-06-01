package milestone2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javafx.util.Pair;

public interface IArticleParser {


	/* Prints results
	 * 
	 */
	public void printResults();
	
	/*obtain the richness of the article that is returned in the heuristics processor 
	 * 
	 */
	public float getRichness(List<String> words);

	/*use article reporter to print the richness of the article
	 * 
	 */
	public void printRichness(float value);
	
	/*obtain the frequency of each word in the article that is returned in a method in the heuristic processor 
	 * 
	 */
	public Map<Integer, String> getFrequency();
	
	/*use article reporter to print the frequency 
	 * 
	 */
	public void printFrequency(Map<Integer, String> frequencyvalue);
	/*print the attitude of the article 
	 * 
	 */
	public void printAttitude(List<String> words);
		
	}


