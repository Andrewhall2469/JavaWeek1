package src;

import java.util.ArrayList;
import java.util.Iterator;

public class Garage {
	 ArrayList<vehicle> vehicleArray = new ArrayList<vehicle>();
	
	
public void calculateBill() {
	
	for (vehicle v : vehicleArray) {
		
		System.out.println("Cost of "+ v.type + " " + v.id + ": £" + v.bill());
		System.out.println("---------------------------");
		
		}
	
}

public void addVehicle(vehicle v) {
	vehicleArray.add(v);
}

public String removeVehicleByType(String type) {
	Iterator<vehicle> iterator = vehicleArray.iterator();
	while (iterator.hasNext()) {
		vehicle v = iterator.next();
		if (v.type == type) {
			iterator.remove();
		}
	}
	return type;
}

public int removeVehicleByID(int id) {
	Iterator<vehicle> iterator = vehicleArray.iterator();
	while (iterator.hasNext()) {
		vehicle v = iterator.next();
		if (v.id == id) {
			iterator.remove();
		}
		
	}
	return id;
}

public void closeGarageDown(vehicle v) {
	vehicleArray.clear();
	System.out.println("Sorry the garage has closed down.. you can go now");
}


}
