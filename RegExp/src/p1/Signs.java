package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Signs {
	/*
	 * 	Quantifiers:
	 *   char* gives number of occurance of that very alphabet or number
	 *   char+ give group of occurance 
	 *   
	 */
	public static void main(String[] args) {
		Pattern p = Pattern.compile("a*");
		Matcher m = p.matcher("aabaaababaaaab");
		while (m.find()) {
			System.out.println(m.start() + "....." + m.group());
		}
	}

}
