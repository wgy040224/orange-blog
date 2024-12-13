package com.sqnugy.orangeblog.admin.service;

import com.sqnugy.orangeblog.common.utils.Response;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName AdminDashboardService
 * @description
 * @date 2024-12-13
 */

public interface AdminDashboardService {

    /**
     * 获取仪表盘基础统计信息
     * @return
     */
    Response findDashboardStatistics();
}
