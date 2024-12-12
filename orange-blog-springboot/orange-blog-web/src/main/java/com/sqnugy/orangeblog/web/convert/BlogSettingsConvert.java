package com.sqnugy.orangeblog.web.convert;

import com.sqnugy.orangeblog.common.domain.dos.BlogSettingsDO;
import com.sqnugy.orangeblog.web.model.vo.blogsettings.FindBlogSettingsDetailRspVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName BlogSettingsConvert
 * @description
 * @date 2024-12-12
 */

@Mapper
public interface BlogSettingsConvert {
    /**
     * 初始化 convert 实例
     */
    BlogSettingsConvert INSTANCE = Mappers.getMapper(BlogSettingsConvert.class);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindBlogSettingsDetailRspVO convertDO2VO(BlogSettingsDO bean);

}

