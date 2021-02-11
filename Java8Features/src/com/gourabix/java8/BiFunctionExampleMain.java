package com.gourabix.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExampleMain {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> addableBiFunction = (n1, n2) -> (n1 + n2);
		System.out.println(addableBiFunction.apply(4, 5));

		BiFunction<Integer, Integer, Double> raisableBiFunction = (n1, n2) -> Math.pow(n1, n2);
		Double raisedToPower = raisableBiFunction.apply(2, 4);
		System.out.println(raisedToPower);

		BiFunction<Integer, Integer, List<Integer>> addableToList = (n1, n2) -> (Arrays.asList(n1, n2, n1 + n2));
		List<Integer> numbersSumList = addableToList.apply(4, 5);
		System.out.println(numbersSumList);

		// Chaining of BiFunction and Function
		Function<Double, String> stringifyable = (input) -> String.valueOf(input);
		String output = "Result: " + raisableBiFunction.andThen(stringifyable).apply(4, 3);
		System.out.println(output);

		// The same (above) example with Function Functional Interfaces as a function
		// argument
		String result = powToString(5, 6, (n1, n2) -> Math.pow(n1, n2),
				(input) -> "Result 2: " + String.valueOf(input));
		System.out.println(result);
	}

	public static String powToString(Integer n1, Integer n2, BiFunction<Integer, Integer, Double> func1,
			Function<Double, String> func2) {
		return func1.andThen(func2).apply(n1, n2);
	}

}
