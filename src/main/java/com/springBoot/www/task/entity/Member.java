package com.springBoot.www.task.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Member {
	@Id
	private int id;
	private String loginId;
	private String loginPw;
	private String email;

	public Member(int id, String loginId, String loginPw, String email) {
		this.id = id;
		this.loginId = loginId;
		this.loginPw = loginPw;
		this.email = email;
	}

	public Member() {

	}
}
