package com.sqnugy.orangeblog.web.service;

import com.sqnugy.orangeblog.common.utils.Response;
import com.sqnugy.orangeblog.web.model.vo.category.FindCategoryArticlePageListReqVO;
import com.sqnugy.orangeblog.web.model.vo.category.FindCategoryListReqVO;

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
    Response findCategoryList(FindCategoryListReqVO findCategoryListReqVO);

    /**
     * 获取分类下文章分页数据
     * @param findCategoryArticlePageListReqVO
     * @return
     */
    Response findCategoryArticlePageList(FindCategoryArticlePageListReqVO findCategoryArticlePageListReqVO);
}

