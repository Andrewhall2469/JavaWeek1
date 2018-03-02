import java.util.ArrayList;

public class CalculatorV2 {

	
	public static void main(String[] args) {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(2);
		test.add(4);
		test.add(6);
		test.add(3);
		
//		test.add(1);
//		test.add(1);
//		test.add(2);
//		test.add(3);
//		
//		test.add(4);
//		test.add(4);
//		test.add(3);
//		test.add(4);
//		
//		test.add(8);
//		test.add(4);
//		test.add(3);
//		test.add(6);
//		
//		test.add(9);
//		test.add(3);
//		test.add(1);
//		test.add(7);
		
		System.out.println(fullTest(test));
	}
	
	public static String fullTest(ArrayList<Integer> input) {
		
		return multiplicationTest(input) + " " + divisionTest(input)
		+ " " + subtractionTest(input) + " " + additionTest(input);
	}
	
	public static String multiplicationTest (ArrayList<Integer> input) {
		String result = "";
		for (int i : input) {
			for (int a : input) {
				for (int b : input) {
					if (i * a == b) {
						result += " " + (i + "*" + a + "=" + b);
					}
				}
			}
		}
		return result;
	} 
	
	public static String divisionTest (ArrayList<Integer> input) {
		String result = "";
		for (int i : input) {
			for (int a : input) {
				for (int b : input) {
					if (i / a == b) {
						result += " " +  (i + "/" + a + "=" + b);
					}
				}
			}
		}
		return result;
	} 

	public static String subtractionTest (ArrayList<Integer> input) {
		String result = "";
		for (int i : input) {
			for (int a : input) {
				for (int b : input) {
					if (i - a == b) {
						result += " " + (i + "-" + a + "=" + b);
					}
				}
			}
		}
		return result;
} 

	public static String additionTest (ArrayList<Integer> input) {
		String result = "";
		for (int i : input) {
			for (int a : input) {
				for (int b : input) {
					if (i + a == b) {
						result += " " + (i + "-" + a + "=" + b);
					}
				}
			}
		}
		return result;
} 
}
