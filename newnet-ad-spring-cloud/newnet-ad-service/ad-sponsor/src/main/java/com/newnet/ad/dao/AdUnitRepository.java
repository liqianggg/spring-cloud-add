package com.newnet.ad.dao;

import com.newnet.ad.entity.AdUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auth liqiang
 * @Date 18:35 2019/6/15
 * @DESCRIBLE
 * @JDK ${JDK}
 */
public interface AdUnitRepository extends JpaRepository<AdUnit, Long> {

    AdUnit findByPlanIdAndUnitName(Long planId, String unitName);

    List<AdUnit> findAllByUnitStatus(Integer unitStatus);
}
