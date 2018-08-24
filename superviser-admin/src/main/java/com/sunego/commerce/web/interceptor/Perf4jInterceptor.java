/**
 * Copyright (c) 2016,sunnybs. 
 * All Rights Reserved.
 * 
 * Project Name:yigou
 * Package Name:net.shopxx.interceptor
 * File Name:Perf4jInterceptor.java
 * Date:2016年8月23日 下午2:59:19
 * 
 */
package com.sunego.commerce.web.interceptor;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.perf4j.StopWatch;
import org.perf4j.slf4j.Slf4JStopWatch;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import com.google.common.base.Joiner;

/**
 * ClassName: Perf4jInterceptor <br/>
 * Description: 性能监控拦截器 <br/>
 * Date: 2016年8月23日 下午2:59:19 <br/>
 * <br/>
 * 
 * @author jackial(邮箱)
 * 
 *         修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

@Component("perf4jInterceptor")
public class Perf4jInterceptor implements MethodBeforeAdvice, AfterReturningAdvice {

    private Map<String, StopWatch> watches = new HashMap<>();

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        String completeMethodName = getCompleteMethodName(target, method);

        // 创建性能日志记录器
        StopWatch stopWatch;
        if (watches.containsKey(completeMethodName)) {
            stopWatch = watches.get(completeMethodName);
            stopWatch.start();
        } else {
            stopWatch = new Slf4JStopWatch(completeMethodName, Arrays.toString(args));
            watches.put(completeMethodName, stopWatch);
        }

    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        String completeMethodName = getCompleteMethodName(target, method);
        // 记录性能
        if (watches.containsKey(completeMethodName)) {
            StopWatch stopWatch = watches.get(completeMethodName);
            stopWatch.stop();
        }
    }

    /**
     * 根据目标对象与方法获取方法完整名称.
     * 
     * @param target
     *            目标对象
     * @param method
     *            方法
     * @return 方法完整名称
     */
    private String getCompleteMethodName(Object target, Method method) {
        String className = "";
        if (target != null) {
            className = target.toString();
            int loc = className.indexOf('@');
            if (loc >= 0) {
                className = className.substring(0, loc);
            }
        }
        return Joiner.on("").join(className, ".", method.getName());
    }

}
