package practice1;

public class SumOfFirstHundred {
	
	public static void main(String[] args) {
		int count = SumOfFirstHundred.total();
		System.out.println("Sum is : " + count);
	}

	private static int total() {
		int count = 0;
		for (int i = 1; i <=100; i++) {
			if (i % 2 == 0) {
				count = count + i;
			}
		}
		return count;
	}
	
}
