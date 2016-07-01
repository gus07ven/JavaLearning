package chapters24HR;

public class AcousticModem extends Modem {
	String method = "Acoustic modem connection";
	
	public void connect() {
		System.out.println("Connecting to the Internet...");
		System.out.println("Using a " + method);
	}
}
