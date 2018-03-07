package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.UniqueSum;

public class UniqueSumTest {

	@Test
	public void test() {
		int result = UniqueSum.uniqueSum(1, 2, 3);
		int result2 = UniqueSum.uniqueSum(1, 1, 2);
		
		assertEquals(6, result);
		assertEquals(3, result2);
	}

}
