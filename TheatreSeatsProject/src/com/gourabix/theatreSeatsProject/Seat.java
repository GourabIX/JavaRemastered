package com.gourabix.theatreSeatsProject;

/**
 * 
 * @author GourabIX (https://github.com/GourabIX)
 *
 */

public class Seat {

	private final String seatNumber;

	private boolean isReserved;

	public Seat(String seatNumber) {
		this.seatNumber = seatNumber;
		this.isReserved = false;
	}

	public boolean isReserved() {
		return isReserved;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	protected boolean makeSeatReservation() {
		if (!this.isReserved) {
			this.isReserved = true;
			return true;
		} else {
			System.err.println("Seat: " + getSeatNumber() + " is already reserved!");
			return false;
		}
	}

	protected boolean cancelSeatReservation() {
		if (this.isReserved) {
			this.isReserved = false;
			return true;
		} else {
			System.err.println("Seat: " + getSeatNumber() + " is not reserved!");
			return false;
		}
	}

}
