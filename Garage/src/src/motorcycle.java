package src;

public class motorcycle extends vehicle {
	public String engineSize;
	public String tyreBrand;
	
	public int bill() {
		return 1000;
	}
	
	
	public motorcycle(int id, String type, int numberOfWheels, boolean motorised, String colour, String makeAndModel,
			String vinNo, String engineSize, String tyreBrand) {
		super(id, type, numberOfWheels, motorised, colour, makeAndModel, vinNo);
		this.engineSize = engineSize;
		this.tyreBrand = tyreBrand;
		
	}
	public String toString() {
		return id + " " + type + " " + numberOfWheels + " " + motorised + " " + colour + " " + makeAndModel + " " + vinNo + " " 
				+ " " + engineSize + " " + tyreBrand;
	}

}
