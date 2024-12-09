package com.sqnugy.orangeblog.admin.service;

import com.sqnugy.orangeblog.admin.model.vo.user.UpdateAdminUserPasswordReqVO;
import com.sqnugy.orangeblog.common.utils.Response;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName AdminUserService
 * @description
 * @date 2024-12-09
 */

public interface AdminUserService {
    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO);

    /**
     * 获取当前登录用户信息
     * @return
     */
    Response findUserInfo();
}

