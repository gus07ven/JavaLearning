package chapters24HR;

import java.awt.*;

import javax.swing.*;

public class Combo1 extends JFrame {
		public Combo1() {
			super("Combo1");
			setLookAndFeel();
			setSize(525, 280);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JComboBox<String> profession = new JComboBox<String>();
			FlowLayout flo = new FlowLayout();
			profession.addItem("Butcher");
			profession.addItem("Baker");
			profession.addItem("Candlestick maker");
			profession.addItem("Fletcher");
			profession.addItem("Fighter");
			profession.addItem("Technical writer");
			profession.setEditable(true);
			setLayout(flo);
			add(profession);
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
			Combo1 xcalibur = new Combo1();
		}
	}	

