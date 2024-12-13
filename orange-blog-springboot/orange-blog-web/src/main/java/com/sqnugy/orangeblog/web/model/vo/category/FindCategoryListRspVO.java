package com.sqnugy.orangeblog.web.model.vo.category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName FindCategoryListRspVO
 * @description
 * @date 2024-12-12
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindCategoryListRspVO {
    private Long id;
    private String name;
    private Integer articlesTotal;
}

