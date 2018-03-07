package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.TooHot;

public class TooHotTest {

	@Test
	public void test() {
		String result = TooHot.tooHot(true, 88);
		String result2 = TooHot.tooHot(false, 23);
		String result3 = TooHot.tooHot(true, 42);
		String result4 = TooHot.tooHot(false, 65);
		assertEquals("True", result);
		assertEquals("False", result2);
		assertEquals("False", result3);
		assertEquals("True", result4);
		

	}

}
