package practice3;

import java.util.Scanner;

public class BinaryConversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		String binary=""; 
		scan.close();
		
		while(num !=0 ) {
			int rem = num%2;
			num = num/2;
			binary= rem+binary  ;
		}
		
		System.out.println(binary);
	}

}
