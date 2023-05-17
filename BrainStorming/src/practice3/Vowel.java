package practice3;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scan.nextLine().toLowerCase();
		scan.close();
		System.out.println("Number of vowels in " + input + " are : " +countVowel(input));
	}

	private static int countVowel(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u')
				count++;
		}
		return count;
	}

}
