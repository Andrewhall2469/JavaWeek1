package src;

public class Map extends Item {
	public String country;
	public String brandName;

	public Map(String book_id, String checkedIn, int numOfPages, String country, String brandName) {
		super(book_id, checkedIn, numOfPages);
		this.country = country;
		this.brandName = brandName;
	}
	
	public String toString() {
		return book_id + " " + checkedIn + " " + numOfPages + " " + country + " " + brandName;
	}
}
