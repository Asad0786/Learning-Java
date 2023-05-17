import java.util.*;
import java.io.*;

class ttete {
	
	public static String Dashes(String stt) {
		String str = "";
		for (int i = 0; i < stt.length() - 1; i++) {
			if (stt.charAt(i) == '2' || stt.charAt(i) == '4' || stt.charAt(i) == '6' || stt.charAt(i) == '8') {
				if (stt.charAt(i + 1) == '2' || stt.charAt(i + 1) == '4' || stt.charAt(i + 1) == '6'
						|| stt.charAt(i + 1) == '8') {
					if (i == 0) {
						str = str + stt.charAt(i) + "*" + stt.charAt(i + 1);
					} else {
						str = str + "*" + stt.charAt(i + 1);
					}
				} else {
					if (i == 0) {
						str = str + stt.charAt(i) + stt.charAt(i + 1);
					} else {
						str = str + stt.charAt(i + 1);
					}
				}
			} else if (stt.charAt(i) == '1' || stt.charAt(i) == '3' || stt.charAt(i) == '5' || stt.charAt(i) == '7'
					|| stt.charAt(i) == '9') {
				if (stt.charAt(i + 1) == '1' || stt.charAt(i + 1) == '3' || stt.charAt(i + 1) == '5'
						|| stt.charAt(i + 1) == '7' || stt.charAt(i + 1) == '9') {
					if (i == 0) {
						str = str + stt.charAt(i) + "-" + stt.charAt(i + 1);
					} else {
						str = str +"-" +stt.charAt(i + 1);
					}
				} else {
					if (i == 0) {
						str = str + stt.charAt(i) + stt.charAt(i + 1);
					} else {
						str = str + stt.charAt(i + 1);
					}
				}

			}
			else if(stt.charAt(i)=='0') {
				if (i == 0) {
					str = str + stt.charAt(i) + stt.charAt(i + 1);
				} else {
					str = str + stt.charAt(i + 1);
				}
			}

		}
		return str;
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a string:");
		String stt = s.nextLine();
		s.close();
		System.out.println(ttete.Dashes(stt));
		
	}

}