package milestone2;

import javafx.util.Pair;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestHarness {

	public static void main(String[] args) {

		IArticleReader articleReader = new ArticleReader();
		List<String> data = articleReader.readMe("article1.txt");
		IArticleParser parser = new ArticleParser(data);

		parser.printResults();
		float rich = parser.getRichness(data);
		
		System.out.println("\n******************\n");
		parser.printRichness(rich);
		parser.printAttitude(data);
		Map<Integer, String> frequency = parser.getFrequency();
		parser.printFrequency(frequency);
		
		

		
		



	}

}
