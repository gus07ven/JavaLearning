package chapters24HR;

import java.awt.*;

import javax.swing.*;

public class Ch13Tester extends JFrame {
	public Ch13Tester() { 
		super("Ch13Tester");
		setLookAndFeel();
		setSize(525, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JCheckBox jumboSize = new JCheckBox("Jumbo Size", true);
		JCheckBox frogLegs = new JCheckBox("Frog Leg Grande", true);
		JCheckBox fishTacos = new JCheckBox("Fish Taco Platter", false);
		JCheckBox emuNuggets = new JCheckBox("Emu Nuggets", false);
		FlowLayout flo = new FlowLayout();
		ButtonGroup meals = new ButtonGroup();
		meals.add(frogLegs);
		meals.add(fishTacos);
		meals.add(emuNuggets);
		setLayout(flo);
		add(jumboSize);
		add(frogLegs);
		add(fishTacos);
		add(emuNuggets);
		setVisible(true);		
	}
	
private void setLookAndFeel() {
	try {
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLooksAndFeel");
	} catch (Exception exc) {
		// ignore error
	}
}

public static void main(String[] arguments) {
	Ch13Tester sweet = new Ch13Tester();
}
}

