package com.sqnugy.orangeblog.web.service;

import com.sqnugy.orangeblog.common.utils.Response;
import com.sqnugy.orangeblog.web.model.vo.archive.FindArchiveArticlePageListReqVO;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName ArchiveService
 * @description
 * @date 2024-12-12
 */

public interface ArchiveService {
    /**
     * 获取文章归档分页数据
     * @param findArchiveArticlePageListReqVO
     * @return
     */
    Response findArchivePageList(FindArchiveArticlePageListReqVO findArchiveArticlePageListReqVO);
}

