package src;

public class User {
	
	int id;
	String name;
	
	public User(int i, String name) {
		this.id = i;
		this.name = name;
		
		
	}
	public String toString() {
		return id + " " + name;
	}

}
