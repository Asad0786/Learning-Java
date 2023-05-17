package methodsOfObjectClass;

//wait()
//notify()
//notifyall()
public class NotifyAndWait extends Thread {
	int total = 0;

	@Override
	public synchronized void run() { // synchronized
		for (int i = 0; i < 1000; i++)
			total = total + i;
		notify();
	}

	public static void main(String[] args) {
		NotifyAndWait nw = new NotifyAndWait();
		nw.start();
		synchronized (nw) {
			try {
				nw.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(nw.total);
	}
}
