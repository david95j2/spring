package com.springBoot.www.task.dto;

import com.springBoot.www.task.entity.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {
    private String loginId;
    private String loginPw;
    private int id;
    private String email;

    public MemberDto(Member entity) {
        this.id = entity.getId();
        this.loginId = entity.getLoginId();
        this.loginPw = entity.getLoginPw();
        this.email = entity.getEmail();
    }
}
