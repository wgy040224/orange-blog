package com.sqnugy.orangeblog.web.convert;

import com.sqnugy.orangeblog.common.domain.dos.ArticleDO;
import com.sqnugy.orangeblog.web.model.vo.article.FindIndexArticlePageListRspVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName ArticleConvert
 * @description
 * @date 2024-12-12
 */

@Mapper
public interface ArticleConvert {
    /**
     * 初始化 convert 实例
     */
    ArticleConvert INSTANCE = Mappers.getMapper(ArticleConvert.class);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindIndexArticlePageListRspVO convertDO2VO(ArticleDO bean);

}

