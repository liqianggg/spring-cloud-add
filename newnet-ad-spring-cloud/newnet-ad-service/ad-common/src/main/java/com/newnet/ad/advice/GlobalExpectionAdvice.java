package com.newnet.ad.advice;

import com.newnet.ad.exception.AdException;
import com.newnet.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

/**
 * @Auth liqiang
 * @Date 09:19 2019/6/15
 * @DESCRIBLE
 * @JDK ${JDK}
 */
@RestControllerAdvice
public class GlobalExpectionAdvice {
    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerExpection(HttpServletResponse response, AdException ad) {

        CommonResponse<String> commonResponse = new CommonResponse<>(-1, "bussiness Expection");
        commonResponse.setData(ad.getMessage());
        return commonResponse;
    }
}
