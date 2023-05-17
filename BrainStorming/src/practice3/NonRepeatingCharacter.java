package practice3;

import java.util.Scanner;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = scan.next();
		char st[] = new char[s.length()];
		boolean flag = true;
		int z=0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				x: if(s.charAt(i)==s.charAt(j)) {
					System.out.println("hey");
					flag = false;
					break x;
				}
				else {
					y: for(int c =0;c<z;c++) {
						if(st[c]==s.charAt(i)) {
							System.out.println("h2a");
							flag = false;
							break y;
						}
						else
						{
							flag= true;
						}
					}
					
				}
					
			}
			if(flag) {
				st[z] = s.charAt(i		 );
				z++;
				System.out.println("s");
			}

		}
		for (char c : st) {
			
			System.out.println(c);
		}

	}
}
