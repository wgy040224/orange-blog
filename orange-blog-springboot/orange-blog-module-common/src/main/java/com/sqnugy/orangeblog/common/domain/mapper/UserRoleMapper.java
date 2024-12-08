package com.sqnugy.orangeblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sqnugy.orangeblog.common.domain.dos.UserRoleDO;

import java.util.List;

/**
 * @author sqnugy
 * @version 1.0
 * @InterfaceName UserRoleMapper
 * @description
 * @date 2024-12-08
 */

public interface UserRoleMapper extends BaseMapper<UserRoleDO> {

    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    default List<UserRoleDO> selectByUsername(String username) {
        LambdaQueryWrapper<UserRoleDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UserRoleDO::getUsername, username);

        return selectList(wrapper);
    }
}

