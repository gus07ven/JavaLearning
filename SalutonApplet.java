package chapters24HR;

import java.awt.*;

public class SalutonApplet extends javax.swing.JApplet {
	String greeting;
	
	public void init() {
		greeting = "Saluton mondo!";
	}
	
	public void paint(Graphics screen) {
		Graphics2D screen2D = (Graphics2D) screen;
		screen2D.drawString(greeting, 50, 50);
	}
}
