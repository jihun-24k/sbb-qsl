package com.example.sbb_qsl.user.repository;

import com.example.sbb_qsl.user.entity.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
}
