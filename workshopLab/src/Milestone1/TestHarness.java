package Milestone1;

import java.util.List;


public class TestHarness {

	//Deleted
	public static void Article(String filename) {
		ReaderInterface reader = new ArticleReader();

		List<String> data = reader.readFile(filename);


		ProcessorInterface articleProcessor = new ArticleProcessor();

		articleProcessor.printNumberOfLines(data);
		articleProcessor.getRichVocab(data);
		articleProcessor.comparePositiveNegative(data);
		articleProcessor.findWordInArticle(data, "just");
		System.out.println("-----");
		//articleProcessor.filterStopWords(data);
		//articleProcessor.topWordCount(data);



	}

	 public static void main(String[] args){
		 ///Calls the article reader 3 times separately so the information stored in "data" does not get override 
		// System.out.println("                                               A R T I C L E 1:");
		 Article("Article1.txt");
		 //System.out.println("                                               A R T I C L E 2:");
		 Article("Article2.txt");
		 //System.out.println("                                               A R T I C L E 3:");
		 Article("Article3.txt");
		 
	}
}
