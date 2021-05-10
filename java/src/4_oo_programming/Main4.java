package exercise4;

import java.io.*;
import java.util.Scanner;

class PalindromeChecker {
    public String read_word() throws IOException {
	Scanner scanner = new Scanner(System.in);
	System.out.printf("Insert word to check if it's a palindrome: ");
	String word = scanner.nextLine();
	return word;
    }

    public static boolean is_palindrome(String word) {
	if (word.charAt(0) == word.charAt(word.length() - 1)) {
	    word = word.substring(1, word.length() - 1);
	    if (word.length() > 1)
		return is_palindrome(word);
	    else
		return true;
	} else {
	    return false;
	}
    }

    public void display_result(String word, boolean decision) {
	String decision_s = decision ? "is" : "is not";
	System.out.printf("Word '%s' %s a palidrome\n", word, decision_s);
    }
}


public class Main4 {
    public static void main(String[] args) throws IOException {
	PalindromeChecker checker = new PalindromeChecker();
	String word = checker.read_word().toLowerCase();
	boolean decision = checker.is_palindrome(word);
	checker.display_result(word, decision);
    }
}
