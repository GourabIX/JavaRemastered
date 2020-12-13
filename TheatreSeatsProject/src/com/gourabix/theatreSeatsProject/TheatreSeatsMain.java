package com.gourabix.theatreSeatsProject;

public class TheatreSeatsMain {

	public static void main(String[] args) {

		Theatre theatre = new Theatre("INOX Lake Mall", 10, 10);

		if (theatre.reserveSeat("A02"))
			System.out.println("Please pay for seat A02!");
		else
			System.err.println("Failed to reserve seat: A02.");

		if (theatre.reserveSeat("A02"))
			System.out.println("Please pay for seat A02!");
		else
			System.err.println("Failed to reserve seat: A02.");

		if (theatre.cancelSeatReservation("A02"))
			System.out.println("Amount for seat: A02 will be refunded!");
		else
			System.err.println("Failed to cancel reservation for seat: A02.");

		if (theatre.reserveSeat("A02"))
			System.out.println("Please pay for seat A02!");
		else
			System.err.println("Failed to reserve seat: A02.");

		if (theatre.reserveSeat("I07"))
			System.out.println("Please pay for seat I07!");
		else
			System.err.println("Failed to reserve seat: I07.");

		if (theatre.reserveSeat("I07"))
			System.out.println("Please pay for seat I07!");
		else
			System.err.println("Failed to reserve seat: I07.");

		if (theatre.reserveSeat("J09"))
			System.out.println("Please pay for seat J09!");
		else
			System.err.println("Failed to reserve seat: J09.");

		if (theatre.reserveSeat("J09"))
			System.out.println("Please pay for seat J09!");
		else
			System.err.println("Failed to reserve seat: J09.");

		if (theatre.reserveSeat("K04"))
			System.out.println("Please pay for seat K04!");
		else
			System.err.println("Failed to reserve seat: K04.");

		if (theatre.cancelSeatReservation("K04"))
			System.out.println("Amount for seat: K04 will be refunded!");
		else
			System.err.println("Failed to cancel reservation for seat: K04.");

	}

}
