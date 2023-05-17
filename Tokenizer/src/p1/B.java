package p1;

import java.util.regex.Pattern;

/*
 * split a given string and return token without string class and tokenizer just using regex
 * using split method only we can acheive this
 */

public class B {
	public static void main(String[] args) {

		Pattern p = Pattern.compile(" ");
		String[] m = p.split("this is the teSt for speech synthesis");
		for(String s : m) {
			System.out.println(s);
		//	System.out.println("sa");
		}
	}
}
