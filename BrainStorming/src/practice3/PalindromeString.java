package practice3;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = scan.nextLine();
		scan.close();
		System.out.println(checkPalindrome(s.toLowerCase()));
	}

	private static String checkPalindrome(String s) {

		for (int i = 0, j = s.length() - 1; i < j; i++, j--)
			if (s.charAt(i) != s.charAt(j)) 
				return "Not a palindrome string";
		
		return "palindrome string";
	
}
}
