package pro.onlyou.log4j2.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 测试默认配置
 *
 * Console ---->  error
 *
 */

public class DefaultLog {

    private static Logger logger = LoggerFactory.getLogger(DefaultLog.class);
    private static Logger namedLogger = LoggerFactory.getLogger("test3xml");

    public static void main(String[] args){
        logger.debug("debug : " + logger);
        logger.error("error : " + logger);
        logger.info("info : " + logger);
        logger.trace("trace : " + logger);
        logger.warn("warn : " + logger);
        logger.error("isDebugEnable : " + logger.isDebugEnabled());
        namedLogger.debug("debug by test3xml : " + logger);
    }

}
