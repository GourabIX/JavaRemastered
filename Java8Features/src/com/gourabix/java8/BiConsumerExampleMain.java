package com.gourabix.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExampleMain {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> printIntegers = (n1, n2) -> System.out.println(n1 + n2);
		printIntegers.accept(8, 4);

		addTwo(4, 6, (n1, n2) -> System.out.println(n1 + " + " + n2 + " = " + (n1 + n2)));
		addTwo("Node", ".js", (s1, s2) -> System.out.println(s1 + " + " + s2 + " = " + s1 + s2));

		System.out.println("---------------------------");

		basicMath(9, 4, (n1, n2) -> System.out.println(n1 + n2));
		basicMath(9, 4, (n1, n2) -> System.out.println(n1 - n2));
		basicMath(9, 4, (n1, n2) -> System.out.println(n1 * n2));
		basicMath(9, 4, (n1, n2) -> System.out.println(n1 / n2));
		basicMath((double) 9, (double) 4, (n1, n2) -> System.out.println((double) n1 / (double) n2));

		System.out.println("---------------------------");

		Map<Integer, String> gourabLovesMap = new HashMap<Integer, String>();
		gourabLovesMap.put(101, "Meri Sush");
		gourabLovesMap.put(102, "Aisha");
		gourabLovesMap.put(103, "Aradhya");
		gourabLovesMap.put(104, "The one and only Miss of My Universe - Meri Sush");

		BiConsumer<Map<Integer, String>, String> loveMapConsumer = BiConsumerExampleMain::printMap;
		loveMapConsumer.accept(gourabLovesMap, "Gourab Loves");
		// printMap(gourabLovesMap, "My Many Loves");
	}

	public static <T> void addTwo(T a1, T a2, BiConsumer<T, T> consumer) {
		consumer.accept(a1, a2);
	}

	public static void basicMath(Integer n1, Integer n2, BiConsumer<Integer, Integer> biConsumer) {
		biConsumer.accept(n1, n2);
	}

	public static void basicMath(Double n1, Double n2, BiConsumer<Double, Double> biConsumer) {
		biConsumer.accept(n1, n2);
	}

	public static void printMap(Map<Integer, String> loveMap, String mapName) {
		System.out.println("------------------ " + mapName + " records ---------------------");
		loveMap.forEach((girlNumber, girlName) -> System.out.println(girlNumber + " " + girlName));
	}

}
