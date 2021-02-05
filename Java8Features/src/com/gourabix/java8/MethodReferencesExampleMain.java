package com.gourabix.java8;

public class MethodReferencesExampleMain {
	
	public static void sayHello() {
		System.out.println("Hello there, Naughty bear!");
	}
	
	public static void main(String[] args) {
		Drawable drawable = MethodReferencesExampleMain::sayHello;
		drawable.draw();
	}

}
