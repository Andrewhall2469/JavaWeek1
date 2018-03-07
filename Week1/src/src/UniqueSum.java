package src;

public class UniqueSum {
	
	public static void main(String[] args) {

		System.out.println(uniqueSum(12, 13, 14));
		System.out.println(uniqueSum(12, 12, 14));
	    System.out.println(uniqueSum(12, 12, 23));
		System.out.println(uniqueSum(14, 13, 14));

	}
	
	
	public static int uniqueSum(int value1, int value2, int value3) {
		if (value1 == value2 || value1 == value3)
		{
			value1 = 0;
		}
		if (value2 == value3) {
			value2 = 0;
		}
		int result = value1 + value2 + value3;
		System.out.print(value1 + "," + value2 + "," + value3 + " = ");
		return result;
		}
}
