package com.springBoot.www.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class UsrHomeControllerTest {
	
	@BeforeAll
	static void setup() {
	    log.info("@BeforeAll - executes once before all test methods in this class");
	}
	@BeforeEach
	void init() {
	    log.info("@BeforeEach - executes before each test method in this class");
	}
}
