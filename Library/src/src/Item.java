package src;
public abstract class Item {
	
	String book_id;
	String checkedIn;
	int numOfPages;
	
	
	public Item(String book_id, String checkedIn, int numOfPages) {
		this.book_id = book_id;
		this.checkedIn = checkedIn;
		this.numOfPages = numOfPages;
	}

}
