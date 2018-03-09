package src;

import java.util.HashMap;
import java.util.Scanner;

public class LibraryRunner {
	public static void main(String[] args) {
		populateLibrary();
		
		
}
	
	public static void populateLibrary() {
		Library l = new Library();
		
		Book b1 = new Book("b1", "Y", 55, "Cat in the hat", "Dr. Seuss");
		Book b2 = new Book("b2", "Y", 55, "Cat in the hat", "Dr. Seuss");
		Book b3 = new Book("b3", "Y", 55, "Cat in the hat", "Dr. Seuss");
		Book b4 = new Book("b4", "Y", 55, "Cat in the hat", "Dr. Seuss");
		Map m1 = new Map("m1", "N", 55, "England", "Atlas R Us");
		Newspaper n1 = new Newspaper("n1", "Y", 55, "Cat in the hat", "Dr. Seuss");
		
		User u1 = new User("u1", "Bob");
		User u2 = new User("u2", "Bob");
		User u3 = new User("u3", "Bob");
		User u4 = new User("u4", "Bob");
		
		l.addItem(b1);
		l.addItem(m1);
		l.addItem(n1);
		
		l.removeItemByID("b1");
		
		StringBuilder sb = new StringBuilder();
		for (Item i: l.itemArray) {
			sb.append(i);
		    sb.append("\n");

		}
		System.out.println("New Version of Garage after removing specificed type");
		System.out.println(sb.toString());
		
		System.out.println("Welcome to the Library, Please enter your User ID");
		Scanner sc = new Scanner(System.in);
		int id_input = sc.nextInt();
		
		HashMap<String, String> user = new HashMap<>();
		user.put(u1.name, "You are currently renting out the following items(s): " + b1.book_id + ": " + b1.title);
		user.put(u2.name, "You are currently renting out the following items(s): " + b2.book_id + ": " + b2.title);
		user.put(u3.name, "You are currently renting out the following items(s): " + b3.book_id + ": " + b3.title);
		user.put(u4.name, "You are currently renting out the following items(s): " + b4.book_id + ": " + b4.title);
		
		
		
		System.out.println(user.get(1));
		

	}
	
	
	
	public static void startUp() {
		
		
		
	}
}
