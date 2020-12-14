package com.gourabix.theatreSeatsProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheatreSeatsMain {

	public static void main(String[] args) {

		Theatre theatre = new Theatre("INOX Lake Mall", 10, 10);

		if (theatre.reserveSeat("A02"))
			System.out.println("Please pay for seat A02!");
		else
			System.err.println("Failed to reserve seat: A02.");

		System.out.println();

		if (theatre.reserveSeatWithBinarySearch("A02"))
			System.out.println("Please pay for seat A02!");
		else
			System.err.println("Failed to reserve seat: A02.");

		System.out.println();

		if (theatre.reserveSeatWithBinarySearch("J08"))
			System.out.println("Please pay for seat J08!");
		else
			System.err.println("Failed to reserve seat: J08.");

		System.out.println();

		if (theatre.reserveSeatWithBinarySearch("A05"))
			System.out.println("Please pay for seat A05!");
		else
			System.err.println("Failed to reserve seat: A05.");

		System.out.println();

		if (theatre.reserveSeat("A02"))
			System.out.println("Please pay for seat A02!");
		else
			System.err.println("Failed to reserve seat: A02.");

		System.out.println();

		if (theatre.cancelSeatReservation("A02"))
			System.out.println("Amount for seat: A02 will be refunded!");
		else
			System.err.println("Failed to cancel reservation for seat: A02.");

		System.out.println();

		if (theatre.reserveSeat("A02"))
			System.out.println("Please pay for seat A02!");
		else
			System.err.println("Failed to reserve seat: A02.");

		System.out.println();

		if (theatre.reserveSeat("I07"))
			System.out.println("Please pay for seat I07!");
		else
			System.err.println("Failed to reserve seat: I07.");

		System.out.println();

		if (theatre.reserveSeat("I07"))
			System.out.println("Please pay for seat I07!");
		else
			System.err.println("Failed to reserve seat: I07.");

		System.out.println();

		if (theatre.reserveSeat("J09"))
			System.out.println("Please pay for seat J09!");
		else
			System.err.println("Failed to reserve seat: J09.");

		System.out.println();

		if (theatre.reserveSeat("J09"))
			System.out.println("Please pay for seat J09!");
		else
			System.err.println("Failed to reserve seat: J09.");

		System.out.println();

		if (theatre.reserveSeat("K04"))
			System.out.println("Please pay for seat K04!");
		else
			System.err.println("Failed to reserve seat: K04.");

		System.out.println();

		if (theatre.cancelSeatReservation("K04"))
			System.out.println("Amount for seat: K04 will be refunded!");
		else
			System.err.println("Failed to cancel reservation for seat: K04.");

		System.out.println();

		// Normal order
		printList(theatre.getTheatreSeats());

		// Shuffled order
		List<Seat> seatsCopied = new ArrayList<>(theatre.getTheatreSeats());
		Collections.shuffle(seatsCopied);
		printList(seatsCopied);

		Seat minSeat = Collections.min(seatsCopied);
		System.out.println("MinSeat: " + minSeat.getSeatNumber());

		Seat maxSeat = Collections.max(seatsCopied);
		System.out.println("maxSeat: " + maxSeat.getSeatNumber());

		// Sorted order
		Collections.sort(seatsCopied);
		printList(seatsCopied);

		Collections.swap(seatsCopied, 7, 4);
		printList(seatsCopied);

		// Collections copy
		List<Seat> newList = new ArrayList<>(seatsCopied.size());
		// This will not work because newList has the potential to store that many
		// elements but initially it contains none.
		// The Collections.copy() method will only work after all the required elements
		// of newList (destinationList) have been properly initialized and then the copy
		// is attempted.
		// Collections.copy(newList, seatsCopied);		- Fails with java.lang.IndexOutOfBoundsException
		printList(newList);
	}

	public static void printList(List<Seat> theatreSeats) {
		for (Seat seat : theatreSeats) {
			System.out.println("Seat Number: " + seat.getSeatNumber());
		}

		System.out.println("======================================================");
	}

}
