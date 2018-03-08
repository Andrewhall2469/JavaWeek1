package src;


public class Book extends Item {
	public String author;
	public String title;
	
	public Book(int book_id, String checkedIn, int numOfPages, String title, String author) {
		super(book_id, checkedIn, numOfPages);
		this.title = title;
		this.author = author;
	}
	
	public String toString() {
		return book_id + " " + checkedIn + " " + numOfPages + " " + title + " " + author;
	}
	

}
