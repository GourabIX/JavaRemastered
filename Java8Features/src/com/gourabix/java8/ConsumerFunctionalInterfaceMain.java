package com.gourabix.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceMain {

	public static void consumeInteger(int number) {
		System.out.println("Integer: " + number);
	}

	public static void consumeString(String message) {
		System.out.println("String: " + message);
	}

	public static void getSumOfList(List<Integer> integerList) {
		int sum = integerList.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of all numbers in list = " + sum);
	}

	public static void main(String[] args) {
		Consumer<Integer> integerConsumer = ConsumerFunctionalInterfaceMain::consumeInteger;
		integerConsumer.accept(42);

		Consumer<String> stringConsumer = ConsumerFunctionalInterfaceMain::consumeString;
		stringConsumer.accept("You forget a thousand things everyday. Make sure this ISN'T one of them.");

		List<Integer> listOfIntegers = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			listOfIntegers.add(i);
		}

		Consumer<List<Integer>> integerListConsumer = ConsumerFunctionalInterfaceMain::getSumOfList;
		integerListConsumer.accept(listOfIntegers);
	}

}
