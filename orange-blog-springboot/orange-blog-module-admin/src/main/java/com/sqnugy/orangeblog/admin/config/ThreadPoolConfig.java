package com.sqnugy.orangeblog.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName ThreadPoolConfig
 * @description
 * @date 2024-12-13
 */

@Configuration
@EnableAsync
public class ThreadPoolConfig {

    @Bean
    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10); // 核心线程数
        executor.setMaxPoolSize(20); // 最大线程数
        executor.setQueueCapacity(100); // 队列容量
        executor.setThreadNamePrefix("WeblogThreadPool-"); // 线程名前缀
        executor.initialize();
        return executor;
    }

}
