package com.zerocm.jdcheckin.component;

import com.zerocm.jdcheckin.service.CheckIn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @功能:
 * @项目名:jdcheckin
 * @作者:0cm
 * @日期:2020/3/302:15 下午
 */
@Component
public class TaskApplication implements ApplicationRunner {

    private final static Logger logger = LoggerFactory.getLogger(TaskApplication.class);

    @Autowired
    private CheckIn checkIn;

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
