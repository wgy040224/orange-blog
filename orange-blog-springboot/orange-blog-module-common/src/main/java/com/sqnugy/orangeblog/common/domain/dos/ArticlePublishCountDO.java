package com.sqnugy.orangeblog.common.domain.dos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName ArticlePublishCountDO
 * @description
 * @date 2024-12-13
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticlePublishCountDO {
    /**
     * 日期
     */
    private LocalDate date;

    /**
     * 文章发布数量
     */
    private Long count;
}