package chapters24HR;

import java.io.*;

public class ConsoleExample {
	private static void usingBufferedReader() {
		System.out.println("Enter a number please: ");
		try {
			BufferedReader bufferRead = new BufferedReader(
					new InputStreamReader(System.in));
			String inputString = bufferRead.readLine();
			int inputToNum = Integer.parseInt(inputString);
			int numTimesTwo = inputToNum * 2;
			System.out.println("Output: " + numTimesTwo);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		usingBufferedReader();
	}
}
