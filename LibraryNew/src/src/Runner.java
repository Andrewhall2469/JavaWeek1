package src;

import java.util.Scanner;

public class Runner {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		UserManager u = new UserManager();
		LibraryManager l = new LibraryManager();
		populateLibrary(l);
		populateUser(u);
		startUp(u, l);
		

		
	}

	public static void populateLibrary(LibraryManager l) {
		Book b1 = new Book(101, "Y", 55, "Cat in the hat", "Dr. Seuss");
		Book b2 = new Book(102, "Y", 105, "Bat in the rat", "Carl Smith");
		Book b3 = new Book(103, "Y", 55, "The Three Penguins", "John Johnson");
		Book b4 = new Book(104, "Y", 55, "The four lions", "Michael Jackson");
		Map m1 = new Map(105, "N", 55, "England", "Atlas R Us");
		Newspaper n1 = new Newspaper(106, "Y", 55, "The Sun", "Tabloid");
		l.addItem(b1);
		l.addItem(b2);
		l.addItem(b3);
		l.addItem(b4);
		l.addItem(m1);
		l.addItem(n1);
	}
	
	public static void populateUser(UserManager u) {
		
		User u1 = new User(1, "Bob");
		User u2 = new User(2, "Jack");
		User u3 = new User(3, "Bill");
		User u4 = new User(4, "Cleatus");
		
		u.addUser(u1);
		u.addUser(u2);
		u.addUser(u3);
		u.addUser(u4);
		System.out.println(u.userArray);
	}

	public static void startUp(UserManager u, LibraryManager l) {
		System.out.println("Welcome to the Library of dreams...");
		System.out.println("Press 'U' to edit a user || Press 'L' to edit the library || Press 'Q' to quit");
		
		String firstInput = sc.next();
		int i=0;
		while (i < 1) 
		{
			if (firstInput.equalsIgnoreCase("U")) 
			{
			editUserDatabase(u, l);
			i++;
			}
			else if (firstInput.equalsIgnoreCase("L")) 
			{
			editLibraryDatabase(l, u);
			i++;
			}
			else if (firstInput.equalsIgnoreCase("Q")) 
			{
				System.out.println("Quitting Program");
			System.exit(0);
			i++;
			}
			else 
			{
				System.out.println("Incorrect data entered try again..");
				startUp(u, l);
			}
		}
	}

	public static void editUserDatabase(UserManager u, LibraryManager l) {
		System.out.println("Welcome to the User database. Please choose one of the following options: \n"
				+ "Press 'A' to add a user || Press 'D' to delete a user || Press 'U' to update a user || Press 'B' to go back");
		String secondInput = sc.next();
		int i=0;
		while (i < 1) 
		{
			if (secondInput.equalsIgnoreCase("A")) 
			{
			System.out.println("Enter the new ID for the user");
			i++;
			}
			else if (secondInput.equalsIgnoreCase("D")) 
			{
				System.out.println("Enter ID of user you wish to delete:");
				int deleteInput = sc.nextInt();
				System.out.println("User Deleted");
				u.deleteUser(deleteInput);
				i++;
			}
			else if (secondInput.equalsIgnoreCase("B")) 
			{
				startUp(u, l);
			}
			else {
				
			}
		}
		System.out.println(u.userArray);
		startUp(u, l);
	}
	
	public static void editLibraryDatabase(LibraryManager l, UserManager u) 
	{
		System.out.println("Welcome to the Library database. Please choose one of the following options: \n"
				+ "Press 'A' to add an item || Press 'D' to delete an item || Press 'U' to update an item || Press 'B' to go back");
		String secondInput = sc.nextLine();
		int i=0;
		while (i < 1) 
		{
			if (secondInput.equalsIgnoreCase("A")) 
			{
//			
			i++;
			}
			else if (secondInput.equalsIgnoreCase("D")) 
			{
				System.out.println("Enter ID of user you wish to delete:");
				int deleteInput = sc.nextInt();
				System.out.println("User Deleted");
				l.removeItemByID(deleteInput);
				i++;
			}
			else if (secondInput.equalsIgnoreCase("B")) 
			{
				
				startUp(u, l);
			}
			else 
			{
				System.out.println("Incorrect data entered try again..");
				editLibraryDatabase(l, u);
			}
		}	
	}
}

	

//StringBuilder sb = new StringBuilder();			//For later use
//for (Item i: l.itemArray) 
//{
//	sb.append(i);
//    sb.append("\n");
//
//}
//System.out.println("New Version of Garage after removing specificed type");
//System.out.println(sb.toString());
