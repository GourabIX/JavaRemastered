package com.gourabix.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionFunctionalInterfaceListMapConverter {

	public static void main(String[] args) {
		List<String> techCategories = Arrays.asList("Backend", "Frontend", "Cloud", "Sush");

		Map<String, Integer> techCategoryMap = convertListToMap(techCategories,
				FunctionFunctionalInterfaceListMapConverter::getStringLength);
		System.out.println(techCategoryMap);

		Map<String, Integer> techMap = convertListToMap(techCategories, techCatName -> techCatName.length());
		System.out.println(techMap);
	}

	public static <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> functionalInterface) {
		Map<T, R> map = new HashMap<T, R>();
		for (T t : list) {
			map.put(t, functionalInterface.apply(t));
		}
		return map;
	}

	public static Integer getStringLength(String string) {
		return string.length();
	}

}
