package com.sqnugy.orangeblog.web.service;

import com.sqnugy.orangeblog.common.utils.Response;
import com.sqnugy.orangeblog.web.model.vo.search.SearchArticlePageListReqVO;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName SearchService
 * @description
 * @date 2024-12-13
 */

public interface SearchService {

    /**
     * 关键词分页搜索
     * @param searchArticlePageListReqVO
     * @return
     */
    Response searchArticlePageList(SearchArticlePageListReqVO searchArticlePageListReqVO);
}
