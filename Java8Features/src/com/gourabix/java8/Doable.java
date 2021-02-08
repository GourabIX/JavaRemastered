package com.gourabix.java8;

public interface Doable {
	
	default void doIt() {
		System.out.println("Doing it!");
	}

}
