package com.sqnugy.orangeblog.admin.service;

import com.sqnugy.orangeblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.sqnugy.orangeblog.common.utils.Response;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName AdminBlogSettingsService
 * @description
 * @date 2024-12-11
 */

public interface AdminBlogSettingsService {
    /**
     * 更新博客设置信息
     * @param updateBlogSettingsReqVO
     * @return
     */
    Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO);

    /**
     * 获取博客设置详情
     * @return
     */
    Response findDetail();
}
