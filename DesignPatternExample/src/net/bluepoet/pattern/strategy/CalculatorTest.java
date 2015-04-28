package net.bluepoet.pattern.strategy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * �������Ͽ��� �׽�Ʈ�ڵ� �ǽ�
 * 
 * @author bluepoet
 * 
 */
public class CalculatorTest {
	private Calculator calculator = new Calculator();
	private List<Item> items = new ArrayList<Item>();

	@Before
	public void setUp() {
		putItems();
	}

	@Test
	public void FirstGuest_DiscountStrategy() {
		// Given
		DiscountStrategy strategy = new FirstGuestDiscountStrategy();
		calculator.setDiscountStrategy(strategy);

		// When
		int totalPrice = calculator.calculate(items);

		// Then
		assertThat(totalPrice, is(13500));
	}

	@Test
	public void NonFresh_DiscountStrategy() {
		// Given
		DiscountStrategy strategy = new NonFreshItemDiscountStrategy();
		calculator.setDiscountStrategy(strategy);

		// When
		int totalPrice = calculator.calculate(items);

		// Then
		assertThat(totalPrice, is(14000));
	}

	private void putItems() {
		Item banana = new Item("�ٳ���", 10000);
		banana.setFresh(true);
		Item pineApple = new Item("���ξ���", 5000);
		pineApple.setFresh(false);
		items.add(banana);
		items.add(pineApple);
	}
}
