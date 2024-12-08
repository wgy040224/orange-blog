package com.sqnugy.orangeblog.jwt.config;

import com.sqnugy.orangeblog.jwt.filter.JwtAuthenticationFilter;
import com.sqnugy.orangeblog.jwt.handler.RestAuthenticationFailureHandler;
import com.sqnugy.orangeblog.jwt.handler.RestAuthenticationSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName JwtAuthenticationSecurityConfig
 * @description JwtAuthenticationSecurityConfig 是一个用于配置 JWT 身份验证逻辑的安全配置类。
 * @date 2024-12-08
 */

@Configuration // 标记此类为一个配置类，Spring 将会自动检测并应用该类中的配置
public class JwtAuthenticationSecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

    /**
     * 自定义的身份验证成功处理器，用于处理用户认证成功的场景。
     */
    @Autowired
    private RestAuthenticationSuccessHandler restAuthenticationSuccessHandler;

    /**
     * 自定义的身份验证失败处理器，用于处理用户认证失败的场景。
     */
    @Autowired
    private RestAuthenticationFailureHandler restAuthenticationFailureHandler;

    /**
     * 密码编码器，用于对用户密码进行加密或解密。
     */
    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * 用户详情服务，用于加载用户特定数据。
     */
    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {
        // 自定义的用于 JWT 身份验证的过滤器
        JwtAuthenticationFilter filter = new JwtAuthenticationFilter();
        filter.setAuthenticationManager(httpSecurity.getSharedObject(AuthenticationManager.class));

        // 设置登录认证对应的处理类（成功处理、失败处理）
        filter.setAuthenticationSuccessHandler(restAuthenticationSuccessHandler);
        filter.setAuthenticationFailureHandler(restAuthenticationFailureHandler);

        // 直接使用 DaoAuthenticationProvider, 它是 Spring Security 提供的默认的身份验证提供者之一
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        // 设置 userDetailService，用于获取用户的详细信息
        provider.setUserDetailsService(userDetailsService);
        // 设置加密算法
        provider.setPasswordEncoder(passwordEncoder);
        httpSecurity.authenticationProvider(provider);
        // 将这个过滤器添加到 UsernamePasswordAuthenticationFilter 之前执行
        httpSecurity.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
    }
}

