package com.springBoot.www;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("특수 테스트\uD83D\\uDE00")
class ApplicationTests {
	
	private int sum;
	
	@Test
	@DisplayName("첫번째 테스트")
	void contextLoads() {
		//given
		sum = 1;
		
		//when
		assertFalse(true, "Exception!!");

		//then

	}

}
