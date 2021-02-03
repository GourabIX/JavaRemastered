package com.gourabix.java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionsExampleMain {

	public static void main(String[] args) {
		Drawable drawable = () -> {
			System.out.println("Currently drawing...");
		};

		drawable.draw();

		Sayable sayable = (name) -> {
			System.out.println("Currently saying " + name);
		};
		sayable.say("Sush, I Love You.");

		Addable addable = (n1, n2) -> (n1 + n2);
		System.out.println("Sum: " + addable.add(4, 5));

		List<String> nameList = new ArrayList<String>();
		nameList.add("Badal Sarkar");
		nameList.add("Rita Sarkar");
		nameList.add("Gourab Sarkar");
		nameList.add("Sush Sarkar");

		nameList.forEach(name -> System.out.println(name));
	}

}
