package learn_thread;

/*
 * A program to confirm that thread executes in irregular and unpredicted way 
 */
public class ThirdThread {
	public static void main(String[] args) {
		SecondThread s1 = new SecondThread("A");
		SecondThread s2 = new SecondThread("sad");
		SecondThread s3 = new SecondThread("Ali");
		s1.start();
		s2.start();
		s3.start();
	}

}
