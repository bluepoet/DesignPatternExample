package com.example.decorator.kyh;

public class TicketMaker {
	public static void main(String[] args) {
		MovieTicket adultTicket = new AdultTicket();

		adultTicket = new MemberShipCard(adultTicket);
		adultTicket = new VipsCard(adultTicket);

		MovieTicket juniorTicket = new JuniorTicket();

		juniorTicket = new MovieDayEventCard(juniorTicket);

		System.out.println("<<<< " + adultTicket.getType() + " >>>>");

		System.out.println("가격 : " + adultTicket.pay());

		System.out.println("<<<< " + juniorTicket.getType() + " >>>>");

		System.out.println("가격 : " + juniorTicket.pay());
	}
}
