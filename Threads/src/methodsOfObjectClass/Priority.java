package methodsOfObjectClass;

/* setPriority();
 * Decides which thread which run first and which will run later, its like a request main
 * to the thread schedular where there is no assurity that it will be processed up to 
 * The Minimun thread priority is 1
 * maximum is 10
 * normal is 5
 * 
 * getPriority();
 * returns current priority of thread
 * 
 */
public class Priority extends Thread {

	String name;
	Priority(String n){
		this.name = n;
	}
	public void run() {
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		Priority a1 = new Priority("abc");
		Priority a2 = new Priority("xyz");
		System.out.println(a1.getPriority());
		System.out.println(a2.getPriority());
		a1.setPriority(7);
		a2.setPriority(8);
		a1.setName("add");
		a2.setName("sub");		
		System.out.println(a1.getPriority());
		System.out.println(a2.getPriority());
		System.out.println(a1.getName());
		System.out.println(a2.getName());
		a1.start();
		a2.start();
		
	}
}
