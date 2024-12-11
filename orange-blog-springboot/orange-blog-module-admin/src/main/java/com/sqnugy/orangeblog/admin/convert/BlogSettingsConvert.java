package com.sqnugy.orangeblog.admin.convert;

import com.sqnugy.orangeblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.sqnugy.orangeblog.common.domain.dos.BlogSettingsDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName BlogSettingsConvert
 * @description
 * @date 2024-12-11
 */

@Mapper
public interface BlogSettingsConvert {
    /**
     * 初始化 convert 实例
     */
    BlogSettingsConvert INSTANCE = Mappers.getMapper(BlogSettingsConvert.class);

    /**
     * 将 VO 转化为 DO
     * @param bean
     * @return
     */
    BlogSettingsDO convertVO2DO(UpdateBlogSettingsReqVO bean);

}
