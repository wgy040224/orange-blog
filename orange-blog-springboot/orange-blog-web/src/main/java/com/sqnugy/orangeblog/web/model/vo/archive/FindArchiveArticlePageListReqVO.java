package com.sqnugy.orangeblog.web.model.vo.archive;

import com.sqnugy.orangeblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName FindArchiveArticlePageListReqVO
 * @description
 * @date 2024-12-12
 */
@Data
@Builder
@ApiModel(value = "文章归档分页 VO")
public class FindArchiveArticlePageListReqVO extends BasePageQuery {
}

