package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.BlackJack;

public class BlackjackTest {

	@Test
	public void test() {
		int result = BlackJack.blackjack(22, 25);
		int result2 = BlackJack.blackjack(19, 17);
		int result3 = BlackJack.blackjack(7, 12);
		assertEquals(0, result);
		assertEquals(19, result2);
		assertEquals(12, result3);
	}

}
