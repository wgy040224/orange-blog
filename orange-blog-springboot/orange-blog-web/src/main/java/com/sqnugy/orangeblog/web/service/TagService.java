package com.sqnugy.orangeblog.web.service;

import com.sqnugy.orangeblog.common.utils.Response;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName TagService
 * @description
 * @date 2024-12-12
 */

public interface TagService {
    /**
     * 获取标签列表
     * @return
     */
    Response findTagList();
}
