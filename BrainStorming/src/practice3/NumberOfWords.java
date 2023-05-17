package practice3;

import java.util.Scanner;

public class NumberOfWords {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = scan.nextLine();
		scan.close();
		String words[] = s.split("\\s+");
		System.out.println(words.length);
	}

}
