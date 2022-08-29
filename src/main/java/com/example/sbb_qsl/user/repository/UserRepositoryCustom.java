package com.example.sbb_qsl.user.repository;

import com.example.sbb_qsl.user.entity.SiteUser;

public interface UserRepositoryCustom {
    SiteUser getQslUser(Long id);
    long getQslCount();

    SiteUser getQslUserOrderByIdAscOne();
}
