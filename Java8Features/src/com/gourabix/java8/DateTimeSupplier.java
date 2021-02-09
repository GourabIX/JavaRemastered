package com.gourabix.java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class DateTimeSupplier {

	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");

	public static void main(String[] args) {
		Supplier<LocalDateTime> localDateTimeSupplier = () -> LocalDateTime.now();
		LocalDateTime localDateTime = localDateTimeSupplier.get();
		System.out.println(localDateTime);

		Supplier<String> customizedDate = () -> DATE_TIME_FORMATTER.format(LocalDateTime.now());
		System.out.println(customizedDate.get());
	}

}
