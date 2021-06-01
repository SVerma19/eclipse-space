package project2;

import java.io.*;
import java.util.Scanner;

public class BSTAutoCorrect {

    public static void main(String[] args) throws Exception {
        System.out.println("\nLOADING BINARY SEARCH TREE ALGORITHM");
        
        BSTAutoCorrect dict = new BSTAutoCorrect();
        dict.loadDictionary("/Users/Sachin/eclipse-workspace/Algorithms/src/project2/Dictionary.txt");
       
		Scanner userScanner = new Scanner(System.in); 
		
		while (true) {
			System.out.println("\nEnter a word: ");
			String userInput = userScanner.next();
			String word = userInput;
        
			String[] suggestions = dict.checkWord(word, 100);
			System.out.println("\nSuggestions: ");
			for (String suggestion: suggestions) {
            System.out.println(suggestion);
			}
        
			if (word.equalsIgnoreCase("Quit")) {
				System.out.println("Goodbye.\n");   
				break;
			}
			if (word.equalsIgnoreCase("Start")) {
				System.out.println(" ");
				System.out.println("************* NEW GAME **************");
				HangmanGame.main(null); 
				break;
			}
		}
    }
    
    private BSTree tree = null;
    
    public boolean loadDictionary(String strFileName) {
        // open the file for reading
        File fpFile = new File(strFileName);
        if ((!fpFile.exists()) || (!fpFile.canRead()) || (fpFile.isDirectory()))
            return false;
        tree = new BSTree();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
           boolean successful = false;
        try {
            // open the file for reading
            fileReader = new FileReader(strFileName);
            // get the buffered reader "helper" class
            bufferedReader = new BufferedReader(fileReader);
            // get a line from the text file
            String strNextLine;    
            String[] arrWords = null;
            while ((strNextLine = bufferedReader.readLine()) != null){
                arrWords = strNextLine.split(" ");
                for (int i = 0; i < arrWords.length; i++)
                    // add the word to the dictionary
                    if (arrWords[i] != null && arrWords[i].length() > 0)
                        tree.insert(arrWords[i]);
            }
        }
        catch(Exception e){
            successful = false;
        }
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (Exception doNothing) {
                }
            }
            bufferedReader = null;
            fileReader = null;
        }
        return successful;
    }
    
    public boolean saveDictionary(String strFileName){
        try {
            // make sure if a file is there, delete it first
            File fpFile = new File(strFileName);
            if (fpFile.exists())
                fpFile.delete();

            // open a new file for writing
            FileWriter fwFile = new FileWriter(strFileName);
            BufferedWriter bwFile = new BufferedWriter(fwFile);
            // do an in order traversal (alphabetic order)
            inorderRecurse(bwFile, tree.root());
            // close the file
            bwFile.close();
        }
        catch(Exception e) { // catch exceptions

            return false;
        }
        return true;
    }
    

    private void inorderRecurse(BufferedWriter bwFile, BSTNode node){
        if (node == null)
            return;
        inorderRecurse(bwFile, node.getLeftChild());
        try{
            bwFile.write(node.getKey().toString());
            bwFile.newLine();
            bwFile.flush();
        }
        catch (Exception e){
            return;
        }
        inorderRecurse(bwFile, node.getRightChild());
    }

    public void add(String word){
        if (word == null)
            return;
        if (tree == null){
            tree = new BSTree();
        }
        tree.insert(word);
    }
    
    public void remove(String word){
        if (word == null || tree == null)
            return;
        tree.remove(word);
    }
    
    public String[] checkWord(String word, int limit){
        if (word == null)
            return null;
        if (tree == null)
            return new String[0];
        return tree.getBestMatches(word, limit);
    }
}
