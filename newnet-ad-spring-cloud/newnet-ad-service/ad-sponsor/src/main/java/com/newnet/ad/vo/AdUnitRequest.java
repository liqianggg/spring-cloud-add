package com.newnet.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

/**
 * @Auth liqiang
 * @Date 09:37 2019/6/16
 * @DESCRIBLE
 * @JDK ${JDK}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitRequest {

    private Long planId;
    private String unitName;
    private Integer positionType;
    private Long budget;

    public boolean createValidate() {

        return null != planId && !StringUtils.isEmpty(unitName)
                && positionType != null && budget != null;
    }
}
