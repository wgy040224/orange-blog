package com.sqnugy.orangeblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName MybatisPlusConfig
 * @description
 * @date 2024-12-08
 */

@Configuration
@MapperScan("com.sqnugy.orangeblog.common.domain.mapper")
public class MybatisPlusConfig {
}
