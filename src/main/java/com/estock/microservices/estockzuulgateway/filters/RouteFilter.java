package com.estock.microservices.estockzuulgateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


public class RouteFilter  extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.ROUTE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run()  {
        System.out.println("Inside Route Filter");
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        System.out.println("Inside Pre Filter,Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
        System.out.println("Inside Pre Filter,Request AuthType : " + request.getAuthType() + " Request  : " + request.getHeader("authorization"));

        return null;
    }
}
