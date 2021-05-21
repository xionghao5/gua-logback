package com.gua.gualogback.controller;

import com.gua.gualogback.service.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final static Logger logger = LoggerFactory.getLogger(HomeController.class);
    @Autowired
    private LogService logService;

    @GetMapping("/log")
    public String log() {
        return logService.log();
    }

    @GetMapping("/logError")
    public String logError() {
        try {
            logService.logError();
        } catch (Exception e) {
            logger.error("报错",e);
        }

        return "打印报错日志";
    }
}
