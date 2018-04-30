package com.domain.common.controller;

import com.domain.common.util.aop.LoggingAspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.io.IOException;

/**
 * Created by zjz on 2017/4/7.
 */
@Controller
public class InitResourceController {
    private static final Logger logger = LoggerFactory.getLogger(InitResourceController.class);

    //启动服务器 初始化
    @PostConstruct
    private void init() throws Exception {
        System.out.println("InitController.init()");
    }
}
