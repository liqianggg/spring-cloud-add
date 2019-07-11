package com.newnet.ad.constant;

import lombok.Getter;

/**
 * @Auth liqiang
 * @Date 13:27 2019/6/15
 * @DESCRIBLE
 * @JDK ${JDK}
 */
@Getter
public enum CommonStatus {
    VALID(1, "有效状态"),
    INVALID(2, "无效的状态");
    private Integer status;
    private String value;

    CommonStatus(Integer status, String value) {
        this.status = status;
        this.value = value;
    }
}
