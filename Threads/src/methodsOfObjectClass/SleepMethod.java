package methodsOfObjectClass;

public class SleepMethod extends Thread {
		
	public static void main(String[] args) {
		SleepMethod s = new SleepMethod();
		System.out.println(s.getState());
		s.start();
		try {
			//Thread.sleep(1);
		}catch(Exception e) {
			
		}
		System.out.println(s.getState());
		System.out.println(s.getState());

	}

	public void run() {
		System.out.println("Done");
	}
}
