package com.sunego.commerce.service.superviser.log;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

/**
 * Created by fanliwei on 2015/10/17.
 */
public class LoggerManager {

    public static final Logger SERVICE_BIZ_LOG_INFO = LoggerFactory.getLogger("SERVICE_BIZ_LOG_INFO");
    public static final Logger SERVICE_BIZ_LOG_ERROR = LoggerFactory.getLogger("SERVICE_BIZ_LOG_ERROR");
    
    public static final Logger SUNEGO_BIZ_LOG_INFO = LoggerFactory.getLogger("SUNEGO_BIZ_LOG_INFO");
    public static final Logger SUNEGO_BIZ_DETAILS_LOG_INFO = LoggerFactory.getLogger("SUNEGO_BIZ_DETAILS_LOG_INFO");
    public static final Logger SUNEGO_BIZ_LOG_ERROR = LoggerFactory.getLogger("SUNEGO_BIZ_LOG_ERROR");

    public static final Logger YIG_MONEY_LOG_INFO = LoggerFactory.getLogger("YIG_MONEY_LOG_INFO");
    public static final Logger YIG_MONEY_LOG_ERROR = LoggerFactory.getLogger("YIG_MONEY_LOG_ERROR");

    public static final Logger STATIC_LOG_INFO = LoggerFactory.getLogger("STATIC_LOG_INFO");
    public static final Logger STATIC_LOG_ERROR = LoggerFactory.getLogger("STATIC_LOG_ERROR");

    public static void info(String log) {
        SERVICE_BIZ_LOG_INFO.info(log);
    }

    public static void error(String log) {
        SERVICE_BIZ_LOG_ERROR.error(log);
    }

    public static void error(String log, Throwable e) {
        SERVICE_BIZ_LOG_ERROR.error(log, e);
    }

}
