package com.sqnugy.orangeblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan({"com.sqnugy.orangeblog.*"}) // 多模块项目中，必需手动指定扫描 com.sqnugy.orangeblog 包下面的所有类
@EnableScheduling //启用定时任务
public class OrangeBlogWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrangeBlogWebApplication.class, args);
    }

}
