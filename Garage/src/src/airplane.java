package src;

public class airplane extends vehicle {
	int numOfWings;
	int numOfSeats;
	
	public int bill() {
		return 30000;
	}
	

	public airplane(int id, String type, int numberOfWheels, boolean motorised, String colour, String makeAndModel,
			String vinNo, int numOfWings, int numOfSeats) {
		super(id, type, numberOfWheels, motorised, colour, makeAndModel, vinNo);
		this.numOfWings = numOfWings;
		this.numOfSeats = numOfSeats;
 
	}
	
	public String toString() {
		return id + " " + type + " " + numberOfWheels + " " + motorised + " " + colour + " " + makeAndModel + " " + vinNo + " " 
				+ " " + numOfWings + " " + numOfSeats;
	}

}
