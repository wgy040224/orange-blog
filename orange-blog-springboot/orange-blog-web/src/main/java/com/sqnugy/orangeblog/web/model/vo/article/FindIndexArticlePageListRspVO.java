package com.sqnugy.orangeblog.web.model.vo.article;

import com.sqnugy.orangeblog.web.model.vo.category.FindCategoryListRspVO;
import com.sqnugy.orangeblog.web.model.vo.tag.FindTagListRspVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName FindIndexArticlePageListRspVO
 * @description
 * @date 2024-12-12
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindIndexArticlePageListRspVO {
    private Long id;
    private String cover;
    private String title;
    private LocalDateTime createTime;
    private String summary;
    /**
     * 文章分类
     */
    private FindCategoryListRspVO category;

    /**
     * 文章标签
     */
    private List<FindTagListRspVO> tags;
}
