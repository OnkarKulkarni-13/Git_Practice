package com.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		assertEquals("avaJ", new ReverseString().reverseString("Java"));
	}

}
