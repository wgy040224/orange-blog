package com.sqnugy.orangeblog.admin.convert;

import com.sqnugy.orangeblog.admin.model.vo.article.FindArticleDetailRspVO;
import com.sqnugy.orangeblog.common.domain.dos.ArticleDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName ArticleDetailConvert
 * @description
 * @date 2024-12-12
 */

@Mapper
public interface ArticleDetailConvert {



    /**
     * 初始化 convert 实例
     */
    ArticleDetailConvert INSTANCE = Mappers.getMapper(ArticleDetailConvert.class);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindArticleDetailRspVO convertDO2VO(ArticleDO bean);

}

