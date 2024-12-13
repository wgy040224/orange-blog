package com.sqnugy.orangeblog.web.model.vo.category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName FindCategoryListReqVO
 * @description
 * @date 2024-12-13
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindCategoryListReqVO {

    /**
     * 展示数量
     */
    private Long size;

}
