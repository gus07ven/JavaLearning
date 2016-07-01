package chapters24HR;

import java.awt.*;

import javax.swing.JApplet;

public class RootApplet extends JApplet {
	int number; 
	
	public void init() {
		number = 225; 
	}
	
	public void paint(Graphics screen) {
		Graphics2D screen2D = (Graphics2D) screen;
		screen2D.drawString("The square toot of " + 
				number +
				" is " +
				Math.sqrt(number), 5, 50);
	}
}
