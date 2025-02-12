package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {

    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping
    public String logExample() {
        logger.trace("TRACE 로그 메시지");
        logger.debug("DEBUG 로그 메시지");
        logger.info("INFO 로그 메시지");
        logger.warn("WARN 로그 메시지");
        logger.error("ERROR 로그 메시지");
        return "로그가 출력되었습니다.";
    }
}
