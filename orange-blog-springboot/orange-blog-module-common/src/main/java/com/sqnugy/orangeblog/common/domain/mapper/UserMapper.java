package com.sqnugy.orangeblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sqnugy.orangeblog.common.domain.dos.UserDO;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName UserMapper
 * @description 用户数据访问层接口，提供了对 UserDO 数据对象的基本操作。
 * @date 2024-12-08
 */

public interface UserMapper extends BaseMapper<UserDO> {

    /**
     * 根据用户名查找用户信息。
     *
     * @param username 要查找的用户名
     * @return 包含指定用户名的用户信息的 UserDO 对象，如果没有找到则返回 null。
     */
    default UserDO findByUsername(String username) {
        // 使用 Lambda 表达式来构建查询条件，等价于 SQL 中的 WHERE username = ?
        LambdaQueryWrapper<UserDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UserDO::getUsername, username);
        // 执行查询并返回结果
        return selectOne(wrapper);
    }
}
