package com.example.sbb_qsl.interestKeyword.entity;

import com.example.sbb_qsl.user.entity.SiteUser;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@IdClass(InterestKeywordId.class)
public class InterestKeyword {

    @Id
    @ManyToOne
    @EqualsAndHashCode.Include
    private SiteUser user;

    @Id
    @EqualsAndHashCode.Include
    private String content;
}
