package com.der.basti.java8.demo;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	private static List<String> names = Arrays.asList("Alpha", "Beta", "Echo");

	public static void main(String[] args) {
		java7();
		java8();
	}

	private static void java7() {
		for (String name : names) {
			System.out.println(name);
		}
	}

	private static void java8() {
		// Lambda expression
		names.stream().forEach(name -> System.out.println(name));
		// Method reference
		names.stream().forEach(System.out::println);
	}
}
