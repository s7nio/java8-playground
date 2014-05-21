package com.der.basti.java8.demo.jsr310;

import java.time.Clock;
import java.time.Duration;
import java.time.Period;
import java.time.ZonedDateTime;

public class DateFoo {

	public static void main(String[] args) {
		Period period = Period.ofDays(1);

		Duration duration = Duration.ofDays(1);

		Clock systemClock = Clock.systemUTC();
		ZonedDateTime zoned = ZonedDateTime.now(systemClock);
	}
}
