package com.sqnugy.orangeblog.web.service;

import com.sqnugy.orangeblog.common.utils.Response;
import com.sqnugy.orangeblog.web.model.vo.article.FindArticleDetailReqVO;
import com.sqnugy.orangeblog.web.model.vo.article.FindIndexArticlePageListReqVO;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName ArticleService
 * @description
 * @date 2024-12-12
 */

public interface ArticleService {
    /**
     * 获取首页文章分页数据
     * @param findIndexArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindIndexArticlePageListReqVO findIndexArticlePageListReqVO);

    /**
     * 获取文章详情
     * @param findArticleDetailReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticleDetailReqVO);
}

