package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Garage;
import src.car;
import src.vehicle;

public class GarageTest {

	@Test
	public void test() {
		Garage grg = new Garage();
		car c1 = new car(101, "car", 3, true, "blue", "Renault Megane", "A37FHGUI48", "Diesel", 5);
		
		String result = grg.removeVehicleByType("car");
		int result2 = grg.removeVehicleByID(101);
		assertEquals("car", result);
		assertEquals(101, result2);
	}

}
