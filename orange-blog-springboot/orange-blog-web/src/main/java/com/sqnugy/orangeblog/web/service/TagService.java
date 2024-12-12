package com.sqnugy.orangeblog.web.service;

import com.sqnugy.orangeblog.common.utils.Response;
import com.sqnugy.orangeblog.web.model.vo.tag.FindTagArticlePageListReqVO;

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

    /**
     * 获取标签下文章分页列表
     * @param findTagArticlePageListReqVO
     * @return
     */
    Response findTagPageList(FindTagArticlePageListReqVO findTagArticlePageListReqVO);
}
