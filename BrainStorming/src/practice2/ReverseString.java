package practice2;

public class ReverseString {
	public static void main(String[] args) {
		String str = "hello man";
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			s = s + str.substring(i+1) + str.charAt(i);
			System.out.println(s);
		}
		System.out.println(s);
	}
}
