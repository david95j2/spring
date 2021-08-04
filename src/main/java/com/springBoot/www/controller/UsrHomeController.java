package com.springBoot.www.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class UsrHomeController {

	@GetMapping("/main")
	public String showMain() {
		return "메인페이지 테스팅";
	}
}
