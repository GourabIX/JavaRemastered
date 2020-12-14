package com.gourabix.theatreSeatsProject;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author GourabIX (https://github.com/GourabIX)
 *
 */

public class Theatre {

	private String theatreName;

	private List<Seat> theatreSeats = new ArrayList<>();

	public Theatre(String theatreName, int numRows, int seatsPerRow) {
		this.theatreName = theatreName;

		int lastRow = 'A' + (numRows - 1);
		for (char row = 'A'; row <= lastRow; row++) {
			for (int rowNum = 1; rowNum <= seatsPerRow; rowNum++) {
				Seat seat = new Seat(row + String.format("%02d", rowNum));
				theatreSeats.add(seat);
			}
		}
	}

	public String getTheatreName() {
		return theatreName;
	}
	
	public List<Seat> getTheatreSeats() {
		return theatreSeats;
	}

	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat = null;

		for (Seat seat : theatreSeats) {
			System.err.print(".");
			if (seat.getSeatNumber().equalsIgnoreCase(seatNumber))
				requestedSeat = seat;
		}

		if (null != requestedSeat)
			return requestedSeat.makeSeatReservation();
		else
			System.err.println("Seat: " + seatNumber + " was not found in theatre: " + getTheatreName());

		return false;
	}

	public boolean reserveSeatWithBinarySearch(String seatNumber) {
		int low = 0;
		int high = theatreSeats.size() - 1;

		while (low <= high) {
			System.out.print(".");
			int mid = (low + high) / 2;
			Seat midSeat = theatreSeats.get(mid);
			int compareValue = midSeat.getSeatNumber().compareTo(seatNumber);

			if (compareValue < 0)
				low = mid + 1;
			else if (compareValue > 0)
				high = mid - 1;
			else
				return midSeat.makeSeatReservation();
		}

		System.err.println("Seat: " + seatNumber + " was not found in theatre: " + getTheatreName());
		return false;
	}

	public boolean cancelSeatReservation(String seatNumber) {
		Seat requestedSeat = null;

		for (Seat seat : theatreSeats) {
			if (seat.getSeatNumber().equalsIgnoreCase(seatNumber))
				requestedSeat = seat;
		}

		if (null != requestedSeat)
			return requestedSeat.cancelSeatReservation();
		else
			System.err.println("Seat: " + seatNumber + " was not found in theatre: " + getTheatreName());

		return false;
	}

}
