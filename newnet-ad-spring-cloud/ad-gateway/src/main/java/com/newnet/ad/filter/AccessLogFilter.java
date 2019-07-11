package com.newnet.ad.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auth liqiang
 * @Date 08:18 2019/6/15
 * @DESCRIBLE
 * @JDK ${JDK}
 */
@Slf4j
@Component
public class AccessLogFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.SEND_RESPONSE_FILTER_ORDER-1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext rct = RequestContext.getCurrentContext();
        HttpServletRequest request = rct.getRequest();
        final Long starterTime = (Long) rct.get("starterTime");
        final String requestURI = request.getRequestURI();
        Long duration = System.currentTimeMillis()-starterTime;
        log.info("uri:  {} duration: {}ms",requestURI,duration/1000);
        return null;
    }
}
