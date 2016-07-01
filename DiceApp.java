package chapters24HR;

import java.util.Random;

public class DiceApp {
	public static void main(String[] args) { 
		
		// Math to draw random result
		int result = (int) + Math.floor(Math.random() * 6 + 1);
		System.out.println("The dice randomly landed in: " + result);
		
		// Concept of cup
		int numDice = 3;
		int cup = numDice * result;
		System.out.println("The result of rolling " + numDice + " dice in a cup is: " + cup);
		
		// Loaded dice activated when I decide
		int myPick = 4;
		boolean cheatOn = false;
		if (cheatOn == true) { 
			System.out.println("I cheated this time and landed in my pick:  " + myPick);
		} else {
			System.out.println("I didn't cheat and the outcome is: " + result);
		}
	}
}
