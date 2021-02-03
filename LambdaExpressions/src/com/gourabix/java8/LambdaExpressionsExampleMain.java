package com.gourabix.java8;

public class LambdaExpressionsExampleMain {

	public static void main(String[] args) {
		Drawable drawable = () -> {
			System.out.println("Currently drawing...");
		};

		drawable.draw();
	}

}
