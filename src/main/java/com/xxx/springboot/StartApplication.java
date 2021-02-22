package com.xxx.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Auther:嘻嘻
 * @Date:2021/2/21 - 02 - 21 - 21:48
 * @Description:com.xxx.springboot
 * @version:v1.0.0
 */

@SpringBootApplication
public class StartApplication extends SpringBootServletInitializer {

    private static Logger logger = LoggerFactory.getLogger(StartApplication.class);

    public static void main(String[] args) {
        logger.info("开始启动");

        SpringApplication app = new SpringApplication(StartApplication.class);
        //关闭banner图标
        app.setBannerMode(Banner.Mode.OFF);
        app.run();
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(StartApplication.class);
    }
}
