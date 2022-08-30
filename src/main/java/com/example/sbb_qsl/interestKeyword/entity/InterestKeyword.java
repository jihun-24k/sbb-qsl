package com.example.sbb_qsl.interestKeyword.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InterestKeyword {

    @Id
    private String content;
}
