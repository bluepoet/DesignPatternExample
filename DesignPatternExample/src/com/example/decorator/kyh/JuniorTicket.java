package com.example.decorator.kyh;

public class JuniorTicket extends MovieTicket {
	
	public JuniorTicket() {
		this.type = "û�ҳ��Ƽ��";
		this.price = 4000;
	}
	
	@Override
	int pay() {
		return getPrice();
	}	
}
