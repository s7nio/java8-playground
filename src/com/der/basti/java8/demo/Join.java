package com.der.basti.java8.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Join {

	private static Collection<String> names = Arrays.asList("Alpha", "Beta",
			"Echo");

	public static void main(String[] args) {
		java7();
		java8();
	}

	private static void java7() {
		StringBuilder sb = new StringBuilder();

		// boolean comma = false;
		// for (String name : names) {
		// if (comma) {
		// sb.append(',');
		// }
		// sb.append(name);
		// comma = true;
		// }
		
		Iterator<String> ite = names.iterator();
		while (ite.hasNext()){
			sb.append(ite.next());
			if(ite.hasNext()) {
				sb.append(',');
			}
		}

		System.out.println(sb.toString());
	}

	private static void java8() {
		String csv = String.join(",", names);
		System.out.println(csv);
	}
}
