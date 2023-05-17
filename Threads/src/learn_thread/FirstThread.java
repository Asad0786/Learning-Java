
package learn_thread;

/*
 * Using threads we can never say which thread will execute first i.e
 * every time we run a thread it'll not follow same order as before 
 * it is impossible to guess which thread will work for how long with every
 * execution thread's execution will vary.
 * 
 * 
 * The drawback is if two thread operates on same module at same moment that 
 * will be corrupted, supposefirst thread's execution isn't finished yet but
 * thread2 starts executing on second same module so whatever work is done by 
 * the thread one will be corrupted by thread 2 as thread 1 work isn't finished yet.
 * 
 * 
 * Example: Two people trying to book same ticket/seat, suppose first person's ticket
 * is in process of booking, and second person's thread will be executed and suppose 
 * the thread executed and finished i.e ticket booked for 2nd thread , since thread 1
 * was in mid of booking now ticket for thread 1 is booked too, now the ticket is booked
 * for both which is not possible/ right and hence it will lead to data corruption.
 * 
 */
public class FirstThread extends Thread {

	String name;

	FirstThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 500; i++)
			System.out.println("Thread's value: " + this.name);
	}

	public static void main(String[] args) {
		FirstThread f1 = new FirstThread("Asad");
		FirstThread f2 = new FirstThread("Ali");
		f1.start();
		f2.start();
		for (int j = 1; j <= 500; j++) {
		//	System.out.println("Main value: " + j);
		}

	}
}
