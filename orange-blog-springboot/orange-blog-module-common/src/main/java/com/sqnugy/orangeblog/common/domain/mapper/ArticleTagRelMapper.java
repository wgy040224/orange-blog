package com.sqnugy.orangeblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.sqnugy.orangeblog.common.config.InsertBatchMapper;
import com.sqnugy.orangeblog.common.domain.dos.ArticleTagRelDO;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName ArticleTagRelMapper
 * @description
 * @date 2024-12-12
 */

public interface ArticleTagRelMapper extends InsertBatchMapper<ArticleTagRelDO> {

    /**
     * 根据文章 ID 删除关联记录
     * @param articleId
     * @return
     */
    default int deleteByArticleId(Long articleId) {
        return delete(Wrappers.<ArticleTagRelDO>lambdaQuery()
                .eq(ArticleTagRelDO::getArticleId, articleId));
    }
}
