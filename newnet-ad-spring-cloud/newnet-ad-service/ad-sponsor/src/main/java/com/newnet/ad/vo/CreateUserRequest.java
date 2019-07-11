package com.newnet.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

/**
 * @Auth liqiang
 * @Date 18:44 2019/6/15
 * @DESCRIBLE
 * @JDK ${JDK}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {

    private String userName;

    public boolean validate(){
        return !StringUtils.isEmpty(userName);
    }
}
