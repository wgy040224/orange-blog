package com.sqnugy.orangeblog.web.model.vo.article;

import com.sqnugy.orangeblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName FindIndexArticlePageListReqVO
 * @description
 * @date 2024-12-12
 */

@Data
@Builder
@ApiModel(value = "首页查询文章分页 VO")
public class FindIndexArticlePageListReqVO extends BasePageQuery {
}
