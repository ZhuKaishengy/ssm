package com.aisino.test;

import java.util.UUID;

import org.junit.Test;

public class TestRandomNumber {

	//772a7ebd-99f2-4263-8b82-4997e2fd94b9(36)
	@Test
	public void testUUID(){
		String str = UUID.randomUUID().toString();
		System.out.println(str);
	}
}
