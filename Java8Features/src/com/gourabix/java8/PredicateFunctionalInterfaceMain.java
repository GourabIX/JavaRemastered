package com.gourabix.java8;

import java.util.function.Predicate;

public class PredicateFunctionalInterfaceMain {

	public static boolean isAdult(int age) {
		if (age > 18)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Predicate<Integer> isGreaterThanFive = (num) -> (num > 5);
		System.out.println(isGreaterThanFive.test(6));
		System.out.println(isGreaterThanFive.test(2));

		Predicate<Integer> isAnAdult = PredicateFunctionalInterfaceMain::isAdult;
		System.out.println(isAnAdult.test(24));
		System.out.println(isAnAdult.test(4));
	}

}
