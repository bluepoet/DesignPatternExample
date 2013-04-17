package com.example.decorator.kyh;

public abstract class MovieTicket {
	public String type;
	public int price;
	
	public String getType() {
		return type;
	}
	
	public int getPrice() {
		return price;
	}
	
	abstract int pay();
}


