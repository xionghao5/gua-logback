package com.gua.gualogback.service.impl;

import com.gua.gualogback.service.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class LogServiceImpl implements LogService {
    private final static Logger logger = LoggerFactory.getLogger(LogServiceImpl.class);
    @Override
    public String log() {
        logger.debug("logback");
        logger.info("logback");
        logger.error("logback");
        return "用logback打日志";
    }

    @Override
    public String logError() {
        throw new RuntimeException("运行时报错");
    }
}
