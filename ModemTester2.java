package chapters24HR;

public class ModemTester2 {
	public static void main (String[] args) {
		CableModem2 crash = new CableModem2();
		DslModem2 davis = new DslModem2();
		crash.speed = 500000;
		davis.speed = 400000;
		System.out.println("Trying the cable modem:");
		crash.displaySpeed();
		crash.connect();
		crash.disconnect();
		System.out.println("Trying the DSL modem:");
		davis.displaySpeed();
		davis.connect();
		davis.disconnect();
	}
}