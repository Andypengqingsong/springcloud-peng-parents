package com.peng.api.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 彭青松
 * @project xtone-framework
 * @company 成都信通信息技术有限公司
 * @date 2019/3/18 18:16
 * @description 描述当前类的用途
 */
@Component
public class MyFilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public String filterType() {

        return "pre";
    }

    //过滤器的执行顺序
    @Override
    public int filterOrder() {
        return 0;
    }

    //表示过滤器是否生效
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        log.info(request.getMethod() + request.getRequestURI());
        String token = request.getParameter("token");
        if (token == null) {
            log.warn("this token is noull");
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            try {
                currentContext.getResponse().getWriter().write("token is empty");
            } catch (Exception e) {
            }
        }
        log.info("ok");
        return null;

    }
}
