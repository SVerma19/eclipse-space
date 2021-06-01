package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HangmanGame {

	public static void main(String[] args) throws Exception {	
		/****************** IMPORT DICTIONARY AND INITAL ARRAYS ******************/
		File dictionary = new File("/Users/Sachin/eclipse-workspace/Algorithms/src/project2/Dictionary.txt");
		
		List<String> lettersList = Arrays.asList("a" ,"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
												 "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
												 "y", "z");
		
		ArrayList<String> letters1 = new ArrayList<String>();
		letters1.addAll(lettersList);
		
		ArrayList<String> letters2 = new ArrayList<String>();
	
		
		/****************** READ THE ARRAY / SCANNERS ******************/
		// To scan dictionary
		Scanner dictionaryScanner  = new Scanner(dictionary); 
		// For user input
		Scanner inputOne = new Scanner(System.in); 
		Scanner inputTwo = new Scanner(System.in); 
		Scanner inputThree = new Scanner(System.in);
		Scanner userInput = new Scanner(System.in);
		 
		
		/****************** SCAN THROUGH DICTIONARY ******************/
		ArrayList<String> words = new ArrayList<>();
		while (dictionaryScanner.hasNext()) {
			words.add(dictionaryScanner.nextLine());
		}
		
		/*
		String[] wordsArray = null;
		int t = 0;
		while (dictionaryScanner.hasNextInt()) {
				wordsArray[t++] = dictionaryScanner.next();
		}
	    */
		
		
		/****************** AUTO-CORRECT INSTANCES ******************/
		DecreaseAutoCorrect binaryCorrect = new DecreaseAutoCorrect();
		BruteForceAutoCorrect bruteForceCorrect = new BruteForceAutoCorrect();
		BSTAutoCorrect bstCorrect = new BSTAutoCorrect();
		
		
		/****************** AUTO-CORRECT INSTANCES ******************/
		bstCorrect.add("Sachin");
		bstCorrect.add("Verma");
		bstCorrect.remove("Sachin");
		
		
		/****************** COMPUTER OR PlAYER MODE / INITIALIZE ANSWERS ******************/
	    //Prompting user
		System.out.println("Welcome To Hangman!");
		System.out.println("Enter 'Computer' to Play in Computer Mode (Random Word)");
		System.out.println("Enter 'Player' to Play in Player Mode (Choose Word)");
		String firstInput = inputOne.next();

		// Setting keyword
		String keyWord = null;
		
		while (keyWord == null) {
			if (firstInput.equalsIgnoreCase("Computer")) {
				System.out.println("\nCOMPUTER MODE");
				keyWord = words.get((int)(Math.random() * words.size()));
			} else if (firstInput.equalsIgnoreCase("Player")) {
				System.out.println("\nPLAYER MODE");
			
				System.out.println("\nEnter the word you like to use from the dictionary: ");
				String secondInput = inputTwo.next();
			
				if (words.contains(secondInput)) {
					System.out.println("\nThe word you are using: " + secondInput);
					keyWord = secondInput;
				} else {
					System.out.println("\nWord not found in dictionary. Input words to check if they are in dictionary.");
					System.out.println("Type 'Quit' to exit.");
					System.out.println("Type 'Start' to start game.");
					
					System.out.println("\nEnter 'Decrease' to use Decrease-By-A-Constant-Factor Search Algorithm. Will provide few suggestions.");
					System.out.println("Enter 'Brute' to use Brute Force Search Algorithm. Will provide a list of suggestions.");
					System.out.println("Enter 'Binary' to use Binary Search Tree Algorithm. Will provide a list of suggestions.");
					String thirdInput = inputThree.next();
					
					if (thirdInput.equalsIgnoreCase("Decrease")) {
						binaryCorrect.main(null);
						break;
					} else if (thirdInput.equalsIgnoreCase("Brute")) {
						bruteForceCorrect.main(null);
						break;
					} else if (thirdInput.equalsIgnoreCase("Binary")) {
						bstCorrect.main(null);
						break;
					} else if (thirdInput.equalsIgnoreCase("Quit")) {
						System.out.println("Thanks for playing!");
						System.exit(0);
					} else {
						System.out.println("Not a search method.");
						break;
					}
				}
			} else {
				System.out.println("Not a valid game mode.");
				break;
			}
		}

		// Breaking up word and putting each letter into an array
		char[] letters = keyWord.toCharArray(); 
		// Records user answers
		char[] userAnswers = new char[letters.length]; 
		// Initialize user answers as "?" to avoid empty space
		for (int i = 0; i < letters.length; i++) { 
			userAnswers[i] = '?'; 
		}
		
		
		/****************** OPENING MENU *****************/
		System.out.println("\n**************************");
		System.out.println("Enter 'About' to display information about the game.");
		System.out.println("Enter 'Restart' to start a new game.");
		System.out.println("Enter 'Quit' to exit the game.");
		
		
		/****************** START GAME ******************/
		boolean finished = false;
		int lives = 6;
		
		while (finished == false) {
			System.out.println("**************************" + "\n\n");

			// Get input from user
			System.out.println("Enter a letter: ");
			String userLetter = userInput.next();
			
			
			/****************** ABOUT, RESTART, QUIT ******************/
			// Quit function
			if (userLetter.equalsIgnoreCase("quit")) {
				System.out.println("Thanks for playing!");
				System.exit(0);
			}
			
			// Restart function
			if (userLetter.equalsIgnoreCase("restart")) {
				System.out.println("Thanks for playing!\n");
				System.out.println("************* NEW GAME **************");
				HangmanGame.main(null);
			}
			
			// About function
			if (userLetter.equalsIgnoreCase("about")) {
				System.out.println("About Menu");
				System.out.println("——————");				
				System.out.println("Computer Mode: The user will have a random word chosen from the dictionary to play hangman with. "
						+ "The user will not know the word until the end.");
				System.out.println("Player Mode: The user will be able to input a word to use. "
						+ "The word has to be from the dictionary, and if it is not, the user will have the option to enter the word (or any other word) and have it auto-corrected. "
						+ "Auto-correct checks the dictionary to see if the word the user entered exists, and is in it. If the word cannot be found, the user will get a list of auto-correct suggestions. "
						+ "Once the user finds a word they want to use, they can quit, restart the game in player mode, and enter the valid word. ");
				System.out.println(" ");
			}
			
			
			/****************** USER INPUT VALIDATION ******************/
			// Checks for valid input from user
			while (userLetter.length() != 1 || Character.isDigit(userLetter.charAt(0))) {
				System.out.println("Enter a Letter: ");
				userLetter = userInput.next();
	
				if (userLetter.equalsIgnoreCase("quit")) {
					System.out.println("Thanks for playing!");
					System.exit(0);
				} 
				if (userLetter.equalsIgnoreCase("restart")) {
					System.out.println("Thanks for playing!\n");
					System.out.println("************* NEW GAME **************");
					HangmanGame.main(null);					
				} 
				if (userLetter.equalsIgnoreCase("about")) {
					System.out.println("About Menu");
					System.out.println("——————");				
					System.out.println("Computer Mode: The user will have a random word chosen from the dictionary to play hangman with. "
							+ "The user will not know the word until the end.");
					System.out.println("Player Mode: The user will be able to input a word to use. "
							+ "The word has to be from the dictionary, and if it is not, the user will have the option to enter the word (or any other word) and have it auto-corrected. "
							+ "Auto-correct checks the dictionary to see if the word the user entered exists, and is in it. If the word cannot be found, the user will get a list of auto-correct suggestions. "
							+ "Once the user finds a word they want to use, they can quit, restart the game in player mode, and enter the valid word. ");
					System.out.println(" ");
				}
			}
			
			for (int i = 0; i < letters2.size(); i++) {
				if (letters2.get(i).contentEquals(userLetter)) {
					System.out.println("Letter already used. Enter again: ");
					userLetter = userInput.next();
					
					if (userLetter.equalsIgnoreCase("quit")) {
						System.out.println("Thanks for playing!");
						System.exit(0);
					} 
					if (userLetter.equalsIgnoreCase("restart")) {
						System.out.println("Thanks for playing!\n");
						System.out.println("************* NEW GAME **************");
						HangmanGame.main(null);						
					} 
					if (userLetter.equalsIgnoreCase("about")) {
						System.out.println("About Menu");
						System.out.println("——————");				
						System.out.println("Computer Mode: The user will have a random word chosen from the dictionary to play hangman with. "
								+ "The user will not know the word until the end.");
						System.out.println("Player Mode: The user will be able to input a word to use. "
								+ "The word has to be from the dictionary, and if it is not, the user will have the option to enter the word (or any other word) and have it auto-corrected. "
								+ "Auto-correct checks the dictionary to see if the word the user entered exists, and is in it. If the word cannot be found, the user will get a list of auto-correct suggestions. "
								+ "Once the user finds a word they want to use, they can quit, restart the game in player mode, and enter the valid word. ");
						System.out.println(" ");
					}
				} 
			}
			
			// Checks if user letter is found in word
			boolean found = false;
			for (int i = 0; i < letters.length; i++) {
				if (userLetter.charAt(0) == letters[i]) {
					userAnswers[i] = letters[i];
					found = true;
				}
			}
			
			
			/****************** USER STATUS ******************/
			// Checks and prints user status
			boolean done = true;
			
			for (int i = 0; i < userAnswers.length; i++) {
				if (userAnswers[i] == '?') {
					System.out.print(" _ ");
					done = false;
				} else {
					System.out.print(" " + userAnswers[i] + " ");
				}
			}
			
			// Checks list of letters to see what user has used and adds / removes them from array lists
			for (int i = 0; i < letters1.size(); i++) {
				if (letters1.get(i).contentEquals(userLetter)) {	
					letters1.remove(i);
					letters2.add(userLetter);
				} 
			}
			
			// Prints array lists of letters
			StringBuilder builder = new StringBuilder();
			for (String value : letters1) {
			    builder.append(value + " ");
			}
			String letters1text = builder.toString();
			System.out.println("\n\n" + "Letters Remaining: " + letters1text);
			
			StringBuilder builder2 = new StringBuilder();
			for (String value2 : letters2) {
			    builder2.append(value2 + " ");
			}
			String letters2text = builder2.toString();
			System.out.println("Letters Used: " + letters2text + "\n");

			// Checks if user letter is not found in word
			if (!found) {
				lives--;
				System.out.println("Wrong Letter!");
			}
			
			System.out.println("Lives Left: " + lives);
			
			DrawHangman(lives);
			
			
			/****************** END GAME ******************/
			Scanner inputFour = new Scanner(System.in);
			
			// Checks if the game is over
			if(done) {
				System.out.println("**************************" + "\n\n");
				System.out.println("Congrats! You Won");
				System.out.println("You guessed the correct word: " + keyWord + "\n");
				System.out.println("Enter 'Quit' to exit or 'Restart' to start a new game: ");
				String fourthInput = inputFour.next();
				
				if (fourthInput.equalsIgnoreCase("quit")) {
					System.out.println("Thanks for playing!");
					System.exit(0);
				}
				if (fourthInput.equalsIgnoreCase("restart")) {
					System.out.println("Thanks for playing!\n");
					System.out.println("************* NEW GAME **************");
					HangmanGame.main(null);
				}
				// finished = true;
			}
			
			if (lives <= 0) {
				System.out.println("**************************" + "\n\n");
				System.out.println("Sorry! You Lost");
				System.out.println("The correct word was: " + keyWord  + "\n");
				System.out.println("Enter 'Quit' to exit or 'Restart' to start a new game.");
				String fourthInput = inputFour.next();
				
				if (fourthInput.equalsIgnoreCase("quit")) {
					System.out.println("Thanks for playing!");
					System.exit(0);
				}
				if (fourthInput.equalsIgnoreCase("restart")) {
					System.out.println("Thanks for playing!\n");
					System.out.println("************* NEW GAME **************");
					HangmanGame.main(null);
				}	
				// finished = true;
			}		
			
		}
		
	}	


	/****************** DRAWS THE TEXT-BASED HANGMAN IMAGE ******************/
	public static void DrawHangman(int l) {
		if (l == 6) {
			System.out.println("|----------");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
		}
		else if (l == 5) {
			System.out.println("|----------");
			System.out.println("|    O");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
		}
		else if (l == 4) {
			System.out.println("|----------");
			System.out.println("|    O");
			System.out.println("|    |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
		}
		else if (l == 3) {
			System.out.println("|----------");
			System.out.println("|    O");
			System.out.println("|   -|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
		}
		else if (l == 2) {
			System.out.println("|----------");
			System.out.println("|    O");
			System.out.println("|   -|-");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
		}
		else if (l == 1) {
			System.out.println("|----------");
			System.out.println("|    O");
			System.out.println("|   —|-");
			System.out.println("|    |");
			System.out.println("|   - ");
			System.out.println("|");
			System.out.println("|");
		}
		else if (l == 0) {
			System.out.println("|----------");
			System.out.println("|    O");
			System.out.println("|   -|-");
			System.out.println("|    |");
			System.out.println("|   - -");
			System.out.println("|");
			System.out.println("|");
		}
		
	}
	
}
