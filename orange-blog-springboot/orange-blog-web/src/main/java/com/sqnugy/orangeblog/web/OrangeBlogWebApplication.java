package com.sqnugy.orangeblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.sqnugy.orangeblog.*"}) // 多模块项目中，必需手动指定扫描 com.sqnugy.orangeblog 包下面的所有类
public class OrangeBlogWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrangeBlogWebApplication.class, args);
    }

}
