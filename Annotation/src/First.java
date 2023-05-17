/*
 * Annotations are used to communicate with compiler
 * 	java 1.5 introduction
 * 	@Override
 *  @suppressedWarnings - suppresses warning 
 *  @deprecated
 */
public class First {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int i =0; 	//supressed
		int j =10;  //warning 
	}
}
