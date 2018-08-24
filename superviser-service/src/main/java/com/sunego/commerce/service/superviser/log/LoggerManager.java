package com.sunego.commerce.service.superviser.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by fanliwei on 2015/10/17.
 */
public class LoggerManager {

    private LoggerManager() {

    }

    public static final Logger SV_BIZ_LOG_INFO = LoggerFactory.getLogger("SV_BIZ_LOG_INFO");
    public static final Logger SV_BIZ_LOG_ERROR = LoggerFactory.getLogger("SV_BIZ_LOG_ERROR");

    public static void info(String log) {
        SV_BIZ_LOG_INFO.info(log);
    }

    public static void error(String log) {
        SV_BIZ_LOG_ERROR.error(log);
    }

    public static void error(String log, Throwable e) {
        SV_BIZ_LOG_ERROR.error(log, e);
    }

}
