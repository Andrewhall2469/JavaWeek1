package src;
import java.util.Scanner;

public class Excersise1 {

	public static void main(String[] args)
	{
//		helloWorld();			//(Un)comment to run specific method
//		parameters();
//		parmetersOperators();
//		conditionals();
//		conditionals2();
//		iteration();
		arrays();
//		iterationArray();
//		iterationArray2();
	}
	public static void helloWorld(){
		//Assignment
			String helloWorld = ("Hello World!");
			System.out.println(helloWorld);
			return;
	}
	public static void parameters(){
		//Paramaters and return types
			String name = ("What is your name?");
			System.out.println(name);
			Scanner scan = new Scanner(System.in);
			String output = scan.nextLine();
			System.out.println("Hello" + output + " Press Enter to continue!");
			scan.nextLine();
			scan.close();
			return;
	}
	public static void parmetersOperators() {
		//Parameters/Operators
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter first number for addition");
			int firstNumber = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter second number for addition");
			int secondNumber = scan.nextInt();
			scan.nextLine();
			int result;
			result = firstNumber + secondNumber;
			System.out.println(firstNumber + "+" + secondNumber + "=" + result);
			scan.close();
			return;
	}
	public static void conditionals() {
		//Conditionals 1
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number for addition");
		int firstNumber = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter second number for addition");
		int secondNumber = scan.nextInt();
		scan.nextLine();
		int result;
		
		boolean trueFalse = true;
		if (trueFalse) {
			result = firstNumber + secondNumber;
			System.out.println(firstNumber + "+" + secondNumber + "=" + result);
		}
		else {
			result = firstNumber + secondNumber;
			System.out.println(firstNumber + "*" + secondNumber + "=" + result);
		}
		scan.close();
		return;
	}

	public static void conditionals2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number for addition");
		int firstNumber = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter second number for addition");
		int secondNumber = scan.nextInt();
		scan.nextLine();
		int result = 0;
		
		System.out.println("Enter true for addition or true for multiplication");
		boolean trueFalse;
		trueFalse = scan.nextBoolean();
		if (trueFalse == true) {
			result = firstNumber + secondNumber;
			System.out.println(firstNumber + "+" + secondNumber + "=" + result);
		}
		else if (result == 0) {
			System.out.println(firstNumber + "+" + secondNumber + "=" + result);
		}
		else {
			result = firstNumber + secondNumber;
			System.out.println(firstNumber + "*" + secondNumber + "=" + result);
		}
		scan.close();
		return;
	}
	public static void iteration() {
		int i = 0;
		while(i < 10) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number for addition");
		int firstNumber = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter second number for addition");
		int secondNumber = scan.nextInt();
		scan.nextLine();
		int result = 0;
		
		System.out.println("Enter true for addition or true for multiplication");
		boolean trueFalse;
		trueFalse = scan.nextBoolean();
		if (trueFalse == true) {
			result = firstNumber + secondNumber;
			System.out.println(firstNumber + "+" + secondNumber + "=" + result);
		}
		else if (result == 0) {
			System.out.println(firstNumber + "+" + secondNumber + "=" + result);
		}
		else {
			result = firstNumber + secondNumber;
			System.out.println(firstNumber + "*" + secondNumber + "=" + result);
		}
		scan.close();
		i++;
		}
		return;
		
	}
	public static void arrays() {
		int[] arrayOfIntegers = {1,2,3,4,5,6,7,8,9,10};
		int i = 0;
		while(i < 10) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number for addition");
		int firstNumber = scan.nextInt();
		int secondNumber = arrayOfIntegers[i];
		scan.nextLine();
		int result = 0;
		
		System.out.println("Enter true for addition or true for multiplication");
		boolean trueFalse;
		trueFalse = scan.nextBoolean();
		if (trueFalse == true) {
			result = firstNumber + secondNumber;
			System.out.println(firstNumber + "+" + secondNumber + "=" + result);
		}
		else if (result == 0) {
			System.out.println(firstNumber + "+" + secondNumber + "=" + result);
		}
		else {
			result = firstNumber + secondNumber;
			System.out.println(firstNumber + "*" + secondNumber + "=" + result);
		}
//		scan.close();
		i++;
		}
		
	return;
	}
	
	//Stopped using scanner here
	public static void iterationArray() {
		int[] arrayOfIntegers = {1,2,3,4,5,6,7,8,9,10};
		for (int i=0; i < 10; i++) {
			System.out.println(arrayOfIntegers[i]);
		}
	}

	public static void iterationArray2() {
		int[] arrayOfIntegers = {1,2,3,4,5,6,7,8,9,10};
		for (int i=0; i < 10; i++) {
			System.out.print(arrayOfIntegers[i] + ",");
		}
		int[] arrayOfIntegers2 = {1,2,3,4,5,6,7,8,9,10};
		int i = 0;
		while (i < 10) {
			System.lineSeparator();
			System.out.print(arrayOfIntegers2[i]*10 + ",");
			i++;
		}
	}
}

