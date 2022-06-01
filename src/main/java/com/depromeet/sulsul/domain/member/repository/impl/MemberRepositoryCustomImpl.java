package com.depromeet.sulsul.domain.member.repository.impl;

import com.depromeet.sulsul.domain.member.dto.MemberDto;
import com.depromeet.sulsul.domain.member.dto.QMemberDto;
import com.depromeet.sulsul.domain.member.entity.QMember;
import com.depromeet.sulsul.domain.member.repository.MemberRepositoryCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import static com.depromeet.sulsul.domain.member.entity.QMember.member;

@RequiredArgsConstructor
public class MemberRepositoryCustomImpl implements MemberRepositoryCustom {

  private final JPAQueryFactory queryFactory;

  @Override
  public MemberDto selectById(long id) {
    return queryFactory
        .select(new QMemberDto(member.id, member.role.stringValue(), member.email, member.name, member.profileUrl, member.phoneNumber))
        .from(member)
        .where(member.id.eq(id))
        .fetchOne();
  }
}
