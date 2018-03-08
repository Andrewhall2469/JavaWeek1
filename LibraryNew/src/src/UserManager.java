package src;

import java.util.ArrayList;
import java.util.Iterator;

public class UserManager {
	 ArrayList<User> userArray = new ArrayList<User>();
	 
	 
	 public void addUser(User u) {
		 userArray.add(u);
	 	}
	 
	 public int deleteUser(int id) {
		 Iterator<User> iterator = userArray.iterator();	
		 while (iterator.hasNext()) 
			{
				User i = iterator.next();
				if (i.id == id) 
				{
					iterator.remove();
				}
				
			}
			return id;
	 }
	 
	 public void updateUser(User u) {
		 
	 }
	 
	 
	
	
}
