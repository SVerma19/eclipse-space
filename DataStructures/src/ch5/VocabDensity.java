package ch5;

import java.io.*;
import java.util.*; 
import ch5.ArrayCollection;

public class VocabDensity {
	public static void main(String[] args) throws IOException {
	final int CAPACITY = 1000; 
	String fname = args[0]; 
	String word;
	int numWords = 0;
	int uniqWords; 
	double density;
	
	CollectionInterface<String> words = new ArrayCollection<String>();

	FileReader fin = new FileReader("shakespeare.txt");
	Scanner wordsIn = new Scanner(fin); 
	wordsIn.useDelimiter("[^a-zA-Z']+");
	
	while (wordsIn.hasNext()) {
		word = wordsIn.next(); 
		word = word.toLowerCase(); 
		
		if (!words.contains(word)) {
			words.add(word); 
			numWords++;
		}
	}
			
	density = (double)numWords/words.size(); 
	System.out.println("Analyzed file " + "shakespeare.txt"); 
	System.out.println("\n\tTotal words: " + numWords); 
	if (words.size() == CAPACITY) {
		System.out.println("\tUnique words: at least " + words.size()); 
	} else {
		System.out.println("\tUnique words: " + words.size()); 
		System.out.printf("\n\tVocabulary density: %.2f", density);
	}

	}
}

