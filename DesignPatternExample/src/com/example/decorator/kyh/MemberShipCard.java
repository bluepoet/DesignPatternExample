package com.example.decorator.kyh;

public class MemberShipCard extends TicketDecorator {
	MovieTicket movieTicket;

	public MemberShipCard(MovieTicket movieTicket) {
		this.movieTicket = movieTicket;
	}

	public String getType() {
		return movieTicket.getType() + " + �����ī�� ����";
	}

	@Override
	int pay() {
		return movieTicket.pay() - 1000;
	}
}
