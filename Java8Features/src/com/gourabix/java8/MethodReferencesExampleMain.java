package com.gourabix.java8;

public class MethodReferencesExampleMain {
	
	public static void sayHello() {
		System.out.println("Hello there, Naughty bear!");
	}
	
	public void drawHelloDifferently() {
		System.out.println("Hello there! This is an instance method.");
	}
	
	public static void main(String[] args) {
		Drawable drawable = MethodReferencesExampleMain::sayHello;
		drawable.draw();
		
		Drawable drawable2 = new MethodReferencesExampleMain()::drawHelloDifferently;
		drawable2.draw();
		
		Messageable messageable =  Message::new;
		messageable.sendMessage("Missing you!");
	}

}
