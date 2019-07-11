package com.newnet.ad.service;

import com.newnet.ad.entity.AdPlan;
import com.newnet.ad.exception.AdException;
import com.newnet.ad.vo.AdPlanGetRequest;
import com.newnet.ad.vo.AdPlanRequest;
import com.newnet.ad.vo.AdPlanResponse;

import java.util.List;

/**
 * @Auth liqiang
 * @Date 21:40 2019/6/15
 * @DESCRIBLE
 * @JDK ${JDK}
 */
public interface IAdPlanService {
    /**
     * <h2>创建推广计划</h2>
     * */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>获取推广计划</h2>
     * */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * <h2>更新推广计划</h2>
     * */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>删除推广计划</h2>
     * */
    void deleteAdPlan(AdPlanRequest request) throws AdException;
}
