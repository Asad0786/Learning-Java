package p1;

import java.util.StringTokenizer;

public class First {
	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("Asad");
		System.out.println(s.countTokens());
		System.out.println(s.hasMoreElements());
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
		
	}
}