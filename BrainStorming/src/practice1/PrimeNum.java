package practice1;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		scan.close();
		boolean isPrimeNum = PrimeNum.isPrime(num);
		if (isPrimeNum) {
			System.out.println(num + " is not a prime number.");
		} else {
			System.out.println(num + " is a prime number.");
		}
	}

	public static boolean isPrime(int num) {
		boolean flag = false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		return flag;

	}
}
