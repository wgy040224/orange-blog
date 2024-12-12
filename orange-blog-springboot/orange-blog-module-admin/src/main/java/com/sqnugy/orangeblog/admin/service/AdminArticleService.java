package com.sqnugy.orangeblog.admin.service;

import com.sqnugy.orangeblog.admin.model.vo.article.DeleteArticleReqVO;
import com.sqnugy.orangeblog.admin.model.vo.article.FindArticleDetailReqVO;
import com.sqnugy.orangeblog.admin.model.vo.article.PublishArticleReqVO;
import com.sqnugy.orangeblog.admin.model.vo.article.UpdateArticleReqVO;
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

    /**
     * 删除文章
     * @param deleteArticleReqVO
     * @return
     */
    Response deleteArticle(DeleteArticleReqVO deleteArticleReqVO);

    /**
     * 查询文章详情
     * @param findArticleDetailReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticleDetailReqVO);

    /**
     * 更新文章
     * @param updateArticleReqVO
     * @return
     */
    Response updateArticle(UpdateArticleReqVO updateArticleReqVO);
}

