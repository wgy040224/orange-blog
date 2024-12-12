package com.sqnugy.orangeblog.web.service;

import com.sqnugy.orangeblog.common.utils.Response;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName BlogSettingsService
 * @description
 * @date 2024-12-12
 */

public interface BlogSettingsService {
    /**
     * 获取博客设置信息
     * @return
     */
    Response findDetail();
}

