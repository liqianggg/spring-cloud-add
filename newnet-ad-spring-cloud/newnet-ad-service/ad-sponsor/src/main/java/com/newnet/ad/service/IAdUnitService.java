package com.newnet.ad.service;

import com.newnet.ad.exception.AdException;
import com.newnet.ad.vo.*;

/**
 * @Auth liqiang
 * @Date 09:37 2019/6/16
 * @DESCRIBLE
 * @JDK ${JDK}
 */
public interface IAdUnitService {
    AdUnitResponse createUnit(AdUnitRequest adUnitRequest) throws AdException;

    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request)
            throws AdException;

    AdUnitItResponse createUnitIt(AdUnitItRequest request)
            throws AdException;

    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request)
            throws AdException;

    CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request)
            throws AdException;
}
