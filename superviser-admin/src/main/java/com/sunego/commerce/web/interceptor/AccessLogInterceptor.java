package com.sunego.commerce.web.interceptor;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AccessLogInterceptor extends HandlerInterceptorAdapter {

    private static final ThreadLocal<Long> START_TIME = new ThreadLocal<>();

    private static final Logger LOGGER = LoggerFactory.getLogger("SV_ACCESS_LOG");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        START_TIME.set(System.currentTimeMillis());
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        StringBuilder builder = new StringBuilder();
        builder.append(request.getRemoteAddr()).append("|");
        builder.append(addUser());
        builder.append(request.getRequestURI()).append("|");

        Enumeration<?> names = request.getParameterNames();
        while (names.hasMoreElements()) {
            String name = (String) names.nextElement();
            String value = request.getParameter(name);
            builder.append(name).append("=").append(value).append("&");
        }

        if (builder.length() > request.getRequestURI().length() + 1) {
            builder = builder.deleteCharAt(builder.length() - 1);
        } else {
            builder.append("-");
        }

        builder.append("|").append(null == ex ? "success" : "error").append("|")
                .append(null == ex ? "-" : ex.getMessage());

        Long start = START_TIME.get();
        if (null == start) {
            start = System.currentTimeMillis();
        }
        builder.append("|").append(System.currentTimeMillis() - start);
        LOGGER.info(builder.toString());
    }

    private String addUser() {
        StringBuilder builder = new StringBuilder();
        builder.append("role=tourist").append("|");
        return builder.toString();
    }
}
