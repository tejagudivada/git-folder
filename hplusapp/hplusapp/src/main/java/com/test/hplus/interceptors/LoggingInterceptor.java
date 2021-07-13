package com.test.hplus.interceptors;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoggingInterceptor extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        String sessionId=null;
        if(null!=request.getCookies()){
            for(Cookie cookie:request.getCookies()){
                if("JSESSIONID".equals(cookie.getName())){
                    sessionId=cookie.getValue();
                }
            }
        }
        return true;
    }
}
