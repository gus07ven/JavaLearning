package chapters24HR;

public class ModemTester {
	public static void main (String[] args) {
		CableModem surfBoard = new CableModem();
		DslModem gateway = new DslModem();
		AcousticModem santana = new AcousticModem();
		surfBoard.speed = 500000;
		gateway.speed = 400000;
		santana.speed = 300;
		System.out.println("Trying the cable modem:");
		surfBoard.displaySpeed();
		surfBoard.connect();
		System.out.println("Trying the DSL modem:");
		gateway.displaySpeed();
		gateway.connect();
		System.out.println("Trying the acoustic modem:");
		santana.displaySpeed();
		santana.connect();
	}
}
