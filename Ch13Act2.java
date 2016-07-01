package chapters24HR;

import java.awt.*;
import javax.swing.*;

public class Ch13Act2 extends JFrame {
	public Ch13Act2() {
		super("First Frame");
		setSize(350, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		SecondFrame two = new SecondFrame();
		setVisible(true);
		two.setVisible(true);
	}

	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
			);
		} catch (Exception exc) {
			// ignore error
		}
	}
	
	public static void main(String[] arguments) {
		Ch13Act2 victory = new Ch13Act2();
	}
}

class SecondFrame extends JFrame {
	SecondFrame() {
		super("Second Frame");
		setSize(150, 80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
