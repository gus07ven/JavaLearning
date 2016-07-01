package chapters24HR;

import java.awt.*;

import javax.swing.*;

public class Panels1 extends JFrame {
	public Panels1() {
		super ("Mariano");
		setLookAndFeel();
		setSize(525, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel topRow = new JPanel();
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		add(topRow);
		setVisible(true);
	}

	private void setLookAndFeel() {
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLooksAndFeel");
		} catch (Exception exc) {
			// ignore error
		}
	}

	public static void main(String[] arguments) {
		Panels1 drago = new Panels1();
	}
}

