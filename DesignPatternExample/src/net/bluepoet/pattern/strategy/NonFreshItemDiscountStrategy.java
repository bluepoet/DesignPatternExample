package net.bluepoet.pattern.strategy;

public class NonFreshItemDiscountStrategy implements DiscountStrategy {

	@Override
	public int getDiscountPrice(Item item) {
		if(!item.isFresh()) {
			return (int) (item.getPrice() * 0.8);
		}
		
		return item.getPrice();
	}

}
