package chapters24HR;

import java.awt.*;
import javax.swing.*;


public class Ch13Act1 extends JFrame {
		public Ch13Act1() {
			super();
			setLookAndFeel();
			setSize(350, 100);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JLabel saluton1 = new JLabel("Saluton Mondo!");
			FlowLayout flo = new FlowLayout();
			setLayout(flo);
			add(saluton1);
			setVisible(true);
		}

		private void setLookAndFeel() {
			try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
				);
			} catch (Exception exc) {
				// ignore error
			}
		}

		public static void main(String[] arguments) {
			Ch13Act1 hola = new Ch13Act1();
		}
	}

