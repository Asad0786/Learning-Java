package Sync;

/*
 * in order to fix this problem
 * when two threads are working on common data, the data might
 * get corrupted because of multitasking, to make the thread operate
 * one after another synchronized keyword is used, where the threat 
 * acquire lock and other thread waits till the lock is released by t-1
 */
public class SyncProblem {
	int amount = 0;

	public static void main(String[] args) {
		SyncProblem sp = new SyncProblem();
		sp.acc();
		System.out.println(sp.amount);
	}

	public void acc() {
		Thread t1 = new Thread(new Runnable() { // anonymous class - nameless classes are called anonymous classes

			@Override
			public void run() {
				add();
			}

		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				sub();
			}

		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
			/*
			 * join method makes the work continue from where one thread will leave
			 */
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

	public void add() {		// synchronized keyword puts lock on thread
		for (int i = 0; i < 1000; i++)
			amount = amount + i;
	}

	public void sub() {
		for (int i = 0; i < 1000; i++) 
			amount = amount - i;

	}
}
