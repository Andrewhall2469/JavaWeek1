package src;

public abstract class vehicle{
	int id;
	String type;
	int numberOfWheels;
	boolean motorised;
	String colour;
	String makeAndModel;
	String vinNo;
	int cost;
	public String engineSize;
	public String tyreBrand;
	
	public abstract int bill();
	
	public vehicle(int id, String type, int numberOfWheels, boolean motorised, String colour, String makeAndModel, String vinNo) {
		this.id = id;
		this.type = type;
		this.numberOfWheels = numberOfWheels;
		this.motorised = motorised;
		this.colour = colour;
		this.makeAndModel = makeAndModel;
		this.vinNo = vinNo;
	}
	
}

