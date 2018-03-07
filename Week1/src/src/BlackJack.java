package src;

public class BlackJack {
	
	public static void main(String[] args)
	{
		System.out.println(blackjack(12,19));
		System.out.println(blackjack(0,19));;
		System.out.println(blackjack(29,35));
		System.out.println(blackjack(18,1));
		System.out.println(blackjack(14,20));

	}
	
	
	public static int blackjack(int value1, int value2) {

		if (value1 > 21 && value2 > 21) {
//			System.out.println("0");	
			return 0;
		}
		else if (21 - value1 < 21 - value2 ) {
//			System.out.println(value1 + " Is the closest value to 21");
			return (value1);
		}
		else if(21 - value1 > 21 - value2) {
//			System.out.println(value2 + " Is the closest value to 21");
			return value2;
		}
		return 0;
	}
}
