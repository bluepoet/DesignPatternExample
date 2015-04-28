package net.bluepoet.pattern.strategy;

public class Item {
	private String name;
	private int price;
	private boolean fresh;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public boolean isFresh() {
		return fresh;
	}
}
