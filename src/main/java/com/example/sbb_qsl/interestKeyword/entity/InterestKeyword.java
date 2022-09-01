package com.example.sbb_qsl.interestKeyword.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class InterestKeyword {

    @Id
    @EqualsAndHashCode.Include
    private String content;
}
