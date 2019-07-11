package com.newnet.ad.dao;

import com.newnet.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auth liqiang
 * @Date 14:16 2019/6/15
 * @DESCRIBLE
 * @JDK ${JDK}
 */
public interface AdUserRepository extends JpaRepository<AdUser, Long> {

    /**
     * <h2>根据用户名查找用户记录</h2>
     */
    AdUser findByUsername(String username);
}
