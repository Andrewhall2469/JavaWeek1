import java.util.ArrayList;

public class CalculatorV3 {
	
	public static void main(String[] args) {
		System.out.println(fullTest(3,5,5,3));
		
	}
	public static String fullTest(int e, int f, int g, int h) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		
		input.add(e);
		input.add(f);
		input.add(g);
		input.add(h);
		String result = "";
		for (int i = 0; i < input.size(); i++) {
			for (int j = i + 1; i < input.size(); i++) {
				for (int k : input) {
					for (int l : input) {
						if (i / j == k / l) {
							result += i + "/" + j + "=" + k + "/" + l + " ";
						}
						if (i * j == k * l) {
							result += i + "*" + j + "=" + k + "*" + l + " ";
						}
						if (i - j == k - l) {
							result += i + "-" + j + "=" + k + "-" + l + " ";
						}
						if (i + j == k + l) {
							result += i + "+" + j + "=" + k + "+" + l + " ";
						}
						if (i / j == k + l) {
							result += i + "/" + j + "=" + k + "+" + l + " ";
						}
						if (i / j == k - l) {
							result += i + "/" + j + "=" + k + "-" + l + " ";
						}
						if (i / j == k * l) {
							result += i + "/" + j + "=" + k + "*" + l + " ";
						}
						if (i * j == k + l) {
							result += i + "*" + j + "=" + k + "+" + l + " ";
						}
						if (i * j == k - l) {
							result += i + "*" + j + "=" + k + "-" + l + " ";
						}
						if (i + j == k - l) {
							result += i + "+" + j + "=" + k + "-" + l + " ";
						}
					}
				}
			}
		}
		return result;
		
	}

}
