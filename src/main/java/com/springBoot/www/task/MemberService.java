package com.springBoot.www.task;

import com.springBoot.www.task.dao.MemberDao;
import com.springBoot.www.task.dto.MemberDto;
import com.springBoot.www.task.request.body.MemberRequestBody;
import com.springBoot.www.task.request.serach.MemberSerachRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberDao memberDao;

    public MemberDto searchMemberInfo(MemberSerachRequest request) {
        return new MemberDto(memberDao.findById(request.getLoginId()).orElse(null));
    }
    
    public String saveMemberInfo(MemberRequestBody requestBody) {
        memberDao.save(requestBody.toEntity());
        return "저장이 완료되었습니다.";
    }

    public String deleteMemberInfo(MemberSerachRequest request) {
        memberDao.deleteById(request.getLoginId());
        return "삭제가 완료되었습니다.";
    }
}
