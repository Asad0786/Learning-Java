package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
	public static void main(String[] args) {
		/*
		 * if I dont want a-z i.e not a-z then use ^a-z, ^ act as not
		 * 
		 * for limit in numbers [0-9{2}] the 2 here puts limit group of numbers
		 */
		
		Pattern p = Pattern.compile("[0-9]{2}"); // for individual - [abcd] for group[a-z],[0-9]
		Matcher m = p.matcher("abc#*&@123A78hadsf4234324sdjkas666xxyyz");
		while(m.find())
		{
			System.out.println(m.start() + "--" + m.group());
		}
	}
}

