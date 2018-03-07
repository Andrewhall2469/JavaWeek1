package src;
public class Factorials {

	public static void main(String[] args) {
	
//		int fact= 1;
		
		int number = 18;         			// input number for factorial check
		
		double newNumber = number;			// Initialising number as a double for the loop
		
			
		
		for (int i = 1; i <= number; i++)	// for loop runs until 'i' is equal to input number
		{	
			if (newNumber > 1) {			//If newNumber is greater than 1 for loop continues....
			
				newNumber = newNumber/i;	//do this... e.g 18 = 18 /1 then 18 = 18/2
				if (newNumber == 1) {
					System.out.println(number + " = "  + i + "!");	//if newNumber is 1 print the factorial
			
				}
				else if (newNumber < 1) //if newNumber is less than 1 i.e has no factorial print none
				{
					System.out.println("none");				//printer
				}			
							  }
		}
		
		
	}
}
