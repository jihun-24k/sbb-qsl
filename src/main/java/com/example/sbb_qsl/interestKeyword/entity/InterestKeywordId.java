package com.example.sbb_qsl.interestKeyword.entity;

import com.example.sbb_qsl.user.entity.SiteUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterestKeywordId implements Serializable {
    private SiteUser user;
    private String content;
}