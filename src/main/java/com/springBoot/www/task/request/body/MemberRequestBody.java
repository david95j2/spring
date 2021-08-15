package com.springBoot.www.task.request.body;

import com.springBoot.www.task.entity.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberRequestBody {
    private String loginId;
    private String loginPw;
    private int id;
    private String email;

    public Member toEntity() {
        return new Member(this.id, this.loginId, this.loginPw, this.email);
    }
}
