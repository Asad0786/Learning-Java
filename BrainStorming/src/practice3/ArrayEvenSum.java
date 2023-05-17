package practice3;

public class ArrayEvenSum {
	public static void main(String[] args) {
		int array[] = { 1, 4, 5, 7, 9, 2, 4, 6, 8, 10, 2, 3, 3, 3,88 };
		int count = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0)
				count = count + array[i];

		}
		System.out.println("Sum of even number is: " + count);
	}
}
