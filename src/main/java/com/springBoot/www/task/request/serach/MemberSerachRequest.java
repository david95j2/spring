package com.springBoot.www.task.request.serach;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberSerachRequest {

    private int id;
    private String loginId;
    private String loginPw;
    private String email;
}
