package com.example.decorator.kyh;

public class KidTicket extends MovieTicket {

	public KidTicket() {
		this.type = "유아용티켓";
		this.price = 1000;
	}
	
	@Override
	int pay() {
		return getPrice();
	}	

}
