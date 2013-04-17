package com.example.decorator.kyh;

public class MovieDayEventCard extends TicketDecorator {

	MovieTicket movieTicket;

	public MovieDayEventCard(MovieTicket movieTicket) {
		this.movieTicket = movieTicket;
	}

	public String getType() {
		return movieTicket.getType() + " + 영화의날이벤트카드 할인";
	}

	@Override
	int pay() {
		return movieTicket.pay() - 3000;
	}

}
