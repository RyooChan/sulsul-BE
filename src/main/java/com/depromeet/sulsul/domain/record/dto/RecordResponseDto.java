package com.depromeet.sulsul.domain.record.dto;

import com.depromeet.sulsul.domain.flavor.dto.FlavorDto;
import com.depromeet.sulsul.domain.member.dto.MemberRecordDto;
import com.querydsl.core.annotations.QueryProjection;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RecordResponseDto {

  private String content;
  private Integer feel;
  private MemberRecordDto memberRecordDto;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private List<FlavorDto> flavorDtos = new ArrayList<>();

  @QueryProjection
  public RecordResponseDto(String content, MemberRecordDto memberRecordDto, Integer feel,
      List<FlavorDto> flavorDtos
      , LocalDateTime createdAt, LocalDateTime updatedAt) {
    this.content = content;
    this.feel = feel;
    this.flavorDtos = flavorDtos;
    this.memberRecordDto = memberRecordDto;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

}
