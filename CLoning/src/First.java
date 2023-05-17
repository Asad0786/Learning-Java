/*
 * The process of creating replica of an object by 
 * copyong the content of one object into another object
 */
public class First implements Cloneable {
	
	int x;
	public static void main(String[] args) {
		First a1 = new First();
		a1.x= 30;
		try {
			First a2 = (First)a1.clone();
			System.out.println(a1);
			System.out.println(a1.x);
			System.out.println(a2);	
			System.out.println(a2.x);
		}catch(CloneNotSupportedException e) {
			System.out.println(e);			
		}
	}
}
