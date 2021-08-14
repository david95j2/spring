package com.springBoot.www.task.dao;

import com.springBoot.www.task.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberDao extends JpaRepository<Member, String> {
}
