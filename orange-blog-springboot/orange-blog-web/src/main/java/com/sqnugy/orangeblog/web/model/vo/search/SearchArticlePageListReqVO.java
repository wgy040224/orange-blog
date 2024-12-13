package com.sqnugy.orangeblog.web.model.vo.search;

import com.sqnugy.orangeblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName SearchArticlePageListReqVO
 * @description
 * @date 2024-12-13
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "文章搜索 VO")
public class SearchArticlePageListReqVO extends BasePageQuery {
    /**
     * 查询关键词
     */
    @NotBlank(message = "搜索关键词不能为空")
    private String word;
}
