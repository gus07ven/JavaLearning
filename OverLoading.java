public class OverLoading {
		
		String str1, str2;
		int num1, num2;
		
		public int add(int num1, int num2){
			
			int sum = num1 + num2;
			return sum;
		}
		
		public String add(String str1, String str2) {
			
			String combined = str1 + str2;
			return combined;
		}
		
		public String add(String str1, int num3) {
			
			String combined = str1 + num3;
			return combined;
		}
	}

