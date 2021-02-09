package com.gourabix.java8;

import java.time.LocalDate;
import java.util.function.Supplier;

public class DeveloperSupplierFactory {

	public static void main(String[] args) {
		Developer developerOnboard1 = devFactory(Developer::new);
		System.out.println(developerOnboard1);

		Developer developerOnboard2 = devFactory(() -> new Developer("Gourab"));
		System.out.println(developerOnboard2);
	}

	public static Developer devFactory(Supplier<? extends Developer> developerSupplier) {
		Developer developer = developerSupplier.get();

		if (null == developer.getName() || "".equals(developer.getName())) {
			developer.setName("Unnamed - Default");
		}

		developer.setEmail("gourabsarkar.x@gmail.com");
		developer.setSalary(100000L);
		developer.setStartDate(LocalDate.now());

		return developer;
	}

}
