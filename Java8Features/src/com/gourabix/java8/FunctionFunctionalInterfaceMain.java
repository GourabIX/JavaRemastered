package com.gourabix.java8;

import java.util.function.Function;

public class FunctionFunctionalInterfaceMain {

	public static String generateMessage(String message) {
		return "Hello " + message;
	}

	public static void main(String[] args) {
		Function<String, String> showMessage = FunctionFunctionalInterfaceMain::generateMessage;
		String generatedMessage = showMessage.apply("Gourab!");
		System.out.println(generatedMessage);
	}

}
