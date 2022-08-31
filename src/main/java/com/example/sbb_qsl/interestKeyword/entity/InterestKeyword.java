package com.example.sbb_qsl.interestKeyword.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InterestKeyword {

    @Id
    private String content;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterestKeyword that = (InterestKeyword) o;
        return Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }
}
