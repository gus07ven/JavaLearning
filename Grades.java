package chapters24HR;

public class Grades {
	public static void main (String [] args) {
		// create variable grade
		int grade = 80;
		
		// display message depending on grade
		if ( grade >= 90 ) {
			System.out.println("Congratulations! You got an A!");
		} else if ( grade >= 80 ) {
			System.out.println("Way to go you got a B!");
			
		} else if ( grade >= 70 ) {
			System.out.println("Not bad! C's are still good!");
		} else if ( grade >= 60 ) {
			System.out.println("You are almost there, keep trying!");
		} else if ( grade >= 50 ) {
			System.out.println("Come see me after class.");
		}
		switch (grade){
			case 90:
				System.out.print("Congratulations! You got an A with switch!");
				break; 
			case 80:
				System.out.print("Way to go you got a B with switch!");
				break; 
			case 70:
				System.out.print("Not bad! C's are still good with switch!");
				break; 
			case 60:
				System.out.print("You are almost there, keep trying with switch!");
				break; 
			case 50:
				System.out.print("Come see me after class with switch.");
				break; 
		}
	}
}
