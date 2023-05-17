package T2;

import java.util.Scanner;

public class Synch {
	
	
	public static void main(String[] args) {
		System.out.println("Hello");
		b b1 = new b();
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		s.close();
		b1.set(x);
	}
	
}
class b{
	private int x ;
	private void Syso(int x ) {
		System.out.println(x);
	}
	
	public void set(int x) {
		this.x = x;
		Syso(x);
	}
}
