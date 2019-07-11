package com.newnet.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Auth liqiang
 * @Date 21:36 2019/6/15
 * @DESCRIBLE
 * @JDK ${JDK}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdPlanGetRequest {
    private Long userId;
    private List<Long> ids;
    public boolean validate() {
        return userId != null && !CollectionUtils.isEmpty(ids);
    }
}
