package com.sqnugy.orangeblog.admin.service;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName AdminStatisticsService
 * @description
 * @date 2024-12-13
 */

public interface AdminStatisticsService {

    /**
     * 统计各分类下文章总数
     */
    void statisticsCategoryArticleTotal();

    /**
     * 统计各标签下文章总数
     */
    void statisticsTagArticleTotal();

}