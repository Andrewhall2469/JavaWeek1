package Garage;

public abstract class Calculator {
 
	public static void main(String[] args) {
		
		System.out.println(fullTest(4, 2, 8));
		System.out.println(fullTest(6, 2, 12));
		System.out.println(fullTest(6, 2, 3));
		System.out.println(fullTest(9, 12,108));
		System.out.println(fullTest(4, 16, 64));

		
	}
	
	public static String multiplicationTest (int a, int b, int c) {
		
		if (a * b == c) {
			return a + "*" + b + "=" + c;
		}
		else if (b * c == a) {
			return b + "*" + c + "=" + a;
		}
		else if (a*c == b) {
			return a + "*" + c + "=" + b;
		}
		else
			return "";
		
	}
	
	public static String divisionTest (int a, int b, int c) {
		
		if (a / b == c) {
			return a + "/" + b + "=" + c;
		}
		else if (b / c == a) {
			return b + "/" + c + "=" + a;
		}
		else if (a / c == b) {
			return a + "/" + c + "=" + b;
		}
		else if (c / b == a) {
			return c + "/" + b + "=" + a;
		}
		else if (c / a == b) {
			return c + "/" + a + "=" + b;
		}
		else if (b / a == c) {
			return b + "/" + a + "=" + c;
		}
		else
			return "";
		
	}

	public static String subtractionTest (int a, int b, int c) {
		
		if (a - b == c) {
			return a + "-" + b + "=" + c;
		}
		else if (b - c == a) {
			return b + "-" + c + "=" + a;
		}
		else if (a - c == b) {
			return a + "-" + c + "=" + b;
		}
		else if (c - b == a) {
			return c + "-" + b + "=" + a;
		}
		else if (c - a == b) {
			return c + "-" + a + "=" + b;
		}
		else if (b - a == c) {
			return b + "-" + a + "=" + c;
		}
		else
			return "";
		
	}

	public static String additionTest (int a, int b, int c) {
		
		if (a + b == c) {
			return a + "+" + b + "=" + c;
		}
		else if (b + c == a) {
			return b + "+" + c + "=" + a;
		}
		else if (a + c == b) {
			return a + "+" + c + "=" + b;
		}
		else
			return "";
		
	}

	public static String fullTest (int a, int b, int c) {
		return multiplicationTest(a,b,c) + " " + divisionTest(a,b,c)
		+ " " + subtractionTest(a,b,c) + " " + additionTest(a,b,c);
	}
}
