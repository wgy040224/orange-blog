package com.sqnugy.orangeblog.web.model.vo.article;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName FindPreNextArticleRspVO
 * @description
 * @date 2024-12-13
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindPreNextArticleRspVO {
    /**
     * 文章 ID
     */
    private Long articleId;

    /**
     * 文章标题
     */
    private String articleTitle;
}

