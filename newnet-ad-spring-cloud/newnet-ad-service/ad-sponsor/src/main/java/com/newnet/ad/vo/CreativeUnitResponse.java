package com.newnet.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Auth liqiang
 * @Date 09:47 2019/6/16
 * @DESCRIBLE
 * @JDK ${JDK}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreativeUnitResponse {
    private List<Long> ids;
}
