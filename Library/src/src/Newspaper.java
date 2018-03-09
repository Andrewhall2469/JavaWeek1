package src;

public class Newspaper extends Item {
	public String publisher;
	public String tabloidOrBroadsheet;

	public Newspaper(String book_id, String checkedIn, int numOfPages, String publisher, String tabloidOrBroadsheet) {
		super(book_id, checkedIn, numOfPages);
		this.publisher = publisher;
		this.tabloidOrBroadsheet = tabloidOrBroadsheet;
	}
	public String toString() {
		return book_id + " " + checkedIn + " " + numOfPages + " " + publisher + " " + tabloidOrBroadsheet;
	}

}
