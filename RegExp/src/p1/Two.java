package p1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Two {
	/* passed in compile
	 *  /s  -  returns whitespace index 
	 *  /S  -  returns every other's index than whitespace index
	 *  /d	-  returns only digits, same as [0-9]
	 *  /D  -  returns everything other than digits, same as [^0-9]
	 *  /w  -  returns lowercase, uppercase, digits only others are discarded
	 *  /W  -  returns everything including space other than lowercase, uppercase, digits 
	 */
	public static void main(String[] args) {
		int count =0;
		String name;
		Scanner s = new Scanner(System.in);
		name = s.nextLine();
		Pattern p = Pattern.compile("[^a-zA-z]");
		Matcher m = p.matcher(name);
		while(m.find()) {
			System.out.println(m.start()+"...."+m.group());
			count++;
		}
		if(count !=0 || name.length()<3) {
			System.out.println("Error");
		}
		else {
			System.out.println("works");
		}
	}
}
