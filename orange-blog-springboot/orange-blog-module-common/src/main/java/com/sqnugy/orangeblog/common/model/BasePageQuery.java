package com.sqnugy.orangeblog.common.model;

import lombok.Data;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName BasePageQuery
 * @description
 * @date 2024-12-09
 */

@Data
public class BasePageQuery {
    /**
     * 当前页码, 默认第一页
     */
    private Long current = 1L;

    /**
     * 每页展示的数据数量，默认每页展示 10 条数据
     */
    private Long size = 10L;
}

