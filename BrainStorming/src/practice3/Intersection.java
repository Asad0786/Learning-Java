package practice3;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;

public class Intersection {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList <Integer> ll = new LinkedList<Integer>();
		Hashtable<Integer, Integer> ht= new Hashtable<>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of first array");
		int firstArray[] = new int[scan.nextInt()];
		for (int i = 0; i < firstArray.length; i++) {
			System.out.print("Enter " + (i + 1) + "element");
			firstArray[i] = scan.nextInt();
		}
		System.out.print("Enter the size of second array");
		int secondArray[] = new int[scan.nextInt()];
		for (int i = 0; i < secondArray.length; i++) {
			System.out.print("Enter " + i + 1 + "element");
			secondArray[i] = scan.nextInt();
		}
		scan.close();
		int k =0;
		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < secondArray.length; j++) {
				if (secondArray[j] == firstArray[i]) {
					al.add(secondArray[j]);  //using array collection
					ll.add(secondArray[j]);	 //using linkedlist collection
					ht.put(k,secondArray[j]); // using hashtable
					k++;
				}
			}
		}
		System.out.println("Common elements are: ");
		for (int i : al) {

			System.out.print(i + "  ");
		}
		System.out.println("\n"+ht);
	}

}
