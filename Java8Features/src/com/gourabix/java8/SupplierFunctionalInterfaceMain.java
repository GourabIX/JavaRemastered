package com.gourabix.java8;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunctionalInterfaceMain {

	public static Double getRandomDouble() {
		return Double.valueOf(Math.random());
	}

	public static Integer getRandomInteger() {
		return (int) Math.ceil(Math.random() * 100);
	}

	public static Integer getRandomIntegerUsingRandomClass() {
		Random random = new Random();
		return random.nextInt(4) + 7; 	// generates a random integer between 3 and (3 + 7 = ) 10.
	}

	public static void main(String[] args) {
		Supplier<Double> randomDouble = SupplierFunctionalInterfaceMain::getRandomDouble;
		System.out.println(randomDouble.get());

		Supplier<Integer> randomInteger = SupplierFunctionalInterfaceMain::getRandomInteger;
		System.out.println(randomInteger.get());

		Supplier<Integer> anotherRandomInteger = SupplierFunctionalInterfaceMain::getRandomIntegerUsingRandomClass;
		System.out.println(anotherRandomInteger.get());
	}

}
