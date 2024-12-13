package com.sqnugy.orangeblog.web.controller;

import com.sqnugy.orangeblog.common.aspect.ApiOperationLog;
import com.sqnugy.orangeblog.common.utils.Response;
import com.sqnugy.orangeblog.web.model.vo.search.SearchArticlePageListReqVO;
import com.sqnugy.orangeblog.web.service.SearchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName SearchController
 * @description
 * @date 2024-12-13
 */

@RestController
@Api(tags = "搜索")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @PostMapping("/article/search")
    @ApiOperation(value = "文章搜索")
    @ApiOperationLog(description = "文章搜索")
    public Response searchArticlePageList(@RequestBody @Validated SearchArticlePageListReqVO searchArticlePageListReqVO) {
        return searchService.searchArticlePageList(searchArticlePageListReqVO);
    }

}
