package src;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	 ArrayList<Item> itemArray = new ArrayList<Item>();
	 ArrayList<User> userArray = new ArrayList<User>();

	 
	 
	 public void addItem(Item i) {
		itemArray.add(i);
		}
	 
	 public void addUser(User u) {
		 userArray.add(u);
	 	}
	 
	 public String removeItemByID(String book_id) {
			Iterator<Item> iterator = itemArray.iterator();
			while (iterator.hasNext()) {
				Item i = iterator.next();
				if (i.book_id == book_id) {
					iterator.remove();
				}
				
			}
			return book_id;
		}
}
