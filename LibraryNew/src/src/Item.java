package src;
public abstract class Item {
	
	int book_id;
	String checkedIn;
	int numOfPages;
	
	
	public Item(int book_id, String checkedIn, int numOfPages) {
		this.book_id = book_id;
		this.checkedIn = checkedIn;
		this.numOfPages = numOfPages;
	}
	
	public String toString() {
		return book_id + " " + checkedIn + " " + numOfPages;
	}

}
