import java.util.ArrayList;

public class CalculatorV4 {
	
	public static void main(String[] args) {
	
	}
	
	public static String fullTest(int a, int b, int c, int d) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		String result = "";
		ArrayList<Integer> theList = compare(tonyTwoTest(a, b), tonyTwoTest(c, d));
		for (int match : theList) {
			result += match + " ";
		}
		
		
		return "";
	}
	
	public static ArrayList<Integer> tonyTwoTest(int a, int b)	{
		ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(b + a);
			output.add(a * b);
			output.add(a / b);
			output.add(b / a);
			output.add(a - b);
			output.add(b - a);
		return output;
	}
	public static ArrayList<Integer> compare(ArrayList<Integer> list1, ArrayList<Integer> list2)	{
	
		for(int a : list1) {
			for (int b : list2) {
				if (a != b) {
					list1.remove(list1.get(a));
				}
			}
		}
		return list1;
		
	}
	
}
