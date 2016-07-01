package chapters24HR;

import java.awt.*;

import javax.swing.*;

public class Text1 extends JFrame {
	public Text1() {
		super("Text1");
		setLookAndFeel();
		setSize(525, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextArea comments = new JTextArea("Test to see if this JText stuff\n" 
								+ " works as adversited.", 8, 40);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		add(comments);
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
		Text1 rocky = new Text1();
	}
}
