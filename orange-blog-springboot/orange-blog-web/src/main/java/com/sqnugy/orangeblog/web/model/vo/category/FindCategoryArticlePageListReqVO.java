package com.sqnugy.orangeblog.web.model.vo.category;

import com.sqnugy.orangeblog.common.model.BasePageQuery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName FindCategoryArticlePageListReqVO
 * @description
 * @date 2024-12-12
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindCategoryArticlePageListReqVO extends BasePageQuery {
    /**
     * 分类 ID
     */
    @NotNull(message = "分类 ID 不能为空")
    private Long id;

}

