package com.springBoot.www.task.request.body;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberRequestBody {
    private String loginId;
    private String loginPw;
    private int age;
    private String email;
}
