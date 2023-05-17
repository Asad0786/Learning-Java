package thro;

import java.util.Scanner;

/*
 * throw - it helps us to create customized exception as per the requirement
 * of the developer, example:
 *  
 */
public class ThrowDemo {
	public static void main(String[] args) {
		int bal = 200;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Amount:");
		int x = s.nextInt();
		if(bal>=x) {
			System.out.println("Collect");
		}
		else {
			try {
			throw new InFunds();	// throwing explicit exception
			} catch (InFunds e) {
				System.out.println(e);
				System.out.println("Insufficident balance");
			}finally{
				s.close();
			}
		}

	}

}
