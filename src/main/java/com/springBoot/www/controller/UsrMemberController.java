package com.springBoot.www.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usr/member")
public class UsrMemberController {

	@GetMapping("/join")
	public String showJoinPage() {
		return "usr/member/join";
	}
}
