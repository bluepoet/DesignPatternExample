package com.example.decorator.kyh;

public class KidTicket extends MovieTicket {

	public KidTicket() {
		this.type = "���ƿ�Ƽ��";
		this.price = 1000;
	}
	
	@Override
	int pay() {
		return getPrice();
	}	

}
