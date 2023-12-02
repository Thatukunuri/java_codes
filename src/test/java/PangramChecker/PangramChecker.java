package PangramChecker;

import java.util.Scanner;

public class PangramChecker {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a sentence to check if it's a pangram:");
	        String input = sc.nextLine();

	        boolean isPangram = checkIfPangram(input);

	        if (isPangram) {
	            System.out.println("The given sentence is a pangram.");
	        } else {
	            System.out.println("The given sentence is not a pangram.");
	        }

	        sc.close();
	    }

	    private static boolean checkIfPangram(String input) {
	        boolean[] alphabetPresent = new boolean[26];

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if ('A' <= ch && ch <= 'Z') {
	                alphabetPresent[ch - 'A'] = true;
	            } else if ('a' <= ch && ch <= 'z') {
	                alphabetPresent[ch - 'a'] = true;
	            }
	        }
	        for (boolean isPresent : alphabetPresent) {
	            if (!isPresent) {
	                return false;
	            }
	        }

	        return true;

	}

}
