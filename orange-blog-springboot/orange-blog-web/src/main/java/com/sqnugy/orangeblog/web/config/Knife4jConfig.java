package com.sqnugy.orangeblog.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName Knife4jConfig
 * @description  Knife4j 配置
 * <p>
 * 本类用于配置 Knife4j 和 Swagger2 的集成，以生成 RESTful API 文档。
 * </p>
 * <p><strong>功能概述：</strong></p>
 * <ul>
 *     <li>通过 {@code @Configuration} 注解标记为 Spring 配置类。</li>
 *     <li>启用 Swagger2 Web MVC 支持，以便自动生成 API 文档。</li>
 *     <li>定义了一个名为 "webApi" 的 Docket Bean，用于配置 API 文档的细节。</li>
 *     <li>构建并返回 API 信息（如标题、描述、联系人等）。</li>
 * </ul>
 * @date 2024-12-07
 */

@Configuration
@EnableSwagger2WebMvc
@Profile("dev") // 只在 dev 环境中开启
public class Knife4jConfig {

    @Bean("webApi")
    public Docket createApiDoc() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                // 分组名称
                .groupName("Web 前台接口")
                .select()
                // 这里指定 Controller 扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.sqnugy.orangeblog.web.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }

    /**
     * 构建 API 信息
     * @return
     */
    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title("OrangeBlog 博客前台接口文档") // 标题
                .description("OrangeBlog 是一款由 Spring Boot + Vue 3.2 + Vite 4.3 开发的前后端分离博客。") // 描述
                .termsOfServiceUrl("null") // API 服务条款
                .contact(new Contact("sqnugy", "null", "1582316589@qq.com")) // 联系人
                .version("1.0") // 版本号
                .build();
    }
}