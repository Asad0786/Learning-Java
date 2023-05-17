package p1;

import java.util.Scanner;

public class PhoneValidator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number: ");
		String number = s.next();
		String regex = "[6-9][0-9]{9}";
		if(number.matches(regex)) {
			System.out.println("Acceptd");
		}
		else {
			System.out.println("Rejected");
		}
		s.close();
	}

}
