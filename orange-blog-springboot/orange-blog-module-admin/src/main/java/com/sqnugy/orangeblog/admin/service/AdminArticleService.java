package com.sqnugy.orangeblog.admin.service;

import com.sqnugy.orangeblog.admin.model.vo.article.PublishArticleReqVO;
import com.sqnugy.orangeblog.common.utils.Response;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName AdminArticleService
 * @description
 * @date 2024-12-12
 */

public interface AdminArticleService {
    /**
     * 发布文章
     * @param publishArticleReqVO
     * @return
     */
    Response publishArticle(PublishArticleReqVO publishArticleReqVO);
}
