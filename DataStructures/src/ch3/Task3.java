package ch3;

import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args) {
		// Prompting user
        System.out.println("Input text here: ");
        
        // Creating scanner for user input
        Scanner scanner = new Scanner(System.in);
        String str;
        str = scanner.nextLine();
        
        // Reversing string with created method
        String reversedIn = Reverse(str);
        System.out.println("\n" + "Reversed text: " + "\n" + reversedIn);

	}

	public static String Reverse(String str) {
		// If the string has no value, the reverse is the same
		if (str.equals("")) {
			return str;
		} else { 
			str = str.charAt(str.length() - 1) + Reverse(str.substring(0, str.length() - 1));
		} return str;
	}
}
