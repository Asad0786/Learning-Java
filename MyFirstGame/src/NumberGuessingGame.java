import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		int guess;
		int random = (int) (Math.random()*100 )+1;
		System.out.println(random);
		boolean flag = true;

		System.out.println("Guess the number");

		try {
		while (flag) {
			guess = input.nextInt();
			count++;
			if (guess > random) {
				System.out.println("Try a lower number");
			} else if (guess < random) {
				System.out.println("Try a higher number");
			} else {
				System.out.println("Congratulations you won game in: " + count + " moves ");
				System.out.println("Wanna play again? yes or no");
				String cont = input.next();
				if (cont.equalsIgnoreCase("yes")) {
					random = (int) (Math.random() * 100) + 1;
					System.out.println(random);
					count = 0;
					//System.out.flush();
					System.out.print("Guess a number between 1 and 100: ");
				} else {
					flag = false;
					input.close();
					System.out.println("Thanks for playing");
				}
			}

		}
		
	}catch(Exception e) {
		System.out.println("Wrong input:    " + e);
	}

}
}
