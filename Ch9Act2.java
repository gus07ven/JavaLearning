package chapters24HR;

import java.util.Arrays;

public class Ch9Act2 {
	public static void main (String[] args) {
		int [] multThir = new int [400];
		// Loop through four hundred numbers
		for ( int i = 0; i <= 400 ; i++) {
			multThir[i] = i * 13;
			System.out.print(Arrays.toString(multThir));
		}
	}

}
