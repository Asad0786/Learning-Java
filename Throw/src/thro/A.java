package thro;
import java.io.FileReader;

public class A {

	public static void main(String[] args)  {
		A a1 = new A();
		try {
			
			a1.test();
		}catch(Exception e) {
			System.out.println("Use of throes keywors");
		}
		/*
		 * UNHANDLED EXCEPTION a1.test();
		 */
	}

	/*
	 * Throws keyword is applied on method if any exception occurs in method then
	 * exception will be passed to the calling statement
	 */
	public void test() throws Exception {
		FileReader fr = new FileReader("D:\\useless\\test.txt");
	}
}
