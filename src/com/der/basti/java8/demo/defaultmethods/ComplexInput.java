package com.der.basti.java8.demo.defaultmethods;

public interface ComplexInput extends SimpleInput {

	public void qux();

	@Override
	public default void bar() {
		// some complex
	}
}
