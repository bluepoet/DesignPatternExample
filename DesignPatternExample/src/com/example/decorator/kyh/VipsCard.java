package com.example.decorator.kyh;

public class VipsCard extends TicketDecorator {
	MovieTicket movieTicket;

	public VipsCard(MovieTicket movieTicket) {
		this.movieTicket = movieTicket;
	}

	public String getType() {
		return movieTicket.getType() + " + Vips카드 할인";
	}

	@Override
	int pay() {
		return movieTicket.pay() - 2000;
	}

}
