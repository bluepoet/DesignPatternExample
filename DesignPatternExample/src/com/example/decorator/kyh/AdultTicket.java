package com.example.decorator.kyh;

public class AdultTicket extends MovieTicket {

	public AdultTicket() {
		this.type = "���ο�Ƽ��";
		this.price = 5000;
	}
	
	@Override
	int pay() {
		return getPrice();
	}	

}
