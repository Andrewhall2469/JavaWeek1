package src;

public class main {
	public static void main(String args[]){
			Garage grg = new Garage();

			car c1 = new car(101, "car", 3, true, "blue", "Renault Megane", "A37FHGUI48", "Diesel", 5);
			motorcycle m1 = new motorcycle(102, "motorcycle", 2, true, "black", "Ducati Monster", "AJDHJFHD", "600cc", "Pirelli");
			airplane b1 = new airplane(103, "airplane", 2, true, "white", "AIRFORCE1", "DFHHDFWE8", 2, 354);
			car c2 = new car(104, "car", 3, true, "blue", "Renault Megane", "A37FHGUI48", "Diesel", 5);

			grg.addVehicle(c1);
			grg.addVehicle(m1);
			grg.addVehicle(b1);
			grg.addVehicle(c2);
			
			StringBuilder sb = new StringBuilder();
			for (vehicle v: grg.vehicleArray) {
				sb.append("New Vehicle Added: " + v);
			    sb.append("\n");

			}
			System.out.println(sb.toString());
			
			grg.calculateBill();
			
			grg.removeVehicleByType("car");
			
			StringBuilder sbb = new StringBuilder();
			for (vehicle v: grg.vehicleArray) {
				sbb.append(v);
			    sbb.append("\n");
			}
			System.out.println("New Version of Garage after removing specificed type");
			    System.out.println(sbb.toString());
			    
			    grg.removeVehicleByID(102);
				
				StringBuilder sbbb = new StringBuilder();
				for (vehicle v: grg.vehicleArray) {
					sbbb.append(v);
				    sbbb.append("\n");
				    sbbb.append("\n");
				}
				System.out.println("New Version of Garage after removing specificed ID");
				    System.out.println(sbbb.toString());
//			System.out.println("New Version of Garage after removing");
//			System.out.println(grg.vehicleArray);
			
			
		}
	
}
