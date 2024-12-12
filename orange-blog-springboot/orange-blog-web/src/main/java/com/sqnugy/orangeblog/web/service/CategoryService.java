package com.sqnugy.orangeblog.web.service;

import com.sqnugy.orangeblog.common.utils.Response;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName CategoryService
 * @description
 * @date 2024-12-12
 */

public interface CategoryService {
    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList();
}

