package src;

public class car extends vehicle {
	public String fuelGrade;
	public int numOfDoors;
	
	public int bill() {
		return 3000;
	}
	
	public car(int id, String type, int numberOfWheels, boolean motorised, String colour, String makeAndModel, String vinNo, 
			String fuelGrade, int numOfDoors) {
		super(id, type, numberOfWheels, motorised, colour, makeAndModel, vinNo);
		this.fuelGrade = fuelGrade;
		this.numOfDoors = numOfDoors;
		
	}
	public String toString() {
		return id + " " + type + " " +  numberOfWheels + " " + motorised + " " + colour +  " " + makeAndModel + " " + vinNo + " " + fuelGrade 
				+ " " + numOfDoors;
	}

}
