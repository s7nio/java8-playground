package com.der.basti.java8.demo.jsr310;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class NextFriday {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();

        LocalDate nextFriday13th = now.with(temporal -> {
            LocalDate localDate = LocalDate.from(temporal);
            if (localDate.getDayOfMonth() > 13) {
                localDate = localDate.plusMonths(1);
            }
            localDate = localDate.withDayOfMonth(13);
            while (!localDate.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                localDate = localDate.plusMonths(1);
            }
            return localDate;
        });

        System.out.println(nextFriday13th);
	}
}
