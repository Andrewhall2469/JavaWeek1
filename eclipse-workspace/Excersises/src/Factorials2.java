
public class Factorials2 {

	public static void main(String[] args) {
	
//		int fact= 1;
		
		int number = 150;
		
		int newNumber = number;
		int i = 1;
		while (i <= number)
		{	
			
			newNumber = newNumber/i;
			if (newNumber == 1) {
				System.out.println(number + " = " + i + "!");
			
			}
			else if (newNumber < 1)
			{
				System.out.println("none");
				
			}
			i++;
//			System.out
		}
		
//		System.out.println("Factorial of "+number+" is: "+newNumber);    
		
		
	}
}
