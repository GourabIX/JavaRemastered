package com.gourabix.java8;

import java.util.function.BiFunction;

public class GPSLocationMain {

	public static void main(String[] args) {
		GPS gpsLocation = gpsFactory("101.23546", "-564.474558", GPS::new);
		System.out.println(gpsLocation);

		GPS gpsLocation2 = gpsFactory("-57.85120", "-166.46295", GPS::new);
		System.out.println(gpsLocation2);
	}

	public static <T extends GPS> T gpsFactory(String latitude, String longitude,
			BiFunction<String, String, T> gpsLocatable) {
		return gpsLocatable.apply(latitude, longitude);
	}

}
