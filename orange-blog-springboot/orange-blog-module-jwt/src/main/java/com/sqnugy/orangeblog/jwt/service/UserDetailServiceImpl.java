package com.sqnugy.orangeblog.jwt.service;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.sqnugy.orangeblog.common.domain.dos.UserDO;
import com.sqnugy.orangeblog.common.domain.dos.UserRoleDO;
import com.sqnugy.orangeblog.common.domain.mapper.UserMapper;
import com.sqnugy.orangeblog.common.domain.mapper.UserRoleMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName UserDetailServiceImpl
 * @description 用户详情服务实现类，用于提供用户的详细信息。
 * @date 2024-12-08
 */

@Service
@Slf4j
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    /**
     * 根据用户名加载用户信息。
     * @param username 用户名
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 从数据库中查询
        UserDO userDO = userMapper.findByUsername(username);

        // 判断用户是否存在
        if (Objects.isNull(userDO)) {
            throw new UsernameNotFoundException("该用户不存在");
        }

        // 用户角色
        List<UserRoleDO> roleDOS = userRoleMapper.selectByUsername(username);

        String[] roleArr = null;

        // 转数组
        if (!CollectionUtils.isEmpty(roleDOS)) {
            List<String> roles = roleDOS.stream().map(p -> p.getRole()).collect(Collectors.toList());
            roleArr = roles.toArray(new String[roles.size()]);
        }

        // authorities 用于指定角色
        return User.withUsername(userDO.getUsername())
                .password(userDO.getPassword())
                .authorities(roleArr)
                .build();
    }
}


