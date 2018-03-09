package src;

public class PaintWizard {

	public static void main(String[] args) {
		
		System.out.println(comparePrice(200));

	}
	
	public static double cheapoMax(int required)
	{
		double coverage = 20.0*10; 
		double price = 19.99;
		return truePrice(required,coverage,price);
	}
	
	public static double averageJoes(int required)
	{
		double coverage = 15.0*11;
		double price = 17.99;
		return truePrice(required,coverage,price);
	}
	
	public static double duluxourousPaints(int required)
	{
		double coverage = 10.0*20;
		double price = 25.00;
		return truePrice(required,coverage,price);
	}
	
	public static String min(double x, double y, double z)
	{
		if(x<=y&&x<=z) return "CheapoMax";
		else if (y<=x && y<=z) return "AverageJoes";
		else return "DuluxourousPaints";
	}
	
	public static double truePrice(int required, double coverage, double price)
	{
		if((required % coverage) ==0 ) return ( required/coverage )*price;
		else return (required/coverage + 1 )*price;
	}
	
	public static String comparePrice(int roomSize)
	{
		return min(cheapoMax(roomSize),averageJoes(roomSize),duluxourousPaints(roomSize));
	}
	
	public static int calcWaste(int required, int coveragePerCan)
	{
		int i=1;
		while (true)
		{
			if(i*coveragePerCan >= required)
			{
				return i*coveragePerCan - required;
			}
			i++;
		}
	}
}