package com.example.decorator.kyh;

public class MovieDayEventCard extends TicketDecorator {

	MovieTicket movieTicket;

	public MovieDayEventCard(MovieTicket movieTicket) {
		this.movieTicket = movieTicket;
	}

	public String getType() {
		return movieTicket.getType() + " + ��ȭ�ǳ��̺�Ʈī�� ����";
	}

	@Override
	int pay() {
		return movieTicket.pay() - 3000;
	}

}
