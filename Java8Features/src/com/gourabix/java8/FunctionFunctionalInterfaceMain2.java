package com.gourabix.java8;

public class FunctionFunctionalInterfaceMain2 implements Sayable2 {

	public static void main(String[] args) {
		FunctionFunctionalInterfaceMain2 functionalInterfaceMain2 = new FunctionFunctionalInterfaceMain2();
		System.out.println(functionalInterfaceMain2.sayIt("Naughty bear!"));
		functionalInterfaceMain2.doIt();
	}

	@Override
	public String sayIt(String message) {
		return "Hello there ? " + message;
	}

}
