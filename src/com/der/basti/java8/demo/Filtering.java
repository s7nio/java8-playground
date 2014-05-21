package com.der.basti.java8.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// sequential
//		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0)
//				.collect(Collectors.toList());
		
		// parallel
		List<Integer> evenNumbers = numbers.parallelStream().filter(n -> n % 2 == 0)
				.collect(Collectors.toList());

		System.out.println(evenNumbers);
	}
}
