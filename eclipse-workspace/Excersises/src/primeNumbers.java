import java.util.stream.IntStream;

public class primeNumbers {

	public static void main(String[] args)
	{
		int[] numbers = IntStream.rangeClosed(0, 3000000).toArray();
		
	
	for (int number: numbers) {
//		System.out.println(primeNumber(number));
		int count = 0;
		for (int i = 0; i < numbers.length; i++) 
		{
			if (numbers[i] != 0)
			{
				count++;
			}
		}
		System.out.print(count);
	}
	
	}
	
	
	private static int primeNumber(int number) {
		if (number < 2)
			return 0;
		
		for (int i = 2; i < number / 2; i++) {
			
			if (number % i == 0)
				return 0;
		}
		
		
		
//	System.out.println(number);
	return number;
	}
}
