package thro;

public class CrashClass {
	public static void main(String[] args) {
		try {
			throw new ApplicationCrash();
			}catch(ApplicationCrash e) {
				System.out.println("App is crashed.\nApp is restarting.");
			}
	}

}
