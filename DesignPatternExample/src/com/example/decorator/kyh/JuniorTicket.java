package com.example.decorator.kyh;

public class JuniorTicket extends MovieTicket {
	
	public JuniorTicket() {
		this.type = "청소년용티켓";
		this.price = 4000;
	}
	
	@Override
	int pay() {
		return getPrice();
	}	
}
