import java.util.Scanner;

public class helloWorld {
	public static void main(String[] args)
	{
	
		
	String name = ("What is your name?");
	System.out.println(name);
	Scanner scan = new Scanner(System.in);
	String output = scan.nextLine();

	
	System.out.println("Hello " + output);
	
	System.out.println("Enter first number");
		int firstNumber = scan.nextInt();
		scan.nextLine();
	
	
	System.out.println("Enter operator");
	String operator = scan.nextLine();
	System.out.println(operator);
	
	
	System.out.println("Enter second number");
		int secondNumber = scan.nextInt();
		scan.nextLine();
		
	int result;
//	System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));
	
	if (operator == "+") {
		result = firstNumber + secondNumber;
		System.out.print(firstNumber + operator + secondNumber + result);
	}
	else if (operator == "-") {
		result = firstNumber - secondNumber;
		System.out.print(firstNumber + operator + secondNumber + result);
	}
	else if (operator == "*") {
		result = firstNumber * secondNumber;
		System.out.print(firstNumber + operator + secondNumber + result);
	}
	else if (operator == "/") {
		result = firstNumber / secondNumber;
		System.out.print(firstNumber + operator + secondNumber + result);
	}
//	scan.close();
	
	
	}
}