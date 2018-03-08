package src;

import java.util.ArrayList;
import java.util.Iterator;

public class LibraryManager {
	 ArrayList<Item> itemArray = new ArrayList<Item>();
	 
	 
	 public void checkOutItem() 
	 {
		 
	 }
	 
	 public void checkInItem() 
	 {
		 
	 }
	 
	 public void addItem(Item i) 
	 {
		itemArray.add(i);
	 }
	 
	 public int removeItemByID(int book_id) 
	 {
			Iterator<Item> iterator = itemArray.iterator();
			while (iterator.hasNext()) 
			{
				Item i = iterator.next();
				if (i.book_id == book_id) 
				{
					iterator.remove();
				}
				
			}
			return book_id;
	 }

	public void updateItem() 
	{
		
	}
}
