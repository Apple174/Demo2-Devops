package com.example.demo;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo2ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void test1() {
		assertTrue("Devops"=="Devops");
	}

}
