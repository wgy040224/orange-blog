package com.sqnugy.orangeblog.admin.runner;

import com.sqnugy.orangeblog.admin.service.AdminStatisticsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName StatisticsCategoryArticleTotalRunner
 * @description
 * @date 2024-12-13
 */

@Component
@Slf4j
public class StatisticsCategoryArticleTotalRunner implements CommandLineRunner {

    @Autowired
    private AdminStatisticsService statisticsService;

    @Override
    @Async("threadPoolTaskExecutor")
    public void run(String... args) throws Exception {
        log.info("==> 开始统计各分类下文章数量...");
        statisticsService.statisticsCategoryArticleTotal();
        log.info("==> 结束统计各分类下文章数量...");
    }
}
