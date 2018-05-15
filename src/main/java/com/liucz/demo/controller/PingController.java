package com.liucz.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping
    public String ping(){

        String ping = "多数据源程序 - jdk1.7 + mysql 版本";
        logger.info(ping);
        return ping;

    }


}
