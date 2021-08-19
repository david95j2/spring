package com.springBoot.www.controller;

import com.springBoot.www.task.MemberService;
import com.springBoot.www.task.dto.MemberDto;
import com.springBoot.www.task.request.body.MemberRequestBody;
import com.springBoot.www.task.request.serach.MemberSerachRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/usr/member")
public class UsrMemberController {

	private final MemberService memberService;

	@GetMapping("/join")
	public String showJoinPage() {
		return "usr/member/join";
	}

	@GetMapping("/print")
	public MemberDto showUser(@ModelAttribute MemberSerachRequest request) {
		return memberService.searchMemberInfo(request);
	}

	@PostMapping("/info")
	public String memberInfoSave(@ModelAttribute MemberRequestBody requestBody) {
		return memberService.saveMemberInfo(requestBody);
	}

	@DeleteMapping("/info")
	public String memberInfoDelete(@ModelAttribute MemberSerachRequest request) {
		return memberService.deleteMemberInfo(request);
	}

}
