package com.sqnugy.orangeblog.web.service.impl;

import com.sqnugy.orangeblog.common.domain.dos.BlogSettingsDO;
import com.sqnugy.orangeblog.common.domain.mapper.BlogSettingsMapper;
import com.sqnugy.orangeblog.common.utils.Response;
import com.sqnugy.orangeblog.web.convert.BlogSettingsConvert;
import com.sqnugy.orangeblog.web.model.vo.blogsettings.FindBlogSettingsDetailRspVO;
import com.sqnugy.orangeblog.web.service.BlogSettingsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName BlogSettingsServiceImpl
 * @description
 * @date 2024-12-12
 */

@Service
@Slf4j
public class BlogSettingsServiceImpl implements BlogSettingsService {

    @Autowired
    private BlogSettingsMapper blogSettingsMapper;

    /**
     * 获取博客设置信息
     *
     * @return
     */
    @Override
    public Response findDetail() {
        // 查询博客设置信息（约定的 ID 为 1）
        BlogSettingsDO blogSettingsDO = blogSettingsMapper.selectById(1L);
        // DO 转 VO
        FindBlogSettingsDetailRspVO vo = BlogSettingsConvert.INSTANCE.convertDO2VO(blogSettingsDO);

        return Response.success(vo);
    }
}
