package T2;

/*
 * Threads concept using Runnable interface
 * with this concept we have to use thread's start method in order 
 * to start the run() of runnable as runnable have only one method 
 * which is run() and in order to execute run() in thread way we have to call 
 * thread, for which I have to create a thread's object as well and have to pass the 
 * class's object to thread and then execute start() using thread's method.
 *  
 * 
 * We can never say which thread will execute first i.e every time we run a 
 * thread it'll not follow same order as before it is impossible to guess 
 * which thread will work for how long with every execution thread's execution
 * will vary.
 * 
 * 
 * The drawback is if two thread operates on same module at same moment, suppose
 * first thread's execution isn't finished yet but thread2 starts executing on 
 * second same module so whatever work is done by the thread one will be corrupted
 * by thread 2 as thread 1 work isn't finished yet.
 * 
 * 
 * Example: Two people trying to book same ticket/seat, suppose first person's ticket
 * is in process of booking, and second person's thread will be executed and suppose 
 * the thread executed and finished i.e ticket booked for 2nd thread , since thread 1
 * was in mid of booking now ticket for thread 1 is booked too, now the ticket is booked
 * for both which is not possible/ right and hence it will lead to data corruption.
 * 
 */
public class ThreadPartTwo implements Runnable{
	String name;

	ThreadPartTwo(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0;i<250;i++)
			System.out.println(this.name + i);
		
	}
	public static void main(String[] args) {
		ThreadPartTwo Tpt = new ThreadPartTwo("Value of i from thread: ");
		Thread t1 = new Thread(Tpt);		
		t1.start();		
		for(int i=0;i<250;i++)
			System.out.println("Value of i from main: "+ i );
		
	}
	
	

}
