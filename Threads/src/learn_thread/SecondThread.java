package learn_thread;

public class SecondThread extends Thread {
	
	String s;
	SecondThread(String s){
		this.s = s;
		
	}
	@Override
	public void run() {
		for (int i = 1; i <=100; i++)
			System.out.println(this.s);
	}

}
