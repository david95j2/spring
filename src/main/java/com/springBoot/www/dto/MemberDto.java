package com.springBoot.www.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MemberDto {
	private final String loginId;
	private final String loginPw;
}
