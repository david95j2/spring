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
}