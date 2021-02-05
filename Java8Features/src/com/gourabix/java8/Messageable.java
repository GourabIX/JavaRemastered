package com.gourabix.java8;

@FunctionalInterface
public interface Messageable {
	
	Message sendMessage(String message);
	
}
