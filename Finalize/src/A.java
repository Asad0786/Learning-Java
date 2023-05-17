public class A {
	/* 
	 * method present inside object class, Garbage collection's logic is 
	 * present in finalize method.
	 * 
	 */
	
	@Override
	public void finalize() {
		System.out.println("removed");
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1 = null;
		System.gc();  //calls finalze() method 
	}
}
