
public class Excersise2 {
	public static void main(String[] args)
	{
//		blackjack(12,19);
//		blackjack(0,19);
//		blackjack(29,35);
//		blackjack(18,1);
//		blackjack(14,20);
//		System.out.println(uniqueSum(12, 13, 14));
//		System.out.println(uniqueSum(12, 12, 14));
//		System.out.println(uniqueSum(12, 12, 23));
//		System.out.println(uniqueSum(14, 13, 14));
		tooHot(true, 88);
		tooHot(true, 23);
		tooHot(false, 76);
		tooHot(false, 96);
		
	}
	public static void blackjack(int value1, int value2) {

		if (value1 > 21 && value2 > 21) {
			System.out.println("0");	
		}
		else if (21 - value1 < 21 - value2 ) {
			System.out.println(value1 + " Is the closest value to 21");
		}
		else if(21 - value1 > 21 - value2) {
			System.out.println(value2 + " Is the closest value to 21");
		}
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
		System.out.print(" " + value1 + "," + value2 + "," + value3 + " = ");
		return result;
		}
		
	public static void tooHot(boolean isSummer, int temperature) {
		if (isSummer == true) {
			if (temperature >= 60 && temperature <= 100) {
				System.out.println("True");
		}
			else {
					System.out.println("False");
				}
			}
		else if (isSummer == false) {
			if(temperature >= 60 && temperature <= 90) {
				System.out.println("True");
			}
			else {
				System.out.println("false");
			}
		}
			}
	
}
