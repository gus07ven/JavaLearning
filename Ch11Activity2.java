package chapters24HR;

public class Ch11Activity2 {
	public static void main (String[] args) {
		        if (args.length > 0) {
		            System.out.println("The original value: "
		                + args[0]);
		            Float num1 = new Float(args[0]);
		            float num2 = num1.floatValue();
		            System.out.println("The float value: " + num2);
		            int num3 = (int)num2;
		            System.out.println("The final value: " + num3);
		        }
		    }
		}
