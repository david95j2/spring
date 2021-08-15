package com.springBoot.www.task;

import com.springBoot.www.task.dao.MemberDao;
import com.springBoot.www.task.dto.MemberDto;
import com.springBoot.www.task.request.body.MemberRequestBody;
import com.springBoot.www.task.request.serach.MemberSerachRequest;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberDao memberDao;

    public MemberService (MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public MemberDto searchMemberInfo(MemberSerachRequest request) {
        return new MemberDto(memberDao.findById(request.getLoginId()).orElse(null));
    }
    
    public String saveMemberInfo(MemberRequestBody requestBody) {
        memberDao.save(requestBody.toEntity());
        return "성공";
    }
}
