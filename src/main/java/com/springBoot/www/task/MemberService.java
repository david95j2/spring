package com.springBoot.www.task;

import com.springBoot.www.task.request.serach.MemberSerachRequest;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    public String showUser(MemberSerachRequest request) {
        return "LoginId : " + request.getLoginId() + " \n"
                + "LoginPw : " + request.getLoginPw() + " \n"
                + "Id : " + request.getId() + " \n"
                + "Email : " + request.getEmail() + " \n";
    }
}
