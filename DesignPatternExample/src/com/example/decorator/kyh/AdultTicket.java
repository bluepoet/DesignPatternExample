package com.example.decorator.kyh;

public class AdultTicket extends MovieTicket {

	public AdultTicket() {
		this.type = "성인용티켓";
		this.price = 5000;
	}
	
	@Override
	int pay() {
		return getPrice();
	}	

}
