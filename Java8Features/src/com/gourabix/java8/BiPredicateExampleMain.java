package com.gourabix.java8;

import java.util.function.BiPredicate;

public class BiPredicateExampleMain {

	public static void main(String[] args) {
		BiPredicate<String, Integer> isStringGreaterThanSixChars = (name, length) -> {
			return name.length() == length;
		};

		System.out.println(isStringGreaterThanSixChars.test("Gourab", 6));
		System.out.println(isStringGreaterThanSixChars.test("Sush", 4));
		System.out.println(isStringGreaterThanSixChars.test("Love", 9));
	}

}
