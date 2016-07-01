package chapters24HR;

import java.awt.*;

import javax.swing.*; 

public class Ch14Act1 extends JFrame {
	
	//Set up first row
	JPanel panel1 = new JPanel();
	JButton panicButton;
	JButton dontPanicButton;
	
	//Set up second row
	JPanel panel2 = new JPanel();
	JButton blameButton;
	JButton mediaButton;
	JButton saveButton;
	
	public Ch14Act1() {
		super("Ch14Act1");
		setLookAndFeel();
		setSize(348, 128);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout mainLayout = new GridLayout(2, 3);
		setLayout(mainLayout);
		
		// Panic and Don't panic in one layout manager
		FlowLayout layout1 = new FlowLayout();
		setLayout(layout1);
		panicButton = new JButton("Panic");
		dontPanicButton = new JButton("Don't Panic");
		panel1.add(panicButton);
		panel1.add(dontPanicButton);
		add(panel1);
		setVisible(true);
		
		// Adding other buttons here
		FlowLayout layout2 = new FlowLayout();
		setLayout(layout2);
		blameButton = new JButton("Blame");
		mediaButton = new JButton("Media");
		saveButton = new JButton("Save");
		panel2.add(blameButton);
		panel2.add(mediaButton);
		panel2.add(saveButton);
		add(panel2);
	}

	private void setLookAndFeel() {
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			// ignore error
		}
	}
	public static void main(String[] args) {
		Ch14Act1 maximusTheMerciful = new Ch14Act1();
	}
}

