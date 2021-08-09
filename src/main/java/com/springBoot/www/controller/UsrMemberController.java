package com.springBoot.www.controller;

import com.springBoot.www.task.MemberService;
import com.springBoot.www.task.request.serach.MemberSerachRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usr/member")
public class UsrMemberController {

	private final MemberService memberService;

	public UsrMemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	@GetMapping("/join")
	public String showJoinPage() {
		return "usr/member/join";
	}

	@GetMapping("/usr/print")
	public String showUser(@ModelAttribute MemberSerachRequest request) {
		return memberService.showUser(request);
	}
}
