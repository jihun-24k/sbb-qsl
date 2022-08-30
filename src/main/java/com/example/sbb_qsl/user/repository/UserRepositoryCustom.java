package com.example.sbb_qsl.user.repository;

import com.example.sbb_qsl.user.entity.SiteUser;

import java.util.List;

public interface UserRepositoryCustom {
    SiteUser getQslUser(Long id);
    long getQslCount();

    SiteUser getQslUserOrderByIdAscOne();

    List<SiteUser> getQslUsersOrderByIdAsc();

    List<SiteUser> searchQsl(String user1);
}
