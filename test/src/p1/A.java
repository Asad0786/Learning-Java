package p1;

public class A {

	public A() {
		this(100);
		System.out.println("hii");
		// A a2 = new A();

	}

	A(int x) {
		//this();
	}
	public static void test2() {
	System.out.println("1");
	}
	public static void test2(int x) {
		System.out.println(x);
	}

	public static void main(String[] args) {
		A a1 = new A();
		A.test2();
		A.test2(100);
	}

	public char[] getX() {
		// TODO Auto-generated method stub
		return null;
	}

}
