package list_collection;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		x.add(100);
		x.add(200);
		x.add(68);

		System.out.println(x);

		x.add(1, 200); // adding element using index
		System.out.println(x);
		y.addAll(0, x);
		x.addAll(x);
		x.remove(0); // passing index
		// x.remove(Integer.valueOf(200)); // passing
		x.add(1, 200);
		x.add(2, 200);
		x.add(0, 200);
		y.add(459);
		x.addAll(y);
		System.out.println(x);
		x.removeAll(y);
		System.out.println(x);
		System.out.println(y);
		ArrayList<Integer> z = (ArrayList<Integer>) y.clone();
		System.out.println(z);
		System.out.println(z.contains(100));
		System.out.println(z.equals(y));

	}

}
