
//Write a program that takes an array of integers 
//as input and returns the second highest number in the array.

package practice3;

import java.util.Scanner;

public class HighestElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = scan.nextInt();
		int array[] = new int[size];
		System.out.println("\n");
		for(int i=0;i<size;i++) {
			System.out.print("Enter "+(i+1)+" element: ");
			array[i]= scan.nextInt();
		}
		scan.close();
		array = sortedDesArray(array);
		System.out.println("The second highest element in array is: "+ array[1]);
		
	}

	private static int[] sortedDesArray(int[] array) {
		//int[] dup = new int[array.length];
		for(int j=0;j<array.length-1;j++) {
		for(int i=0;i<array.length-1-j;i++) {
			if(array[i]<array[i+1]) {
				array[i+1]= array[i]+array[i+1];
				array[i]= array[i+1]- array[i];
				array[i+1] = array[i+1]- array[i];
			}
		}
	}
		return array;
	}

}
