package com.newnet.ad.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.constants.ZuulConstants;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * @author  liqiang
 * @Date 08:10 2019/6/15
 * @DESCRIBLE
 * @JDK ${JDK}
 */
@Slf4j
@Component
public class PreRequestFilter extends ZuulFilter {

    /**
     * 指定过滤器类型
     * @return
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     * 定义filter的执行顺序 数字越小 级别越高
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        requestContext.set("starterTime",System.currentTimeMillis());
        return null;
}
}
