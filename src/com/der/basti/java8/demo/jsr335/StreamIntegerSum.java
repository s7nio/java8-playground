package com.der.basti.java8.demo.jsr335;

import java.util.Arrays;
import java.util.stream.LongStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class StreamIntegerSum {

	private static int N = Integer.getInteger("benchmark.n", 100000);

	private int[] array;
	private int length = N;

	@Before
	public void setUp() {
		array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = 3 * i;
		}
	}

	/**
	 * Wait method ;)
	 * 
	 * @return value
	 */
	private int loop() {
		int r = 0;
		for (int i : array) {
			r += i * 5;
		}
		return r;
	}

	@Test
	public void run() {
		StreamIntegerSum run = new StreamIntegerSum();
		run.setUp();
		// TODO time
		Assert.assertEquals(1984805968, run.sequential());
		Assert.assertEquals(1984805968, run.parallel());
		loop();
		Assert.assertEquals(333328333350000l, run.mapReduce());
	}

	public int sequential() {
		return Arrays.stream(array).map(e -> e * 5).sum();
	}

	public int parallel() {
		return Arrays.stream(array).parallel().map(e -> e * 5).sum();
	}

	public long mapReduce() {
		return LongStream.range(0, N).parallel().map(i -> i * i)
				.reduce(0, (l, r) -> l + r);
	}
}
