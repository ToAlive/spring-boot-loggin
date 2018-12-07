package com.example.springbootloggin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootLogginApplicationTests {

    //日志记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
        //日志的级别，由低到高
        //可以跳转输入的日志级别，日志就只会在这个级别及更高的级别输出
        logger.trace("跟踪框架轨迹信息");
        logger.debug("调试信息");
        //spring boot默认的日志级别是info的，可以在配置文件中指定日志输出级别
        logger.info("自定义信息");
        logger.warn("警告信息");
        logger.error("错误信息");
    }

}
